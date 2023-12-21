package pjwstk.receipemate.app.controller.recipe;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class RecipeControllerGetByPhraseTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldGetRecipesByPhrase() throws Exception {
        // given
        String phrase = "Spaghetti";
        // when
        MvcResult mvcResult = mockMvc.perform(get("/recipe/search?phrase=" + phrase))
                .andExpect(status().is(200))
                .andReturn();
        PageView pageView = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PageView.class);

        // then
        assertThat(pageView).isNotNull();
        assertThat(pageView.getItems()).isNotEmpty();
        assertThat(pageView.getItems().size()).isEqualTo(1);
        assertThat(pageView.getItems().get(0)).isNotNull();
    }

    @Test
    void shouldThrowNotFoundException() throws Exception {
        // given
        String phrase = "xxxxxxxxxxx";
        // when
        // then
        mockMvc.perform(get("/recipe/search?phrase=" + phrase).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(result -> assertTrue(result.getResolvedException() instanceof NotFoundException))
                .andExpect(result -> assertEquals(
                        "Recipes not found!",
                        Objects.requireNonNull(result.getResolvedException()).getMessage()
                ));
    }
}