package com.mingwei.service.impl;

import com.mingwei.domain.Items;
import com.mingwei.mapper.UserMapper;
import com.mingwei.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private UserMapper userMapper;
    public Items findById(int id) {
        Items item = userMapper.selectOne(id);
        return item;
    }
}
