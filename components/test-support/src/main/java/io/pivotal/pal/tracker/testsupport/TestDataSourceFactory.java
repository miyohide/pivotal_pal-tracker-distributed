package io.pivotal.pal.tracker.testsupport;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;


public class TestDataSourceFactory {

    public static DataSource create(String name) {
        MysqlDataSource dataSource = new MysqlDataSource();

        String mysql_port = System.getenv("MYSQL_PORT");

        dataSource.setUrl("jdbc:mysql://127.0.0.1:" + mysql_port + "/" + name + "?useSSL=false&useTimezone=true&serverTimezone=UTC&useLegacyDatetimeCode=false");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        return dataSource;
    }
}
