package com.taskjob.service;

import java.util.List;

import com.taskjob.bean.ScheduleJob;

public interface ScheduleJobService {
           public void save(ScheduleJob job);
           public List<ScheduleJob> getAll();
           public void execute(ScheduleJob job);
           public void stop(ScheduleJob job);
           public void updateTime(ScheduleJob job) ;
           public void updateStatus(String status);
           public List<ScheduleJob> getInitAll();
}
