package com.example.remoteapisfromourownApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football")
public class FootBallController {


    // we have changed the local host port to 9999,, in the , resources --> application.properties
    @GetMapping("/madrid")
    public String getRealMadrid(){
        return "Ronaldo";
    }
}
