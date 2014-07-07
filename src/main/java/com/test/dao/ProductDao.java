package com.test.dao;

import com.test.dao.exception.DaoSystemException;
import com.test.dao.exception.NoSuchEntityException;
import com.test.entity.Product;

import java.util.List;

/**
 * Created by Matrix on 07.07.2014.
 */
public interface ProductDao {
    public Product selectById(int id) throws DaoSystemException, NoSuchEntityException;

    public List<Product> selectAll() throws DaoSystemException;
}
