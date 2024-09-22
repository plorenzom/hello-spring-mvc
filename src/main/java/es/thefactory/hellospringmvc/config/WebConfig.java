package es.thefactory.hellospringmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Pablo Lorenzo Manzano.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "es.thefactory.hellospringmvc.web")
public class WebConfig implements WebMvcConfigurer {
    
    /**
     *
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
}
