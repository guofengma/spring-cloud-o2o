package com.icloud;

import java.io.IOException;
 


import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

//import com.icloud.dao.CloudEventMapper;
//import com.icloud.service.MerchantsMpService;

/**
 * 测试应用
 * @author luoqw
 * 2016-9-8下午1:13:03
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = RibbonApplication.class)
//@WebIntegrationTest("server.port:0")
public class ApplicationTests {/*
 
//
	@Value("${local.server.port}")
	private int port;
 
	@Autowired
	private RestTemplate restTemplate = new TestRestTemplate();
 
	@Test
	public void mpDisable() {
		String result = new TestRestTemplate().getForObject("http://localhost:4004/api-ribbon/mp/add?data={%27wxGh:gh_0021,%27wxAppId%27:%27wx_hdjcbj900003%27,%27wxAppSecret%27:%2778798jhdbjcbscidjbjdbvojhxaok#$','wxMerchantsNo':'88000003','wxMerchantsKey':'8789jcncidmme44cmcmdickdnkdnckd','wxName':'电店盟3'}", String.class);
		System.out.println(result);
	}
 
	
	
*/}
	
	
	
