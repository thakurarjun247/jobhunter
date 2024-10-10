package jobhunter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SGNController {
    @RequestMapping("/")
    public String home() {
        return "SGN";
    }

    @RequestMapping("/SGN")
    public String echo() {
        return "JSG";
    }
}
