package com.example.coursemanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.coursemanage.entity.Class;
import com.example.coursemanage.mapper.ClassMapper;
import com.example.coursemanage.service.ClassService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements ClassService {

}
