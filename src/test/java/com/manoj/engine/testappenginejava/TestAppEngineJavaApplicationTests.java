package com.manoj.engine.testappenginejava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class TestAppEngineJavaApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testForJavaAppEngine() throws Exception {

		MvcResult mvcResult=mockMvc.perform(get(
			"/java").contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().is(200)).andReturn();
		Assert.assertEquals("WellCome To App Engine With Java", mvcResult.getResponse().getContentAsString() );
	}

}
