package Jobapp.FirstJobApplication.Job;
import java.util.*;
public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    Job getJobById(Long Id);
    boolean deleteJobById(Long Id);
    boolean updateJob(Long Id, Job updatedjob);
}
