package com.coursemanage.mapper;

import com.coursemanage.CourseManageApplication;
import com.coursemanage.entity.User;
import com.coursemanage.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/14 下午 8:22
 */
@SpringBootTest(classes = CourseManageApplication.class)
class UserMapperTest {

    @Resource
    UserService userService;

    @Test
    public void test1(){
        List<User> userList = userService.list();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
