package com.example.generator.service.impl;

import com.example.generator.dao.CheckItemMapper;
import com.example.generator.po.CheckItem;
import com.example.generator.po.CheckItemExample;
import com.example.generator.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: generator->CheckItemServiceImpl
 * @description:
 * @author: hunyiha
 * @create: 2020-05-06 23:37
 **/

@Service
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    private CheckItemMapper checkItemMapper;

    @Override
    public List<CheckItem> listCheckItem() {

        CheckItemExample checkItemExample = new CheckItemExample();
        checkItemExample.createCriteria().andCodeEqualTo("0016");
        return checkItemMapper.selectByExample(checkItemExample);
    }
}
