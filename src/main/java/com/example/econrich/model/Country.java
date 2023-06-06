package com.example.econrich.model;

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
@Table(name = "countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
  @Id
  @Column(name="country_id")
  private String countryId;

  @Column(name="country_name")
  private String countryName;

  @ManyToOne
  @JoinColumn(name="region_id")
  private Region region;
}
