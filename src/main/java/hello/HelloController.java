package hello;

import domain.*;
import models.SampleModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@RestController
public class HelloController {

    private Service _service;

    public HelloController()
    {
        _service = new Service();
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/samples")
    public ArrayList<SampleModel> GetSamples()
    {
        return _service.GetModels();
    }

}