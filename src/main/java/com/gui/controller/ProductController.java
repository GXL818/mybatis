package com.gui.controller;

import com.gui.mapper.ProductMapper;
import com.gui.pojo.Product;
import com.gui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ProductController {

    @Test
    public void findProductById() {
        SqlSession session = MybatisUtils.getSession();
        Product product = session.getMapper(ProductMapper.class).findProductById(935);
        System.out.println(product.toString());
    }

}
