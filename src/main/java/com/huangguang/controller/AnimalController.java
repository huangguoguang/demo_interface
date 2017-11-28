package com.huangguang.controller;

import com.huangguang.service.AnimalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-28 10:56
 */
@RestController
public class AnimalController {

    @Resource(name = "cat")
    private AnimalService catService;

    @Resource(name = "dog")
    private AnimalService dogService;

    @RequestMapping(value = "name")
    public String getName (@RequestParam("animal") String animal) {
        if (animal.equals("cat")) {
            return catService.getName();
        }
        if (animal.equals("dog")) {
            return dogService.getName();
        }
        return "";
    }
}
