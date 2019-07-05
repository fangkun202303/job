package com.moduls.myelasticjob.elasticjob.service;

import org.springframework.stereotype.Service;

/**
 * @description: 任务demo
 * @program: my-elastic-job
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-06-28
 */
@Service
public class MyService {

    public void runMyService(String str){
        System.out.println("分片"+str+" [ "+Thread.currentThread().getId()+" ]  ---"+Thread.currentThread().getName()+"执行了，时间是："+ System.currentTimeMillis());
    }
}
