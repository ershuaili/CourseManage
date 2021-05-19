package com.coursemanage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/19 下午 9:36
 */
@SpringBootTest
public class test {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        dataSource.getClass();
        System.out.println(dataSource.getConnection());
    }
}
