package com.kzkt.bssas.test;

import com.kzkt.bssas.common.LoginProvider;
import com.kzkt.bssas.common.Base;
import com.kzkt.bssas.model.MelotResult;
import com.kzkt.bssas.model.Student;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TestStudent extends Base {

//    @Test(dataProvider = "student",dataProviderClass = LoginProvider.class )
//    public void addStudent(Student student) {
//        String url = "super.getQa()" + "org/student/create";
//        Map<String,Object> map = new HashMap<>();
//        map.put("personName",student.getPersonName());
//        map.put("mobile",student.getMobile());
//        HttpEntity<Map<String,Object>> httpEntity = new HttpEntity<>(map);
//        ResponseEntity<MelotResult> entity = super.getRestTemplate().postForEntity(url, httpEntity,MelotResult.class);
////        Assert.assertTrue(entity.getStatusCode().is2xxSuccessful());
//        System.out.println(entity.getBody().isSuccess());
//        System.out.println(entity.getBody().getErrorCode());
//    }

    @Test
    public void aaa(){
        RestTemplate restTemplate = getRestTemplate();
        System.out.println(restTemplate);

        RestTemplate restTemplate1 = getRestTemplate();
        System.out.println(restTemplate1);
    }

}
