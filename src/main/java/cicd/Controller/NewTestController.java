package cicd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewTestController {

	
	//
    @GetMapping("/welcome")
    public String sayHello() {
        return "welcome to EC2!";
    }
}
