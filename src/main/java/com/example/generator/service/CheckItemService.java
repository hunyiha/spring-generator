package com.example.generator.service;

import com.example.generator.dao.CheckItemMapper;
import com.example.generator.po.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: generator->CheckItemService
 * @description:
 * @author: hunyiha
 * @create: 2020-05-06 23:01
 **/

public interface CheckItemService {


    List<CheckItem> listCheckItem();


}
