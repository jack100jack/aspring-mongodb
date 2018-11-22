package com.mongodb.dao.impl;

import com.mongodb.dao.IProductDao;
import com.mongodb.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zt1994 2018/3/12 10:46
 */
@Repository
public class ProductDaoImpl implements IProductDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void addProduct(Product product) {
        //1.如果没有指定集合，则默认添加到和对象名称相同的集合中，没有则创建一个
        //2.也可以指定集合 mongoTemplate.save(product, "product_db");
        mongoTemplate.save(product);
    }

    public void removeProduct(String id) {
        Product product = findById(id);
        mongoTemplate.remove(product);
    }

    public void saveOrUpdateProduct(Product product) {
        mongoTemplate.save(product);
    }

    public Product findById(String id) {
        return mongoTemplate.findById(id, Product.class);
    }

    public List<Product> findAll() {
        return mongoTemplate.findAll(Product.class);
    }
}
