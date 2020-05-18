package com.kzkt.bssas.common;


import com.kzkt.bssas.BssasApplication;
import lombok.Data;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.*;


@SpringBootTest(classes = BssasApplication.class)
public class Base extends AbstractTestNGSpringContextTests {

    private static RestTemplate restTemplate;

    @BeforeSuite
    public static RestTemplate getRestTemplate(){
//        restTemplate = new RestTemplate();
        System.out.println("111111111111");
        return restTemplate = new RestTemplate();
    }

}
