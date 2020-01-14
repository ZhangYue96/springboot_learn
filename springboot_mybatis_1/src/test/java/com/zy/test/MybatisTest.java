package com.zy.test;

import com.zy.mappers.AccountDao;
import com.zy.mappers.AccountDao2;
import com.zy.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    AccountDao accountDao;

    @Autowired
    AccountDao2 accountDao2;

    @Test
    public void test1(){
        List<Account> lists = accountDao.selectAll();
        System.out.println(lists);
    }

    @Test
    public void test2(){
        Account account = accountDao2.selectByPrimaryKey(1);
        System.out.println(account);
    }

}
