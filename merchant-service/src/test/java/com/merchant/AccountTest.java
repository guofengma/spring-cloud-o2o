package com.merchant;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jettison.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;
//import com.merchant.dao.MerchantsSupplierMapper;

/**
 * 测试应用
 * @author luoqw
 * 2016-9-8下午1:13:03
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MerchantServiceApplication.class)
//@WebIntegrationTest("server.port:0")
public class AccountTest {
//	@Autowired
//	private WebApplicationContext context; 
//	@Value("${local.server.port}")
//	private int port;
//
//	private MockMvc mockMvc;
//	@Autowired
//	private RestTemplate restTemplate;//  = new TestRestTemplate();
//
//	@Before
//	public void setupMockMvc() {
//		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//	}
	
	
//	@Test
//	public void validation() throws JSONException {
//		String url = "http://localhost:" + port + "/account/validation";
//		int id = 2;
//		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
//		Map<String, String> form = new HashMap<String, String>();
//		form.put("account", "admin_5");
//		form.put("password", "1267d#%^&&*_5");
//		bodyMap.setAll(form);
//		String result = restTemplate.postForObject(url, bodyMap, String.class);
//		System.out.println("result= " + result);
//	}

	
	/*	
	
	@Test
	public void get() throws JSONException {
		String url = "http://localhost:" + port + "/account/has";
		int id = 2;
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		Map<String, String> form = new HashMap<String, String>();
		form.put("account", "admin");
		bodyMap.setAll(form);
		String result = restTemplate.postForObject(url, bodyMap, String.class);
		System.out.println("result= " + result);
	}
*/	
/*	
	@Test
	public void get() throws JSONException {
		String url = "http://localhost:" + port + "/account/get";
		int id = 2;
		String result = restTemplate.getForObject(url+"?id="+id, String.class);
		System.out.println("result= " + result);
		//restTemplate post map参数传输
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		Map<String, String> form = new HashMap<String, String>();
		form.put("id", "4");
		bodyMap.setAll(form);
		String result = restTemplate.postForObject(url, bodyMap, String.class);
		System.out.println("result= " + result);
	}
	
*/	
	/*
	@Test
	public void update() throws JSONException {
		String url = "http://localhost:" + port + "/mp/update";
		//restTemplate post map参数传输
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		Map<String, String> form = new HashMap<String, String>();

		form.put("id", "4");
		form.put("wxGh", "gh_00005");
		form.put("wxAppId", "wx_hdjcbj900004");
		form.put("wxAppSecret", "78798jhdbjcbscidjbjdbvojhx444");
		form.put("wxMerchantsNo", "88000004");
		form.put("wxMerchantsKey", "8789jcncidmme44cmcmdickdnkdnck4");
		form.put("wxName", "电店盟5");
		form.put("useStatus", "0");
		
		bodyMap.setAll(form);
		String result = restTemplate.postForObject(url, bodyMap, String.class);
		System.out.println("result= " + result);
	}*/
	
	/*
	@Test
	public void list() throws JSONException {
		String url = "http://localhost:" + port + "/account/list";
		String result = "";
		
		//restTemplate post 写入流的方式
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());

		JSONObject form = new JSONObject();
		JSONObject queryConditions = new JSONObject();
		form.put("offset", "0"); 
		form.put("pageSize", "2"); 
		queryConditions.put("account", "1");
//		queryConditions.put("accountType", "0");
		form.put("queryConditions", queryConditions);
		
		HttpEntity<String> formEntity = new HttpEntity<String>(form.toString(), headers);
		result = restTemplate.postForObject(url, formEntity, String.class);
		
		System.out.println("result= " + result);
	}*/
	
	/*
	@Test
	public void update() throws JSONException {
		String url = "http://localhost:" + port + "/account/update";
		//restTemplate post map参数传输
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		Map<String, String> form = new HashMap<String, String>();
		form.put("id", "");
		form.put("account", "admin_5");
		form.put("account", "admin_5");
		form.put("password", "1267d#%^&&*_5");
		form.put("useStatus", "5");
		form.put("allowCount", "5");
		form.put("passKeyword", "888_5");
		form.put("accountType", "5"); 
		
		bodyMap.setAll(form);
		String result = restTemplate.postForObject(url, bodyMap, String.class);
		System.out.println("result= " + result);
	}*/
	
	
	/*
	@Test
	public void addMpTest() throws JSONException {
		String url = "http://localhost:" + port + "/account/add";
		//restTemplate post map参数传输
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		Map<String, String> form = new HashMap<String, String>();
		form.put("account", "admin_3");
		form.put("password", "1267d#%^&&*_3");
		form.put("useStatus", "1");
		form.put("allowCount", "3");
		form.put("passKeyword", "888_3");
		form.put("accountType", "1"); 
		
		bodyMap.setAll(form);
		String result = restTemplate.postForObject(url, bodyMap, String.class);
		System.out.println("result= " + result);
	}*/ 

	
	
}
	
	
	
