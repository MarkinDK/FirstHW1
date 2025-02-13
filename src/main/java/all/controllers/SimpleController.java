package all.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping(value = "/hello")
    public String hello() {
        String hello = "Hello World ";
        String version = "Version NEW!!!";
        return hello + version;
    }
}
