package com.example.econrich.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class JobHistoryId implements Serializable {

  @Column(name = "employee_id")
  private int employeeId;

  @Column(name = "start_date")
  private Date startDate;
}
