package com.demo.springbatch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBatchController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job simpleJob;

    @RequestMapping("/launch/welcome/job")
    public String jobLauncher() throws Exception {
        try {
            JobParameters jobParameters = new JobParametersBuilder()
                    .addLong("time", System.currentTimeMillis())
                    .toJobParameters();
            //job launcher is an interface for running the jobs
            jobLauncher.run(simpleJob, jobParameters);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }

        return "Job Launched Successfully!";
    }

    public void test(){

    }
}
