package org.miu.appsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }
}
