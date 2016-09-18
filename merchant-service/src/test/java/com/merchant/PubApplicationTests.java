package com.merchant;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
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

//import com.merchant.dao.MerchantsAccountMapper;
//import com.merchant.dto.MerchantsAccountCheckResDto;

/**
 * 测试应用
 * @author luoqw
 * 2016-9-8下午1:13:03
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MerchantServiceApplication.class)
//@WebIntegrationTest("server.port:0")
public class PubApplicationTests {
//	@Autowired
//	private WebApplicationContext context; 
//	@Autowired
//	private MerchantsAccountMapper accountMapper;
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

	/*@Test
	public void accountCount() {
		System.out.println("数量：" + accountMapper.countByAccount("user1"));
		// assertEquals(1, accountMapper.countByAccount("user1"));
	}

	@Test
	public void webappBookIsbnApi() throws JSONException {
		String url = "http://localhost:" + port + "/account/has";
		String result = "";
		 
		//restTemplate get方式调用
		result = restTemplate.getForObject(url, String.class);
		System.out.println("result= " + result);
		
		//restTemplate post map参数传输
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("account", "user1");
		bodyMap.setAll(vars);
		result = restTemplate.postForObject(url, bodyMap, String.class);
		 
		
		//restTemplate post 写入流的方式
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("account", "user1"); 
		HttpEntity<String> formEntity = new HttpEntity<String>(jsonObj.toString(), headers);
		result = restTemplate.postForObject(url, formEntity, String.class);
		
		MerchantsAccountCheckResDto dto = restTemplate.postForObject(url, bodyMap, MerchantsAccountCheckResDto.class);
		System.out.println("resultType= " + dto.getResultType());
	}*/

	
	
}
	
	
	
