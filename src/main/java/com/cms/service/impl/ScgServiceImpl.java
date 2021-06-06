package com.cms.service.impl;

import com.cms.entity.Scg;
import com.cms.mapper.ScgMapper;
import com.cms.service.ScgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/06/05 下午 6:40
 */
@Service
public class ScgServiceImpl implements ScgService {
    @Autowired
    ScgMapper scgMapper;

    /**
     * 获取所有课程信息
     * @return scList
     */
    @Override
    public List<Scg> selectScgList() {
        return scgMapper.selectScgList();
    }

    /**
     * 查询所有课程名
     * @return cName
     */
    @Override
    public List<String> selectCname() {
        return scgMapper.selectCname();
    }
}
