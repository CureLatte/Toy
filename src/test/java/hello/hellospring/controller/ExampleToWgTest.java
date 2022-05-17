package hello.hellospring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(Example_to_wg.class)
public class ExampleToWgTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void url_example_1_is_correct() throws Exception{
        // Given

        // When

        // Then
        mvc.perform(get("/example")).andExpect(MockMvcResultMatchers.status().isOk());
    }


}
