package com.example.econrich.controller;

import com.example.econrich.model.Department;
import com.example.econrich.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/department")
public class DepartmentController {

  private final DepartmentService departmentService;

  /*
  부서 및 위치 정보 조회 가능한 API 구현
   */
  @GetMapping("/location/{departmentId}")
  public Department findDepartmentLocationByDepartmentId(@PathVariable Integer departmentId) {
    return departmentService.findDepartmentLocationByDepartmentId(departmentId);
  }

}
