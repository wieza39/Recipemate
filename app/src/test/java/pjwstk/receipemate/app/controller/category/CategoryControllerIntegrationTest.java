package pjwstk.receipemate.app.controller.category;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.repository.category.CategoryRepository;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.view.page.PageView;
import pjwstk.receipemate.app.viewfactory.page.PageViewFactory;
import pjwstk.receipemate.app.viewrepository.category.CategoryViewRepository;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategoryViewRepository categoryViewRepository;

    @MockBean
    private CategoryRepository categoryRepository;

    @MockBean
    private PageViewFactory pageViewFactory;

    @Test
    public void shouldReturnPageViewOfCategoryView() throws Exception {
        // Given
        Pageable pageable = PageRequest.of(0, 12);

        Category category1 = new Category();
        category1.setId(0);

        Category category2 = new Category();
        category2.setId(1);

        Category category3 = new Category();
        category3.setId(2);

        List<Category> categoryList = List.of(category1, category2, category3);

        Page<Category> categoryPage = new PageImpl<>(categoryList);
        when(categoryRepository.getWithRecipes(pageable)).thenReturn(categoryPage);

        List<CategoryView> categoryViewsList = List.of(
                new CategoryView(),
                new CategoryView(),
                new CategoryView()
        );

        PageView expectedPageView = new PageView();
        expectedPageView.setPageNumber(categoryPage.getNumber());
        expectedPageView.setPageSize(categoryPage.getSize());
        expectedPageView.setTotalElements(categoryPage.getTotalElements());
        expectedPageView.setTotalPages(categoryPage.getTotalPages());
        expectedPageView.setItems(categoryViewsList);

        when(this.pageViewFactory.make(categoryPage, categoryViewsList)).thenReturn(expectedPageView);
        when(categoryViewRepository.getList(pageable)).thenReturn(expectedPageView);

        // Then
        mockMvc.perform(get("/category"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.items", hasSize(3)))
                .andExpect(jsonPath("$.totalElements").value(3))
                .andExpect(jsonPath("$.totalPages").value(1))
                .andExpect(jsonPath("$.pageNumber").value(0))
                .andExpect(jsonPath("$.items").isArray())
                .andExpect(jsonPath("$.items[0]").exists())
                .andExpect(jsonPath("$.items[0].id").exists());
    }

}
