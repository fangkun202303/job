package com.moduls.myelasticjob.elasticjob.config;

/**
 * @description: job配置
 * @program: my-elastic-job
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-06-28
 */
public class MyJobConfig {
//    public static void main(String[] args) {
//        // 作业配置
//        // 定义作业的核心配置
//        JobCoreConfiguration jobCoreConfiguration=JobCoreConfiguration
//                .newBuilder("demojob","0/5 * * * * ?",4)
//                .build();
//        // 定义simple 类型1配置
//        SimpleJobConfiguration simpleJobConfiguration=new SimpleJobConfiguration(jobCoreConfiguration,
//                MyJob.class.getCanonicalName());
//        // 定义lite作业的配置
//        LiteJobConfiguration liteJobConfiguration=
//                LiteJobConfiguration.newBuilder(simpleJobConfiguration).build();
//
//        // 定义注册中心的配置
//        CoordinatorRegistryCenter coordinatorRegistryCenter=
//                new ZookeeperRegistryCenter(new ZookeeperConfiguration("localhost:2181","myJob"));
//        coordinatorRegistryCenter.init();
//
//
//        // 启动作业
//        new JobScheduler(coordinatorRegistryCenter,liteJobConfiguration).init();
//    }


}
