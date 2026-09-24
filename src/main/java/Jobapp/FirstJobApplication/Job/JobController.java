package Jobapp.FirstJobApplication.Job;
import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }


    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobService.findAll();
    }

    @PostMapping("/jobs")
        public String createJob(@RequestBody Job job){
            jobService.createJob(job);
            return "Job created successfully";
        }
    @GetMapping("/jobs/{id}")
    public Job findJobById(@PathVariable Long id){
        return jobService.getJobById(id);
    }
    @DeleteMapping("/jobs/{id}")
    public boolean deleteJobById(@PathVariable Long id){
        return jobService.deleteJobById(id);
    }
    @PutMapping("/jobs/{id}")
    public String updateJob(@PathVariable Long id,@RequestBody Job updatedJob){
        boolean updated=jobService.updateJob(id, updatedJob);
        if(updated){
            return "Job Updated successfully";
        }
        return "Job not found";
    }
}
