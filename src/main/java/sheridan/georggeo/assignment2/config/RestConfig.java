package sheridan.georggeo.assignment2.config;

import sheridan.georggeo.assignment2.data.jpa.Art;
import sheridan.georggeo.assignment2.data.jpa.ArtOwner;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.stereotype.Component;

@Component
public class RestConfig implements  RepositoryRestConfigurer{
        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
            config.exposeIdsFor(ArtOwner.class);
            config.exposeIdsFor(Art.class);
        }
}
