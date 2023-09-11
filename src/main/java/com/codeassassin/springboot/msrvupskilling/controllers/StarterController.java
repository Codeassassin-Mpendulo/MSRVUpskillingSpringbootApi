package com.codeassassin.springboot.msrvupskilling.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {

    @GetMapping("/starter_controller/get_request")
    public ResponseEntity<Object> basicGetEndpoint(){
        return ResponseEntity.ok().body("HelloWorld");
    }

    @PostMapping("/starter_controller/post_request")
    public ResponseEntity<String> basicPostEndpoint(@RequestBody String request){
        return ResponseEntity.ok().body(request);
    }
}
