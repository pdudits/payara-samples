package fish.payara.samples;

import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

public class Libraries {
    
    public static JavaArchive[] awaitability() {
        return Maven.resolver()
                .loadPomFromFile("pom.xml")
                .resolve("com.jayway.awaitility:awaitility")
                .withTransitivity()
                .as(JavaArchive.class);
    }

}
