package com.example.econrich.service;

import com.example.econrich.model.Employee;
import com.example.econrich.model.JobHistory;
import com.example.econrich.repository.EmployeeRepository;
import com.example.econrich.repository.JobHistoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

  private final EmployeeRepository employeeRepository;
  private final JobHistoryRepository jobHistoryRepository;


  public Employee findById(Integer employeeId) {
    return employeeRepository.findById(employeeId).orElse(null);
  }

  public List<JobHistory> findAllHistoryByEmployeeId(Integer employeeId) {
    return jobHistoryRepository.findByEmployeeEmployeeIdOrderByStartDateAsc(employeeId);
  }

  @Transactional
  public String updateSalaryAndEmployeeByDepartmentIdAndIncreaseRate(Integer departmentId,
      Integer rate) {
    List<Employee> targetList = employeeRepository.findAllByDepartmentDepartmentId(departmentId)
        .orElse(null);
    for (Employee employee : targetList) {
      employee.updateSalaryByRate(employee, rate);
    }
    return "급여인상 성공";
  }
}
