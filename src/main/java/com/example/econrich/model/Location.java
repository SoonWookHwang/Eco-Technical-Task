package com.example.econrich.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "locations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="location_id")
  private int locationId;

  @Column(name="street_address")
  private String streetAddress;

  @Column(name="postal_code")
  private String postalCode;

  @Column(name="city")
  private String city;

  @Column(name="state_province",nullable = true)
  private String stateProvince;

  @ManyToOne
  @JoinColumn(name="country_id")
  private Country country;
}
