package com.hhwf.schedule.admin.service.impl;

import com.hhwf.schedule.admin.entity.User;
import com.hhwf.schedule.admin.mapper.UserMapper;
import com.hhwf.schedule.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hhwf
 * @since 2019-11-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
