package pjwstk.receipemate.app.repository.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import pjwstk.receipemate.app.entity.Category;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class CategoryRepositoryUnitTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void shouldGetWithRecipesMethodReturnEmptyContent() {
        //when
        Page<Category> result = categoryRepository.getWithRecipes(PageRequest.of(0,5));

        //then
        assertThat(result.getContent().isEmpty()).isTrue();
    }
}
