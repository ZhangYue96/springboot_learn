package com.zy.test;

import com.zy.mappers.AccountDao;
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

    @Test
    public void test(){
        List<Account> lists = accountDao.selectAll();
        System.out.println(lists);
    }

}
