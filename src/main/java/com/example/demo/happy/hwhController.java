package com.example.demo.happy;

import com.example.demo.util.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//娱乐专用
@RequestMapping("/")
@RestController
public class hwhController {
    @GetMapping("hwh")
    public Map<String,String> getUser() {
        String [] a=new String[]{"男","女"};
        HashMap<String, String> map = new HashMap<>();
        map.put("name","韩文豪");
        map.put("sex",a[new Random().nextInt(a.length)]);
        map.put("birth", DateUtil.randomDate());
        return map;
    }

}
