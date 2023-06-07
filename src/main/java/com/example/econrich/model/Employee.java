package com.example.econrich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Employee {

  @Id
  @Column(name = "employee_id")
  private int employeeId;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email")
  private String email;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "hire_date")
  private Date hireDate;

  @ManyToOne
  @JoinColumn(name = "job_id")
  private Job job;

  @Column(name = "salary")
  private int salary;

  @Column(name = "commission_pct", nullable = true)
  private BigDecimal commissionPct;

  @ManyToOne
  @JoinColumn(name = "manager_id", nullable = true)
  @JsonIgnore
  private Employee manager;

  @ManyToOne
  @JoinColumn(name = "department_id", nullable = true)
  private Department department;


  public void updateSalaryByRate(Employee updateTarget, Integer rate) {
    BigDecimal newSalary = BigDecimal.valueOf(updateTarget.getSalary())
        .multiply(BigDecimal.valueOf(1 + rate / 100.0));
    updateTarget.setSalary(newSalary.intValue());
    log.info("----" + updateTarget.getSalary());
  }
}
