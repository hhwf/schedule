package com.hhwf.schedule.admin.dao.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by 32958 on 2019/11/27.
 */
@Data
public class BaseEntity {

   private LocalDateTime createTime;

   private LocalDateTime updateTime;

}
