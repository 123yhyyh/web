package main.java.mydessertstore.persistence;
import main.java.mydessertstore.domain.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getCategoryList();

    Category getCategory(String categoryId);
}
