package harvi.controllers;

import harvi.App;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentLinkedQueue;

@RestController
public class HarviRestController {

    @GetMapping(value = "/getStack/{qName}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public String getLoopValue(@PathVariable("qName") String qName) {
        if (App.queueMap.containsKey(qName)) {
            ConcurrentLinkedQueue<String> dataQuel = (ConcurrentLinkedQueue<String>) App.queueMap.get(qName);
            return dataQuel.poll();
        }

        return "Queue is not exist";
    }

    @GetMapping(value = "/getLoop/{qName}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public String getStackValue(@PathVariable("qName") String qName) {
        if (App.queueMap.containsKey(qName)) {
            ConcurrentLinkedQueue<String> dataQuel = (ConcurrentLinkedQueue<String>) App.queueMap.get(qName);
            String qVall = dataQuel.poll();
            dataQuel.add(qVall);
            return qVall;
        }

        return "Queue is not exist";
    }

    @GetMapping(value = "/putValue/{qName}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public void putValue(@PathVariable("qName") String qName, @RequestParam("qValue") String qValue) {

        if (!App.queueMap.containsKey(qName)) {
            App.queueMap.put(qName, (new ConcurrentLinkedQueue<String>()));
        }
        ConcurrentLinkedQueue<String> dataQuel = (ConcurrentLinkedQueue<String>) App.queueMap.get(qName);
        dataQuel.add(qValue);
    }

}
