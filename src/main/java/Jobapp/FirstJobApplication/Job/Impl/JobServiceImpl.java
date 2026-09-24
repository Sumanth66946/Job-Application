package Jobapp.FirstJobApplication.Job.Impl;

import Jobapp.FirstJobApplication.Job.Job;
import Jobapp.FirstJobApplication.Job.JobRepository;
import Jobapp.FirstJobApplication.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    //private List<Job> jobs=new ArrayList<>();
    JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);

    }
    @Override
    public Job getJobById(Long id){
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id){
        if (jobRepository.existsById(id)) {
            jobRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateJob(Long Id, Job updatedjob) {
        Optional<Job> optionalJob=jobRepository.findById(Id);

            if(optionalJob.isPresent()){
                Job job=optionalJob.get();
                job.setTitle(updatedjob.getTitle());
                job.setDescrption(updatedjob.getDescrption());
                job.setMinSalary(updatedjob.getMinSalary());
                job.setMaxSalary(updatedjob.getMaxSalary());
                job.setLocation(updatedjob.getLocation());
                jobRepository.save(job);
                return true;
            }

        return false;
    }


}
