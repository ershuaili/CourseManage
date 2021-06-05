package com.cms.service;

import com.cms.entity.Sc;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
public interface ScService {
    /**
     * 查询课程号和课程名，学号
     * @return scList
     */
    List<Sc> selectScList();

    /**
     * 查询所有课程信息
     * @return Cname
     */
    List<String> getCname();
}
