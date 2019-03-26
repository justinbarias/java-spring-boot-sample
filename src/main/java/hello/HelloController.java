package hello;

import domain.*;
import models.SampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@RestController
public class HelloController {
    @Autowired
    private IService _modelService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/samples")
    public ArrayList<SampleModel> GetSamples()
    {
        return _modelService.GetModels();
    }

}