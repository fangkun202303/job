package com.moduls.myelasticjob.xxljob.service;

import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @program: my-elastic-job
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-07-05
 */
@Service
public class MyServiceOfXxl {

    public String runMyService(){
        XxlJobLogger.log("执行我的服务了，方法com.moduls.myelasticjob.xxljob.service.MyService.runMyService正在run");
        System.out.println("执行我的服务了");
        return "SUCCESS";
    }
}
