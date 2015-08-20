package ${package}.vertx;

import io.vertx.core.AsyncResult;
import io.vertx.core.eventbus.Message;

import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(VertxUnitRunner.class)
public class EventBusSampleTest {

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @Before
    public void deployVerticle(TestContext context) {
        rule.vertx().deployVerticle(new MicroserviceVerticle(), context.asyncAssertSuccess());
    }

    @Test
    public void will_receive_message_and_response(TestContext context) {
        Async async = context.async();
        rule.vertx().eventBus().send("eventBusName", "Hello Verticle", (AsyncResult<Message<String>> response) -> {

            context.assertEquals(response.result().body(), "Thank you for message: Hello Verticle", "Response status should be");
            async.complete();
        });
    }
}
