package pjwstk.receipemate.app.repository.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import pjwstk.receipemate.app.entity.Category;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CategoryRepositoryUnitTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void getWithRecipes() {
        //given
        //data in test_database
        //when
        Page<Category> result = categoryRepository.getWithRecipes(PageRequest.of(0,5));

        //then
        assertNotNull(result);
        assertFalse(result.getContent().isEmpty());
    }
}
