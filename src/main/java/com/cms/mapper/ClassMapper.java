package com.cms.mapper;


import com.cms.entity.Class;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Mapper
public interface ClassMapper {
    /**
     * 查询所有课程名
     * @return classList
     */
    List<Class> selectAllClass();

    /**
     * 根据班级id查询班级
     * @param clno 班级编号
     * @return class
     */
    Class selectClassName(String clno);

}
