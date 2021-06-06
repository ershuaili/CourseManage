package com.cms.mapper;

import com.cms.entity.Scg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/06/05 下午 6:39
 */
@Mapper
public interface ScgMapper {

    /**
     * 查询学生姓名成绩课程
     * @return scList
     */
    List<Scg> selectScgList();

    /**
     * 查询所有课程名
     * @return cName
     */
    List<String> selectCname();
}