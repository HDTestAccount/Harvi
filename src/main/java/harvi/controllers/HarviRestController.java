package harvi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HarviRestController {

    @GetMapping(value = "/getLoop/{qName}")
    public String getLoopValue(@PathVariable("qName") String qName) {
        return qName;
    }

    @GetMapping(value = "/getStack/{qName}")
    public String getStackValue(@PathVariable("qName") String qName) {
        return qName;
    }

    @GetMapping(value = "/putValue/{qName}")
    public String putValue(@PathVariable("qName") String qName, @RequestParam("qValue") String qValue) {
        return String.format("qName - %s, qValue - %s", qName, qValue);
    }

}
