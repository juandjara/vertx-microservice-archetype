package ${packageName}.vertx;

import com.google.inject.Guice;
import ${packageName}.guice.GuiceModule;
import io.vertx.core.AbstractVerticle;
import lombok.extern.java.Log;

@Log
public class MicroserviceVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        //Binds all dependencies to already initialized vertx instance
        Guice.createInjector(new GuiceModule(vertx)).injectMembers(this);
        log.info("MicroserviceVerticle started");
    }
}
