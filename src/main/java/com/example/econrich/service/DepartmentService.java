package com.example.econrich.service;

import com.example.econrich.model.Department;
import com.example.econrich.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {

  private final DepartmentRepository departmentRepository;

  public Department findDepartmentLocationByDepartmentId(Integer departmentId) {
    return departmentRepository.findById(departmentId)
        .orElseThrow(() -> new IllegalArgumentException("해당 자료가 없습니다."));
  }

}
