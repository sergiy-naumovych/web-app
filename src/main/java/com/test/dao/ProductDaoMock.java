package com.test.dao;

import com.test.dao.ProductDao;
import com.test.entity.Product;

/**
 * Created by Matrix on 07.07.2014.
 */
public class ProductDaoMock extends ProductDao {
    @Override
    public Product selectById(int id) {
        return new Product();
    }
}
