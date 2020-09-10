package me.whiteship.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

//    @PostMapping("/user")
//    public @ResponseBody User create(@RequestBody User user){
//        /* HttpMessageConverter
//           요청에 따라 HttpMessageConverter타입이 바뀜
//           만약 json으로 메세지를 보낸다면 JsonMessageConverter를 사용
//           HttpMessageConverter가 객체를 내보낼 떄 (User같은), 기본적으로
//           JsonMessageConverter가 사용된다.
//        */
//        return null;
//    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user){
        return user;
    }
}
