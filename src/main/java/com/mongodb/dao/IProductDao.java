package com.mongodb.dao;

import com.mongodb.pojo.Product;

import java.util.List;

/**
 * @author zt1994 2018/3/12 10:45
 */
public interface IProductDao {
    /**
     * 添加产品
     * @param product
     */
    void addProduct(Product product);


    /**
     * 删除产品
     * @param id
     */
    void removeProduct(String id);


    /**
     * 保存或修改产品
     * @param product
     */
    void saveOrUpdateProduct(Product product);


    /**
     * 查询单个产品
     * @param id
     * @return
     */
    Product findById(String id);


    /**
     * 查询所有产品
     * @return
     */
    List<Product> findAll();
}
