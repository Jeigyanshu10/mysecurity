package com.anshu.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

  @GetMapping("/")
  public String home(){
    return ("<h1>Welcome All</h2>");
  }

  @GetMapping("/user")
  public String user(){
    return ("<h1>Welcome User</h2>");
  }

  @GetMapping("/admin")
  public String admin(){
    return ("<h1>Welcome admin</h2>");
  }

}
