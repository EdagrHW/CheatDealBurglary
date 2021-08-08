package com.cn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cn.entity.UOI;

/**
 * 借条服务类
 */
public interface UOIService extends IService<UOI> {
    /**
     * 债权人打借条和债务人打借条是同一个接口
     * @param uoi
     */
    void createUOI(UOI uoi);
}
