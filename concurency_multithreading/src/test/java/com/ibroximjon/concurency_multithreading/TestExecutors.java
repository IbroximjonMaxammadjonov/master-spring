package com.ibroximjon.concurency_multithreading;

import com.ibroximjon.concurency_multithreading.dao.UserDao;
import com.ibroximjon.concurency_multithreading.runnables.UserProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecutors {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        List<String> users = getUsersFromFile("C:\\Users\\Ibroximjon\\Desktop\\java-spring-projects\\spring_project\\concurency_multithreading\\src\\main\\resources\\users.txt");
        UserDao dao = new UserDao();

        for (String user : users) {
          Future<Integer> future =  executor.submit(new UserProcessor(user,dao));
            System.out.println("Result of the operation is: "+ future.get());
        }
        executor.shutdown();
        System.out.println("Main execution completed");
    }

    public static List<String> getUsersFromFile(String fileName){
        List<String> users = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine())!=null){
                users.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
