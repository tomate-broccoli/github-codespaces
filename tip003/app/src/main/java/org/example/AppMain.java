/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppMain {

  public static void main(String[] args){
    SpringApplication.run(AppMain.class, args); 
  }

  @RequestMapping("/tip003")
  String home(){
    return "Hello, World!";
  }
 
}
