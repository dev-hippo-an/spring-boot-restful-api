package study.springbootrestfulapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping("/hello-world")
    public  String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-world-bean")
    public  HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public  HelloWorldBean helloWorldBean(@PathVariable("name") String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
