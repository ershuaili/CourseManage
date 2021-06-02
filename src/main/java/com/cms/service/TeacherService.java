package com.cms.service;

import com.cms.entity.Teacher;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
public interface TeacherService {

    /**
     * 通过用户名查询教师
     * @param teaNo
     * @return Teacher
     */
    Teacher selectTea(String teaNo);
}
