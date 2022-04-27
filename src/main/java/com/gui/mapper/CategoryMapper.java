package com.gui.mapper;

import com.gui.pojo.ProductCategory;

import java.util.List;

public interface CategoryMapper {
   List< ProductCategory> findProductCategoryById(Integer id);
}
