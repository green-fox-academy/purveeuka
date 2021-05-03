package com.greenfox.backendapi.controllers;
import com.greenfox.backendapi.models.*;
import com.greenfox.backendapi.models.Appendable;
import com.greenfox.backendapi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private final DoublingService doublingService;
    private final GreeterService greeterService;
    private final DoUntilService doUntilService;
    private final ArrayHandlerService  arrayHandlerService;
    private final LogService logService;
    private final SithService sithService;


    @Autowired
    public MainController(DoublingService doublingService, GreeterService greeterService, DoUntilService doUntilService, ArrayHandlerService arrayHandlerService, LogService logService, SithService sithService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.doUntilService = doUntilService;
        this.arrayHandlerService = arrayHandlerService;
        this.logService = logService;
        this.sithService = sithService;
    }

    @GetMapping("/")
    public String home(){

        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity<?>doubleInput(@RequestParam(value = "input",required = false) Integer input ) {
            if (input != null) {
                doublingService.doubling(input);
                logService.log("/doubling", "input=" + input);
                return  new ResponseEntity<>(new Doubling(input, doublingService.doubling(input)), HttpStatus.OK);
            } else {
                logService.log("/doubling", "input=" + input);
                return new ResponseEntity<>(new ErrorDoubling("Please provide an input!"), HttpStatus.OK);
            }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?>greet(@RequestParam(value = "name",required = false) String name,
                                  @RequestParam(value = "title", required = false) String title) {
        if (name == null && title == null) {
            logService.log("/greeter","name=" + name  + ", title=" + title);
            return new ResponseEntity<>(new ErrorGreeter("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
        } else if (title == null) {
            logService.log("/greeter","name=" + name  + ", title=" + title);
            return new ResponseEntity<>(new ErrorGreeter("Please provide a title!"), HttpStatus.BAD_REQUEST);
        } else if (name == null) {
            logService.log("/greeter","name=" + name  + ", title=" + title);
            return new ResponseEntity<>(new ErrorGreeter("Please provide a name!"), HttpStatus.BAD_REQUEST);
        }
        logService.log("/greeter","name=" + name  + ", title=" + title);
        return new ResponseEntity<>(greeterService.greetingSms(name, title), HttpStatus.OK);
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appendA(@PathVariable(value = "appendable") String appendable){
        if (appendable == null) {
            logService.log("/appenda/" + appendable, "appendable=" + appendable);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        logService.log("/appenda/" + appendable, "appendable=" + appendable);
        return new ResponseEntity<>(new Appendable(appendable + "a"), HttpStatus.OK);
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable(value = "action", required = false)String action, @RequestBody DoUntil doUntil) {
        if (action.equals("sum")) {
            var result = doUntilService.Sum(doUntil.getUntil());
            logService.log("/dountil/" + action, "until=" + doUntil.getUntil());
            return new ResponseEntity<>(new DoUntilResult(result), HttpStatus.OK);
        } else if (action.equals("factor")) {
            var result = doUntilService.Factorial(doUntil.getUntil());
            logService.log("/dountil/" + action, "until=" + doUntil.getUntil());
            return new ResponseEntity<>(new DoUntilResult(result), HttpStatus.OK);
        } else if (doUntil == null) {
            logService.log("/dountil/" + action, "until=" + doUntil.getUntil());
            return new ResponseEntity<>(new ErrorDoubling("Please provide a number!"), HttpStatus.BAD_REQUEST);
        }
        return null;
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrayHandler(@RequestBody ArrayHandler arrayHandler){
        switch (arrayHandler.getWhat()) {
            case "sum": {
                var result = arrayHandlerService.sum(arrayHandler.getNumbers());
                logService.log("/arrays", arrayHandler.toString());
                return new ResponseEntity<>(new ArrayHandlerResult(result), HttpStatus.OK);
            }
            case "multiply": {
                var result = arrayHandlerService.multiply(arrayHandler.getNumbers());
                logService.log("/arrays", arrayHandler.toString());
                return new ResponseEntity<>(new ArrayHandlerResult(result), HttpStatus.OK);
            }
            case "double": {
                var result = arrayHandlerService.doubling(arrayHandler.getNumbers());
                logService.log("/arrays", arrayHandler.toString());
                return new ResponseEntity<>(new ArrHandlerResultInArr(result), HttpStatus.OK);
            }
        }
        logService.log("/arrays", arrayHandler.toString());
        return new ResponseEntity<>(new ErrorDoubling("Please provide what to do with the numbers!"), HttpStatus.OK);
    }

    @GetMapping("/log")
    public ResponseEntity<?> log(@RequestParam(required = false, defaultValue = "10") int count,
                                 @RequestParam(required = false, defaultValue = "1") int page,
                                 @RequestParam(required = false, defaultValue = "") String q) {
        return logService.getLog(page, count, q);
    }

    @PostMapping("/sith")
    public ResponseEntity<?> reverseSith(@RequestBody Sith sith) {
        if (sith.getText() != null) {
            SithText sithText = new SithText();
            sithText.setSith_text(sithService.reverseSith(sith).toString());
            logService.log("/sith", sith.toString());
            return ResponseEntity.ok(sithText);

        }
        logService.log("/sith", sith.toString());
        return new ResponseEntity<>(new ErrorDoubling("Feed me some text you have to, padawan young you are. Hmmm."), HttpStatus.BAD_REQUEST);
    }



}
