package com.jj.stu.attendance.task.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 导入 Job
 * @author zhangjunjie
 * @description
 */
@Slf4j
@Component
@EnableScheduling
public class ImportJob{


    public void executeInternal() throws JobExecutionException {

        // your logics
        log.info("Import Job执行时间: " + new Date());
    }
}