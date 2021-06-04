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
     * 通过课程号查询课程名
     * @return scList
     */
    List<Sc> selectScList();
}
