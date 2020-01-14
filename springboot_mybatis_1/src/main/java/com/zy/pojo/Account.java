package com.zy.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "account")
public class Account {
    @Id
    @KeySql(useGeneratedKeys = true)
//    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private Double money;
}
