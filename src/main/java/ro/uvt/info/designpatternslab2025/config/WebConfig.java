package ro.uvt.info.designpatternslab2025.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ro.uvt.info.designpatternslab2025.filters.RequestLoggingFilter;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private RequestLoggingFilter requestLoggingFilter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestLoggingFilter);
    }
}

