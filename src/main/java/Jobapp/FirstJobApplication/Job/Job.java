package Jobapp.FirstJobApplication.Job;

import jakarta.persistence.Entity;

@Entity

public class Job {
    private Long id;
    private String title;
    private String descrption;
    private String minSalary;
    private String maxSalary;
    private String location;

    public Job() {
    }

    public Job(Long id, String title, String descrption, String minSalary, String maxSalary, String location) {
        this.id = id;
        this.title = title;
        this.descrption = descrption;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.location = location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescrption() {
        return descrption;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public String getLocation() {
        return location;
    }
}
