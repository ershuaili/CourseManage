package com.cms.mapper;

import com.cms.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Mapper
public interface TeacherMapper {

    /**
     * 通过用户名查询教师
     * @param teaNo
     * @return Teacher
     */
    Teacher selectTea(String teaNo);
}
