package org.jugbd.alapsalap.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.thymeleaf.spring4.SpringTemplateEngine
import org.thymeleaf.spring4.view.ThymeleafViewResolver
import org.thymeleaf.templateresolver.ServletContextTemplateResolver
import org.thymeleaf.templateresolver.TemplateResolver

/**
 * @author Bazlur Rahman Rokon 
 *
 * @date 2/10/15.
 */
@Configuration
class ThymeleafConfig {

    @Bean
    TemplateResolver templateResolver() {

        new ServletContextTemplateResolver(
                prefix: '/WEB-INF/views/',
                suffix: '.html',
                templateMode: 'HTML5'
        )
    }

    @Bean
    SpringTemplateEngine templateEngine() {

        new SpringTemplateEngine(templateResolver: templateResolver())
    }

    @Bean
    ThymeleafViewResolver viewResolver() {

        new ThymeleafViewResolver(
                templateEngine: templateEngine(),
                order: 1
        )
    }

}
