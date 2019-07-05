package com.moduls.myelasticjob.xxljob.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @program: my-elastic-job
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-07-04
 */
//@Component
//@JobHandler(value = "myXxlJob")
public class MyXxlJob extends IJobHandler {

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        XxlJobLogger.log("XXL-JOB, Hello World.");

        XxlJobLogger.log("beat at: ---->>>>");
        System.out.println("MyXxlJob执行任务");
        return SUCCESS;
    }
}
