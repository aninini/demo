package com.example.demo.happy;

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
        map.put("birth",randomDate());
        return map;
    }

    //随机日期
    private String randomDate(){
        Random rndYear=new Random();
        int year=rndYear.nextInt(18)+2000;
        Random rndMonth=new Random();
        int month=rndMonth.nextInt(12)+1;
        Random rndDay=new Random();
        int Day=rndDay.nextInt(30)+1;
        Random rndHour=new Random();
        int hour=rndHour.nextInt(23);
        Random rndMinute=new Random();
        int minute=rndMinute.nextInt(60);
        Random rndSecond=new Random();
        int second=rndSecond.nextInt(60);
        return year+"-"+cp(month)+"-"+cp(Day)+"  "+cp(hour)+":"+cp(minute)+":"+cp(second);
    }
    private String cp(int num){
        String Num=num+"";
        if (Num.length()==1){
            return "0"+Num;
        }else {
            return Num;
        }
    }
}
