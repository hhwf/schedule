package com.hhwf.schedule.admin.service;

import com.hhwf.schedule.admin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hhwf
 * @since 2019-11-30
 */
public interface IUserService extends IService<User> {

    User findByNameAndPassword(String userName, String password);

    User findByName(String userName);
}
