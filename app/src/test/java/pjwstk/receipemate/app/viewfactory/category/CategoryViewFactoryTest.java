package pjwstk.receipemate.app.viewfactory.category;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pjwstk.receipemate.app.entity.CategoryImage;
import pjwstk.receipemate.app.view.category.CategoryImageView;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.entity.Category;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CategoryViewFactoryTest {

    private CategoryViewFactory categoryViewFactory;
    private Category category;
    private CategoryImageView expectedCategoryImageView;

    @BeforeEach
    public void setup() {
        //given
        CategoryImageViewFactory mockCategoryImageViewFactory = mock(CategoryImageViewFactory.class);
        categoryViewFactory = new CategoryViewFactory(mockCategoryImageViewFactory);

        //Initialize Category
        category = new Category();

        category.setId(1);
        category.setName("Test Name");
        CategoryImage categoryImage = new CategoryImage();
        category.setCategoryImage(categoryImage);

        //Mock mapping CategoryImage to CategoryImageView
        expectedCategoryImageView = new CategoryImageView();
        when(mockCategoryImageViewFactory.make(categoryImage)).thenReturn(expectedCategoryImageView);
    }

    @Test
    void make_ShouldMapCategoryToCategoryView() {
        // given setup()
        //when
        CategoryView categoryView = categoryViewFactory.make(category);

        //then
        assertNotNull(categoryView);
        assertEquals(1, categoryView.getId());
        assertEquals("Test Name", categoryView.getName());
        assertEquals(expectedCategoryImageView, categoryView.getImage());
    }

    @Test
    void makeList_ShouldReturnListOfCategoryView() {
        //given setup()
        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Another Test Name");
        CategoryImage categoryImage = new CategoryImage();
        category2.setCategoryImage(categoryImage);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category);
        categoryList.add(category2);

        //when
        List<CategoryView> categoryViewList = categoryViewFactory.makeList(categoryList);

        //then
        assertNotNull(categoryViewList);
        assertEquals(2, categoryViewList.size());
        assertEquals(1, categoryViewList.get(0).getId());
        assertEquals(2, categoryViewList.get(1).getId());
    }
}
