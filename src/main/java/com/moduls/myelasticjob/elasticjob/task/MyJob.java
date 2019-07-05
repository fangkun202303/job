package com.moduls.myelasticjob.elasticjob.task;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.moduls.myelasticjob.elasticjob.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: job的demo
 * @program: my-elastic-job
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-06-28
 */
@Component
public class MyJob implements SimpleJob {

//    private MyService myService=new MyService();
    @Autowired
    private MyService myService;

    @Override
    public void execute(ShardingContext shardingContext) {
        switch (shardingContext.getShardingItem()) {
            case 0:
                myService.runMyService("0");
                break;
            case 1:
                myService.runMyService("1");
                break;
            case 2:
                myService.runMyService("2");
                break;
        }
    }
}
