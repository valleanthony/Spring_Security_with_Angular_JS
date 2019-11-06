package com.springsecurityapi.restangulardemo;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.UUID;

@RestController
@RequestMapping("/resource")
public class ItemController {


    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> hello(){
        Map<String,Object> map = new HashMap<String, Object>();
        String id = UUID.randomUUID().toString();
        map.put("id",id);
        map.put("content","Hello, From Spring");
        System.out.println(map);
        return map;
    }
}
