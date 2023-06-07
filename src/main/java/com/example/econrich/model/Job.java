package com.example.econrich.model;


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {

  @Id
  @Column(name = "job_id")
  private String jobId;

  @Column(name = "job_title")
  private String jobTitle;

  @Column(name = "min_salary")
  private BigDecimal minSalary;

  @Column(name = "max_salary")
  private BigDecimal maxSalary;
}
