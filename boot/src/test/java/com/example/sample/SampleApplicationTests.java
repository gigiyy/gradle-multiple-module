package com.example.sample;

import com.example.sample.account.AccountController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class SampleApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new AccountController()).build();

        mockMvc.perform(get("/accounts")).andExpect(status().isOk()).andExpect(
                jsonPath("$[0].name", equalTo("test"))
        );

    }

}
