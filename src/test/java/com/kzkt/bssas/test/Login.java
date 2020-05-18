package com.kzkt.bssas.test;

import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.kzkt.bssas.BssasApplication;
import com.kzkt.bssas.common.Base;
import com.kzkt.bssas.common.EnumP;
import com.kzkt.bssas.common.LoginProvider;
import com.kzkt.bssas.common.PlatformType;
import com.kzkt.bssas.model.MelotResult;
import com.kzkt.bssas.model.OrgLoginUser;
import com.kzkt.bssas.model.UserResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;


import java.util.Arrays;

public class Login {

    /**
     * 返回登录信息-登录bsaas
     * @return
     */
    @Value("${qa.url}")
    private String qaUrl;

    @Test(dataProvider = "loginUserInfo",dataProviderClass = LoginProvider.class)
    public void get_user_params(OrgLoginUser orgLoginUser) {
        System.out.println("111111");
        String url = qaUrl+"loginByUsername";
        String pValue = String.valueOf(EnumP.WEB.getP());
        String platform = String.valueOf(PlatformType.BSAAS.getPlatformType());
//        Map<String, Object> map =new HashMap<>();
//        map.put("username",orgLoginUser.getUsername());
//        map.put("password",orgLoginUser.getPassword());
//        map.put("platformTypes",platform);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("p",pValue);
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.put("username", Arrays.asList(orgLoginUser.getUsername()));
        params.put("password", Arrays.asList(orgLoginUser.getPassword()));
        params.put("platformTypes",Arrays.asList(platform));
        HttpEntity entity = new HttpEntity<>(params,headers);
        ParameterizedTypeReference<MelotResult<UserResult>> reference = new ParameterizedTypeReference<MelotResult<UserResult>>() {
        };
        //fixme:静态的restTemplate
//        ResponseEntity<MelotResult<UserResult>> responseEntity = .exchange(url, HttpMethod.POST,entity, reference);
//        System.out.println(responseEntity.getBody());
//        System.out.println(responseEntity.getHeaders());
//        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
//        Assert.assertTrue(responseEntity.getBody().isSuccess());
    }

}
