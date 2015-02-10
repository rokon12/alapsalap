package org.jugbd.alapsalap.web

import org.springframework.boot.Banner
import org.springframework.security.access.annotation.Secured
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import static groovy.lang.GroovySystem.version

/**
 * @author Bazlur Rahman Rokon 
 *
 * @date 2/10/15.
 */
@Controller
@Secured("ROLE_ANONYMOUS")
class HomeController {

    @RequestMapping("/")
    def home() {
        new ModelAndView(
                "home",
                [bootVersion  : Banner.package.implementationVersion,
                 groovyVersion: version]
        )
    }
}
