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
     * 通过课程号查询课程名
     * @return scList
     */
    List<Sc> selectScList();
}
