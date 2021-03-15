package com.fc.springboot.service;

import com.fc.springboot.SpringbootDemoApplication;
import com.fc.springboot.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootDemoApplication.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testCache() {
        // 第一次查询，应该走数据库
        System.out.print("first query...");
        Account abc = accountService.getAccountByName("abc");
        // 第二次查询，应该不查数据库，直接返回缓存的值
        System.out.print("second query...");
        accountService.getAccountByName("abc");
        System.out.println();
    }

}