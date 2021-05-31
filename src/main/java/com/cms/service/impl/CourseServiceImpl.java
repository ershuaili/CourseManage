package com.cms.service.impl;

import com.cms.entity.Student;
import com.cms.mapper.CourseMapper;
import com.cms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public int isExistClassNo(String classNo) {
        return courseMapper.isExistClassNo(classNo);
    }

    @Override
    public void insertClassInfo(ClassInfo cla) {
        courseMapper.insertClassInfo(cla);
    }

    @Override
    public int isExistStuNo(String stuNo) {
        return courseMapper.isExistStuNo(stuNo);
    }

    @Override
    public void insertStudentInfo(Student student) {    //这个要改
        courseMapper.updateClassNum(student.getClno());
        courseMapper.insertStudentInfo(student);
    }

    @Override
    public List<String> queryAllClassNo() {
        return courseMapper.queryAllClassNo();
    }

    @Override
    public void updateClassNum(String classNo) {
        courseMapper.updateClassNum(classNo);
    }

    @Override
    public void deleteStuByNo(String stuNo) {
        //删除成绩表
        deleteScoreByNo(stuNo);
        //班级人数减一
        updateClassNumM(courseMapper.queryClassNoByStuNo(stuNo));
        //最后删除学生信息
        courseMapper.deleteStuByNo(stuNo);
    }

    @Override
    public void updateClassNumM(String classNo) {
        courseMapper.updateClassNumM(classNo);
    }

    @Override
    public void deleteScoreByNo(String stuNo) {
        courseMapper.deleteScoreByNo(stuNo);
    }

    @Override
    public List<Student> queryAllStudent() {
        return courseMapper.queryAllStudent();
    }

    @Override
    public List<Student> querySomeStudent(List<Student> studentList, int pageNum, int offset) {
        List<Student> list = new ArrayList<Student>();
        int cnt = (pageNum-1)*offset;
        int num=0;
        for(Student li : studentList){
            if(cnt!=0){
                cnt--;
                continue;
            }
            list.add(li);
            num++;
            if(num == offset){
                break;
            }
        }
        return list;
    }
}
