package com.cn.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
class BaseEntity{

    @TableId(type = IdType.ASSIGN_ID)
    private int id;

    /**
     * 创建时间
     */
    @TableField(value = "createTime", fill = FieldFill.INSERT)
    private LocalDateTime create_time;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime", fill = FieldFill.UPDATE)
    private LocalDateTime update_time;

    /**
     * 逻辑删除标志
     */
    @TableLogic
    private int deleted;
}
