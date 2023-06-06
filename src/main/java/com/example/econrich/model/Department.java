package com.example.econrich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
  @Id
  @Column(name="department_id")
  private Integer departmentId;

  @Column(name="department_name")
  private String departmentName;

  @ManyToOne
  @JoinColumn(name="manager_id")
  @JsonIgnore
  private Employee manager;

  @ManyToOne
  @JoinColumn(name="location_id")
  private Location location;
}
