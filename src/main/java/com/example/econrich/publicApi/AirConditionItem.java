package com.example.econrich.publicApi;

import lombok.Builder;
import lombok.Data;

@Data
public class AirConditionItem {

  private String dataTime;
  private String informCause;
  private String informOverall;
  private String informGrade;
  private String imageUrl1;
  private String imageUrl2;
  private String imageUrl3;
  private String imageUrl4;
  private String imageUrl5;
  private String imageUrl6;

  @Builder
  AirConditionItem(String dataTime, String informCause, String informGrade, String informOverall,
      String imageUrl1, String imageUrl2, String imageUrl3, String imageUrl4,
      String imageUrl5, String imageUrl6) {
    this.dataTime = dataTime;
    this.informCause = informCause;
    this.informGrade = informGrade;
    this.informOverall = informOverall;
    this.imageUrl1 = imageUrl1;
    this.imageUrl2 = imageUrl2;
    this.imageUrl3 = imageUrl3;
    this.imageUrl4 = imageUrl4;
    this.imageUrl5 = imageUrl5;
    this.imageUrl6 = imageUrl6;
  }

}
