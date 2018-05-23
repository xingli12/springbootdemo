package controller;

import controller.model.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
@RestController
@SpringBootApplication
public class SampleController {

    @Autowired
    private AuthorSettings authorSettings;
    @RequestMapping("/")
    String home() {
        return "Hello World! " + authorSettings.getName() + " " + authorSettings.getAge();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}