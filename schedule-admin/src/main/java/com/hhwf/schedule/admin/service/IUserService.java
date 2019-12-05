package com.hhwf.schedule.admin.service;

import com.hhwf.schedule.admin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hhwf
 * @since 2019-12-05
 */
public interface IUserService extends IService<User> {

    User findByName(String userName);
}
