package com.sajtos.Bead3;

import com.sajtos.Bead3.restservice.Greeting;
import com.sajtos.Bead3.restservice.Reverser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    private static final String TEMPLATE = "Hello %s!";

    @GetMapping("/harmadik")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Felhasznalo") String name) {
        return new Greeting(String.format(TEMPLATE, name));
    }

    @PostMapping("/harmadik")
    public Reverser reverser(@RequestParam(value = "text", defaultValue = "Alma a fa alatt") String inputText) {
        return new Reverser(inputText);
    }


}
