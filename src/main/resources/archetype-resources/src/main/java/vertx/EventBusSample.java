package ${package}.vertx;

import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import com.google.inject.Inject;

public class EventBusSample {
    
    private final EventBus eventBus;
    
    @Inject
    public EventBusSample(EventBus eventBus) {
        this.eventBus = eventBus;
    }
    
    public void init() {
        eventBus.consumer("eventBusName", (Message<String> event) -> {
            event.reply("Thank you for message: " + event.body());
        });
    }
}
