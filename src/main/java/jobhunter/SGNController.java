package jobhunter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class SGNController {
    @RequestMapping("/")
    public String home() {


        return
               "SGN "+ LocalDateTime.now();
    }

    @RequestMapping("/SGN")
    public String echo() {
        return "JSG";
    }
}
