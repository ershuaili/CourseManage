package com.cms.service.impl;

import com.cms.entity.Sc;
import com.cms.mapper.ScMapper;
import com.cms.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Service
public class ScServiceImpl implements ScService {
    @Autowired
    ScMapper scMapper;

    /**
     * 获取所有课程信息
     * @return scList
     */
    @Override
    public List<Sc> selectScList() {
        return scMapper.selectScList();
    }

    @Override
    public List<String> getCname() {
        return null;
    }
}
