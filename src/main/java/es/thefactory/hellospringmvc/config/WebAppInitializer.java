package es.thefactory.hellospringmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Pablo Lorenzo Manzano.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    /**
     *
     * @return Class<?>[]
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
    
    /**
     *
     * @return Class<?>[]
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return (new Class<?>[] {WebConfig.class});
    }
    
    /**
     *
     * @return String[]
     */
    @Override
    protected String[] getServletMappings() {
        return (new String[] {"/"});
    }
}
