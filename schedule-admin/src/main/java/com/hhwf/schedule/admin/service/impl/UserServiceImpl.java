package com.hhwf.schedule.admin.service.impl;

import com.hhwf.schedule.admin.dao.entity.User;
import com.hhwf.schedule.admin.dao.mapper.UserMapper;
import com.hhwf.schedule.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
