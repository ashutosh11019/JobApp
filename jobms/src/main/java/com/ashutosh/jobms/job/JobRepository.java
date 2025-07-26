package com.ashutosh.jobms.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
