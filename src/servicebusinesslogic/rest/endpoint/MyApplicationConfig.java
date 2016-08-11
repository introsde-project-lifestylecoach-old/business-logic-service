package servicebusinesslogic.rest.endpoint;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("business-logic-service")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("servicebusinesslogic.rest.endpoint");
    }
}
