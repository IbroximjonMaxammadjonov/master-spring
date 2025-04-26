package com.ibroximjon.concurency_multithreading.runnables;

import com.ibroximjon.concurency_multithreading.beans.User;
import com.ibroximjon.concurency_multithreading.dao.UserDao;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class UserProcessor implements Callable<Integer> {

    private String userRecord;
    private UserDao userDao;

    public UserProcessor(String userRecord, UserDao userDao) {
        this.userRecord = userRecord;
        this.userDao = userDao;
    }

    @Override
    public Integer call() throws Exception {
        int rows = 0;
        System.out.println(Thread.currentThread().getName() + " processing record for: " + userRecord);
        StringTokenizer tokenizer = new StringTokenizer(userRecord,",");
        User user = null;
        while (tokenizer.hasMoreTokens()) {
            user = new User();
            user.setName(tokenizer.nextToken());
            user.setId(Integer.parseInt(tokenizer.nextToken()));
            user.setEmail(tokenizer.nextToken());
            rows = userDao.saveUser(user);
        }
        return rows;
    }
}
