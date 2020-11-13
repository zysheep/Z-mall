package com.xq.tmall.service.impl;

import com.xq.tmall.dao.LastIDMapper;
import com.xq.tmall.service.LastIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LastIDServiceImpl implements LastIDService {
    @Autowired
    private LastIDMapper lastIDMapper;

    public void setLastIDMapper(LastIDMapper lastIDMapper) {
        this.lastIDMapper = lastIDMapper;
    }

    @Override
    public int selectLastID() {
        return lastIDMapper.selectLastID();
    }
}
