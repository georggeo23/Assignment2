package sheridan.georggeo.assignment2.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class RestConfig implements  RepositoryRestConfigurer{
        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
            config.exposeIdsFor(ArtOwner.class);
            config.exposeIdsFor(Art.class);
        }
}
