package com.mongodb.test;

import com.mongodb.dao.IProductDao;
import com.mongodb.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author zt1994 2018/3/12 10:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestProductDao {

    @Autowired
    private IProductDao productDao;

    /**
     * ������Ӳ�Ʒ
     */
    @Test
    public void testAddProduct(){
        Product product = new Product();
        product.setProductName("cat");
        product.setProductNum(3);
        productDao.addProduct(product);
    
        Product product1 = new Product();
        product1.setProductName("cat1");
        product1.setProductNum(3);
        productDao.addProduct(product1);
    
    }
    
    
    /**
     * ���Բ������в�Ʒ
     */
    @Test
    public void testFindAll(){
        List<Product> productList = productDao.findAll();
        for (Product product : productList) {
            System.out.println("ooo=="+product);
        }
    }


    /**
     * ����ͨ��id���Ҳ�Ʒ
     */
    @Test
    public void testFindId(){
        Product product = productDao.findById("5aa5f3d9b735172bc3a617c1");
        System.out.println("1=="+product);
    }


    /**
     * ���Ը��²�Ʒ
     */
    @Test
    public void testUpdateProduct(){
        Product product = productDao.findById("5aa5f3d9b735172bc3a617c1");
        System.out.println(product);
        product.setProductName("cat");
        product.setProductNum(5);
        this.productDao.saveOrUpdateProduct(product);
        Product product2 = productDao.findById("5aa5f3d9b735172bc3a617c1");
        System.out.println("2=="+product2);
    }
}