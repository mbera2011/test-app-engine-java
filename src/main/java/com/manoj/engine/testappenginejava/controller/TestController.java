package com.manoj.engine.testappenginejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestController {

  @GetMapping(value = "java", produces = "application/hal+json")
  public String testMethod(){
    return "WellCome To App Engine With Java 8";
  }
}
