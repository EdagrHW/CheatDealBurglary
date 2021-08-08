package com.cn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cn.entity.UOI;
import com.cn.mapper.UOIMapper;
import com.cn.service.UOIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UOIServiceImpl extends ServiceImpl<UOIMapper, UOI> implements UOIService {

    @Override
    public void createUOI(UOI uoi) {
        this.saveOrUpdate(uoi);
    }
}
