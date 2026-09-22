package Jobapp.FirstJobApplication.Job;
import java.util.*;
public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    Job getJobById(Long Id);
    void deleteJobById(Long Id);
}
