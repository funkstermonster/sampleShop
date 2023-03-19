package controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @GetMapping
    private List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
