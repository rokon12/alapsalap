package org.jugbd.alapsalap.web

import org.springframework.security.access.annotation.Secured
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * @author Bazlur Rahman Rokon 
 *
 * @since 2/11/15.
 */

@Controller
@Secured(Array("ROLE_ANONYMOUS"))
class UserController {

  @RequestMapping(Array("/users"))
  def index(model: Model) = {

    val message = "Spring boot with Scala"
    model.addAttribute("message", message)

    new ModelAndView("users")
  }
}
