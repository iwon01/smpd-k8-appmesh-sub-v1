package com.smpd.appmeshsubv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppmeshSubV1Application {

    @GetMapping
    public Response response(){
        return new Response();
    }

    public static void main(String[] args) {
        SpringApplication.run(AppmeshSubV1Application.class, args);
    }

}
