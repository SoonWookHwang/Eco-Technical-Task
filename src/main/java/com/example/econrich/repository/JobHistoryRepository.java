package com.example.econrich.repository;

import com.example.econrich.model.JobHistory;
import com.example.econrich.model.JobHistoryId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryId> {

  List<JobHistory> findByEmployeeEmployeeIdOrderByStartDateAsc(int employeeId);

}
