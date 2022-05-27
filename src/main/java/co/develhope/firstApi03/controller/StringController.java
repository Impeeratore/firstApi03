package co.develhope.firstApi03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StringController {

    @GetMapping("/string")
    public String getParam(@RequestParam String a, @RequestParam(required = false) String b ){
        return b != null ? a + b : a;
    }

}
