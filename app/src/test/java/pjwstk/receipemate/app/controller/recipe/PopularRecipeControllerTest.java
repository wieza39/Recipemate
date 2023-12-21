package pjwstk.receipemate.app.controller.recipe;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.view.recipe.RecipeView;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class PopularRecipeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    @Test
    void shouldGetPopularRecipes() throws Exception {
        // given
        // when
        MvcResult mvcResult = mockMvc.perform(get("/recipe/popular"))
                .andExpect(status().is(200))
                .andReturn();
        PageView pageView = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PageView.class);

        // then
        assertThat(pageView).isNotNull();
        assertThat(pageView).isInstanceOf(PageView.class);
        assertThat(pageView.getItems()).isNotEmpty();
        assertThat(pageView.getItems()).isInstanceOf(List.class);
        assertThat(pageView.getItems().get(0)).isNotNull();
    }

    @Test
    void shouldThrowNotFoundException() throws Exception {
        // given
        // when
        // then
        mockMvc.perform(get("/recipe/popular?pageNumber=2").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(result -> assertTrue(result.getResolvedException() instanceof NotFoundException))
                .andExpect(result -> assertEquals(
                        "Recipes not found!",
                        Objects.requireNonNull(result.getResolvedException()).getMessage()
                ));
    }
}