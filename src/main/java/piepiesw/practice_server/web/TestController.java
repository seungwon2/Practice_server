package piepiesw.practice_server.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import piepiesw.practice_server.web.dto.TestResponseDto;

@RestController
public class TestController {


    @GetMapping("/test")
    public String hello() {
        return "hello";
    }

    @GetMapping("/test/dto")
    public TestResponseDto testResponseDto(@RequestParam("name") String name,
                                           @RequestParam("amount") int amount) {
       name ="toto";
       amount = 1000;
        return new TestResponseDto(name, amount);
    }
}
