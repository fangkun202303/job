package com.moduls.myelasticjob.elasticjob.controller;

import com.moduls.myelasticjob.elasticjob.task.MyJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @program: my-elastic-job
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-06-28
 */
@RestController
public class MyController {

    @Autowired
    private MyJob myJob;

    @GetMapping("run")
    public Integer running(){
//        myJob.execute();
        return 1;
    }
}

