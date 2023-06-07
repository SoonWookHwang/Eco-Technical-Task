package com.example.econrich.publicApi;

import lombok.Builder;
import lombok.Data;

@Data
public class AirConditionResponseDto {

  private String inform;

  private AirConditionItem airConditionItem;

  @Builder
  AirConditionResponseDto(String inform, AirConditionItem airConditionItem) {
    this.inform = inform;
    this.airConditionItem = airConditionItem;
  }
}
