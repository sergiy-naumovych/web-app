package com.test.dao;

import com.test.entity.Product;

/**
 * Created by Matrix on 07.07.2014.
 */
public abstract class ProductDao {
    public abstract Product selectById(int id);
}
