package all.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping(value = "/hello")
    public String hello() {
        String hello = "Hello World\n";
        String version = "Version the most newest eva";
        return hello + version;
    }
}
