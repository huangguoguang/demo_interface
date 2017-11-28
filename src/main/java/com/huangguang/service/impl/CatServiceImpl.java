package com.huangguang.service.impl;

import com.huangguang.service.AnimalService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-28 10:55
 */
@Service("cat")
public class CatServiceImpl implements AnimalService {
    @Override
    public String getName() {
        System.out.println("这是一只猫");
        return "一只猫";
    }
}
