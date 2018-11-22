package com.mongodb.dao;

import com.mongodb.pojo.Product;

import java.util.List;

/**
 * @author zt1994 2018/3/12 10:45
 */
public interface IProductDao {
    /**
     * ��Ӳ�Ʒ
     * @param product
     */
    void addProduct(Product product);


    /**
     * ɾ����Ʒ
     * @param id
     */
    void removeProduct(String id);


    /**
     * ������޸Ĳ�Ʒ
     * @param product
     */
    void saveOrUpdateProduct(Product product);


    /**
     * ��ѯ������Ʒ
     * @param id
     * @return
     */
    Product findById(String id);


    /**
     * ��ѯ���в�Ʒ
     * @return
     */
    List<Product> findAll();
}
