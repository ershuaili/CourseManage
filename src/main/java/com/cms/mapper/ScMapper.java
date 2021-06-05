package com.cms.mapper;

import com.cms.entity.Sc;
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
public interface ScMapper {

    /**
     * 查询学生成绩
     * @return scList
     */
    List<Sc> selectScList();

    /**
     * 查询所有课程信息
     * @return Cname
     */
    List<String> getCname();

}
