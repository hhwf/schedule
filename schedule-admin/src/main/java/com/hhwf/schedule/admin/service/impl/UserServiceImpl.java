package com.hhwf.schedule.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.hhwf.schedule.admin.entity.User;
import com.hhwf.schedule.admin.mapper.UserMapper;
import com.hhwf.schedule.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hhwf
 * @since 2019-11-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User findByNameAndPassword(String userName, String password) {
        Map<String, String> map = new HashMap<>();
        map.put("user_name", userName);
        map.put("password", password);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.allEq(map);
        User user = baseMapper.selectOne(queryWrapper);
        return user;
    }
}
