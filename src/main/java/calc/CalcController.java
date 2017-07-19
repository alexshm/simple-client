package calc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by ashmaltsuev on 19/07/17.
 */

@RestController
public class CalcController {

    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    public int sumXandY(@RequestBody Map<String, Integer> json) throws Exception {
        if(json.containsKey("x") && json.containsKey("y")) {
            return json.get("x") + json.get("y");
        }else{
            throw new IllegalArgumentException("one of the argument is incorrect");
        }
    }
}
