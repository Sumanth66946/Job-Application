package Jobapp.FirstJobApplication.Job.Impl;

import Jobapp.FirstJobApplication.Company.Company;
import Jobapp.FirstJobApplication.Company.CompanyRepository;
import Jobapp.FirstJobApplication.Job.Job;
import Jobapp.FirstJobApplication.Job.JobRepository;
import Jobapp.FirstJobApplication.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;
    private final CompanyRepository companyRepository;

    public JobServiceImpl(JobRepository jobRepository, CompanyRepository companyRepository) {
        this.jobRepository = jobRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        Company company = job.getCompany();
        if (company != null && company.getId() != null) {
            Company existingCompany = companyRepository.findById(company.getId())
                    .orElseThrow(() -> new IllegalArgumentException(
                            "Company not found with id: " + company.getId()));
            job.setCompany(existingCompany);
        }
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
