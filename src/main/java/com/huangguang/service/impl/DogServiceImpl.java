package com.huangguang.service.impl;

import com.huangguang.service.AnimalService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-28 10:54
 */
@Service("dog")
public class DogServiceImpl implements AnimalService {
    @Override
    public String getName() {
        System.out.println("这是一条狗");
        return "一条狗";
    }
}
