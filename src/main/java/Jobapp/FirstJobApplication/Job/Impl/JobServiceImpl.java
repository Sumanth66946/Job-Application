package Jobapp.FirstJobApplication.Job.Impl;

import Jobapp.FirstJobApplication.Job.Job;
import Jobapp.FirstJobApplication.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs=new ArrayList<>();
    @Override
    public List<Job> findAll() {
        return jobs;
    }
    private Long nextId=1L;

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);

    }
    @Override
    public Job getJobById(Long id){
        for(Job job:jobs){
            if(job.getId().equals(id)){
                return job;
            }
        }
        return null;
    }

    @Override
    public void deleteJobById(Long id){
        jobs.removeIf(job -> job.getId().equals(id));
    }

    @Override
    public boolean updateJob(Long Id, Job updatedjob) {
        for(Job job:jobs){
            if(job.getId().equals(Id)){
                job.setTitle(updatedjob.getTitle());
                job.setDescrption(updatedjob.getDescrption());
                job.setMinSalary(updatedjob.getMinSalary());
                job.setMaxSalary(updatedjob.getMaxSalary());
                job.setLocation(updatedjob.getLocation());
                return true;
            }
        }
        return false;
    }


}
