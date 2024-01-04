package pjwstk.receipemate.app.viewrepository.category;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.repository.category.CategoryRepository;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.view.page.PageView;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;
import pjwstk.receipemate.app.viewfactory.page.PageViewFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CategoryViewRepositoryUnitTest {

    @Mock
    CategoryRepository categoryRepositoryMock;

    @Mock
    CategoryViewFactory categoryViewFactoryMock;

    @Mock
    PageViewFactory pageViewFactoryMock;

    @InjectMocks
    CategoryViewRepository categoryViewRepository;


    @Test
    public void getList_shouldReturnPageViewOfCategories() {
        //given
        Pageable pageable = Pageable.unpaged();
        List<Category> categories = new ArrayList<>();
        Category category1 = new Category();
        Category category2 = new Category();
        category1.setId(1);
        category2.setId(2);
        categories.add(category1);
        categories.add(category2);

        //when
        Page<Category> categoryPage = new PageImpl<>(categories);
        when(this.categoryRepositoryMock.getWithRecipes(pageable)).thenReturn(categoryPage);

        List<CategoryView> categoriesViews = List.of(new CategoryView(), new CategoryView());
        when(this.categoryViewFactoryMock.makeList(categories)).thenReturn(categoriesViews);

        PageView expectedPageView = new PageView();
        when(this.pageViewFactoryMock.make(categoryPage, categoriesViews)).thenReturn(expectedPageView);

        PageView result = this.categoryViewRepository.getList(pageable);
        //then
        assertThat(result, is(expectedPageView));
    }

    @Test
    public void getList_shouldThrowNotFoundException() {
        //given
        Pageable pageable = Pageable.unpaged();
        Page<Category> emptyCategoryPage = new PageImpl<>(Collections.emptyList());
        when(categoryRepositoryMock.getWithRecipes(pageable)).thenReturn(emptyCategoryPage);

        //when&then
        NotFoundException exception = assertThrows(NotFoundException.class, () -> { this.categoryViewRepository.getList(pageable);
        });
        assertEquals("Categories not found", exception.getMessage());

    }

}
