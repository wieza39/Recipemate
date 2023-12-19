package pjwstk.receipemate.app.controller.recipe;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest
class RecipeControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldGetSingleRecipe() throws Exception {
        // given
        // when
        MvcResult mvcResult = mockMvc.perform(get("/recipe/1"))
                .andExpect(status().is(200))
                .andReturn();
        RecipeDetailedView recipe = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), RecipeDetailedView.class);

        // then
        assertThat(recipe).isNotNull();
        assertThat(recipe.getId()).isEqualTo(1);
    }

    @Test
    void shouldThrowNotFoundException() throws Exception {
        // given
        // when
        // then
        mockMvc.perform(get("/recipe/{id}", 0).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(result -> assertTrue(result.getResolvedException() instanceof NotFoundException))
                .andExpect(result -> assertEquals(
                        "Recipe not found!",
                        Objects.requireNonNull(result.getResolvedException()).getMessage()
                ));
    }
}