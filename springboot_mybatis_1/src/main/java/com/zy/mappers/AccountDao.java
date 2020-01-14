package com.zy.mappers;

import com.zy.pojo.Account;

import java.util.List;

public interface AccountDao {

    List<Account> selectAll();
}
