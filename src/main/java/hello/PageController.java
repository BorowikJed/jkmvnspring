package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String pageTwo() {
        return "Hi!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="myname", required=false, defaultValue="World") String name,
                           Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}