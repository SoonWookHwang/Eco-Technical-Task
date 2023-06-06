package com.example.econrich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="job_history")
@Data
public class JobHistory {

  @EmbeddedId
  private JobHistoryId jobHistoryId;

  @ManyToOne
  @JoinColumn(name="job_id", insertable=false, updatable=false)
  private Job job;

  @ManyToOne
  @JoinColumn(name="department_id", insertable=false, updatable=false)
  private Department department;

  @ManyToOne
  @JoinColumn(name="employee_id", insertable=false, updatable=false)
  @JsonIgnore
  private Employee employee;

  @Column(name="start_date", insertable=false, updatable=false)
  private Date startDate;

  @Column(name="end_date")
  private Date endDate;


}
