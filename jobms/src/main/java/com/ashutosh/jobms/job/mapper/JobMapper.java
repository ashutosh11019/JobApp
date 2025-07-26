package com.ashutosh.jobms.job.mapper;

import com.ashutosh.jobms.job.Job;
import com.ashutosh.jobms.job.dto.JobDTO;
import com.ashutosh.jobms.job.external.Company;
import com.ashutosh.jobms.job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobDTO(Job job, Company company, List<Review> review){
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setCompany(company);
        jobDTO.setReview(review);
        return jobDTO;
    }
}
