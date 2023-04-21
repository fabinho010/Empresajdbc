package com.example;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

public class Application {
    //Para plain jdbc
    private static Connection connection;
    //Para el pool
    private static HikariDataSource dataSource;
    //Para el JPA
    private static JpaService jpaService = JpaService.getInstance();
    public static void main(String[] args) {

    }
}
