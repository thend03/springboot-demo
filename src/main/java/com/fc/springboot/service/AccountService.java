package com.fc.springboot.service;

import com.fc.springboot.entity.Account;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * account service
 *
 * @author since
 * @date 2021-03-09 16:55
 */
@Service
public class AccountService {
    /**
     * 使用了一个缓存名叫 accountCache
     * @param userName userName
     * @return Account
     */
    @Cacheable(value="accountCache",key = "#userName")
    public Account getAccountByName(String userName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务
        System.out.println("real query account."+userName);
        return getFromDb(userName);
    }

    private Account getFromDb(String acctName) {
        System.out.println("real querying db..."+acctName);
        return new Account(acctName);
    }
}
