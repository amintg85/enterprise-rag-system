package com.amintg.rag;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RagApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void applicationContextStarts() {
    }

    @Test
    void queryEndpointReturnsItsCurrentPrototypeResponse() throws Exception {
        mockMvc.perform(get("/api/rag/query").param("q", "incident response"))
            .andExpect(status().isOk())
            .andExpect(content().string("Answer: incident response"));
    }
}