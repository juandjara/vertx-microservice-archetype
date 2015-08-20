package ${package}.vertx;

import com.google.inject.Guice;
import com.google.inject.Inject;
import ${package}.guice.GuiceModule;
import io.vertx.core.AbstractVerticle;
import lombok.extern.java.Log;

@Log
public class MicroserviceVerticle extends AbstractVerticle {
    
    @Inject
    private EventBusSample eventBusSample;

    @Override
    public void start() throws Exception {
        //Binds all dependencies to already initialized vertx instance
        Guice.createInjector(new GuiceModule(vertx)).injectMembers(this);
        
        eventBusSample.init();
        
        log.info("MicroserviceVerticle started");
    }
}
