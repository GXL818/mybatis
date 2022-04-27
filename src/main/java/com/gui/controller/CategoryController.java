package com.gui.controller;

import com.gui.mapper.CategoryMapper;
import com.gui.pojo.ProductCategory;
import com.gui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CategoryController {

    /**
     * 获取 通过类别查询分类的数据
     * 比如 水果类 就需要查询所有水果
     */
    @Test
    public void findProductCategoryById(){
        SqlSession session = MybatisUtils.getSession();
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
        List<ProductCategory> productCategoryById = mapper.findProductCategoryById(1);
        for (ProductCategory productCategory : productCategoryById) {
            System.out.println(productCategory.toString());
        }
    }
}
