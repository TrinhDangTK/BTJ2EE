package com.example.baitap3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/home")
    public String index() {
        // Trả về tên của file template (index.html) trong thư mục templates
        return "index"; 
    }
}
