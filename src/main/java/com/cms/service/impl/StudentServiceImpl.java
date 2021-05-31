package com.cms.service.impl;

import com.cms.entity.Course;
import com.cms.entity.Student;
import com.cms.mapper.StudentMapper;
import com.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectStu(String stuNo) {
        return studentMapper.selectStu(stuNo);
    }

    @Override
    public List<Student> selectAllStu() {
        return studentMapper.selectAllStu();
    }

    @Override
    public double calStuAverage(String stuNo) {
        //计算学生获得的总分
        Integer sum = studentMapper.calStuSum(stuNo);
        //计算学生通过的考试数
        Integer num = studentMapper.getScoreNum(stuNo);
        double avg = sum/num;
        //四舍五入保留两位小数
        BigDecimal b = new BigDecimal(avg);
        avg = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return avg;
    }

    @Override
    public int calStuCredit(String stuNo) {
        return studentMapper.calStuCredit(stuNo);
    }

    @Override
    public List<Course> queryAllCourse(String stuNo) {
        return studentMapper.queryAllCourse(stuNo);
    }

    @Override
    public List<Course> querySomeCourse(List<Course> courseList, int pageNum, int offset) {
        //pageNum是从0开始的
        List<Course> list = new ArrayList<Course>();
        //需要略过的课程数
        int num = (pageNum-1)*offset;
        //记录添加的数量
        int cnt = 0;
        for(Course li : courseList){
            if(num!=0){
                num--;
                continue;
            }
            list.add(li);
            cnt++;
            if(cnt == offset){
                return list;
            }
        }
        //这里是数量不足offset的时候的返回值
        return list;
    }

    @Override
    public List<Course> queryAllScore(String stuNo) {
        return studentMapper.queryAllScore(stuNo);
    }

    @Override
    public List<Course> querySomeScore(List<Course> scoreList, int pageNum, int offset) {
        //pageNum是从0开始的
        List<Course> list = new ArrayList<Course>();
        //需要略过的课程数
        int num = (pageNum-1)*offset;
        //记录添加的数量
        int cnt = 0;
        for(Course li : scoreList){
            if(num!=0){
                num--;
                continue;
            }
            list.add(li);
            cnt++;
            if(cnt == offset){
                return list;
            }
        }
        //这里是数量不足offset的时候的返回值
        return list;
    }
}
