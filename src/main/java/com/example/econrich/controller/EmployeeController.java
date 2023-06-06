package com.example.econrich.controller;

import com.example.econrich.model.Employee;
import com.example.econrich.model.JobHistory;
import com.example.econrich.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
  private final EmployeeService employeeService;

  /*
  특정 사원의 현재 정보 조회 가능한 API 구현
   */
  @GetMapping("/employee/{employeeId}")
  public Employee findById(@PathVariable Integer employeeId){
    return employeeService.findById(employeeId);
  }

  /*
  특정 사원의 이력 정보 조회 가능한 API 구현
   */
  @GetMapping("/employee/job/history/{employeeId}")
  public List<JobHistory> findAllJobHistoryByEmployeeId(@PathVariable Integer employeeId){
    return employeeService.findAllHistoryByEmployeeId(employeeId);
  }

  /*
  특정 부서의 급여를 특정 비율로 인상 및 사원 정보 업데이트 할 수 있는 API 구현
   */
  @PostMapping("/departments/update-salary")
  public String updateSalaryAndEmployeeByDepartmentIdAndIncreaseRate(
      @RequestParam Integer departmentId,
      @RequestParam String increaseRate) {
    if(isNumber(increaseRate)) {
      return employeeService.updateSalaryAndEmployeeByDepartmentIdAndIncreaseRate(departmentId,
          Integer.parseInt(increaseRate));
    }else{
      return "인상률은 정수로만 입력이 가능합니다.";
    }
  }

  static boolean isNumber(String str) {
    boolean result = true;
    if (str == null || str.length() == 0) {
      result = false;
    }
    else {
      for (int i = 0; i < str.length(); i++) {
        int c = (int) str.charAt(i);
        if (c < 48 || c > 57) {
          result = false;
        }
      }
    }
    return result;
  }
}
