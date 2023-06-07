package com.example.econrich.publicApi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AirConditionInfoController {

  @Value("${security.myapp.key}")
  private String serviceKey;

  @Value("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth")
  private String endPoint;

  public String inform;


  @PostMapping("/air/condition")
  @ResponseBody
  public String getAirConditionMonth(@RequestBody AirConditionRequestDto requestDto)
      throws IOException, InterruptedException {

    String url = endPoint + "?serviceKey=" + serviceKey + "&returnType=json";;

    url += "&numOfRows=" + requestDto.getNumOfRows() + "&pageNo=" + requestDto.getPageNo();

    return OpenApiRequestUtil.getInfoFromOpenApi(url);
  }

  @GetMapping("/air/condition")
  public List<AirConditionResponseDto> getAirConditionToday()
      throws IOException, InterruptedException {

    String url = endPoint + "?serviceKey=" + serviceKey + "&returnType=json";

    LocalDate today = LocalDate.now();
    LocalTime notFoundResultTime = LocalTime.now();

    if(notFoundResultTime.isBefore(LocalTime.of(6,0,0))){
      inform = "금일 예보 정보가 아직 존재하지 않아 전일 예보정보로 대체됩니다.";
      today = today.minusDays(1);
    }else{
      inform = "금일 대기 상태 예보 정보입니다.";
    }
    url += "&searchDate=" + today;

    List<AirConditionResponseDto> returnList = new ArrayList<>();

    String returnObject = OpenApiRequestUtil.getInfoFromOpenApi(url);

    ObjectMapper objectMapper = new ObjectMapper();

    JsonNode jsonNode = objectMapper.readTree(returnObject);
    JsonNode itemsNode = jsonNode.path("response").path("body").path("items");
    for (JsonNode itemNode : itemsNode) {
      String dataTime = itemNode.path("dataTime").asText();
      String informCause = itemNode.path("informCause").asText();
      String informOverall = itemNode.path("informOverall").asText();
      String informGrade = itemNode.path("informGrade").asText();
      String imageUrl1 = itemNode.path("imageUrl1").asText();
      String imageUrl2 = itemNode.path("imageUrl2").asText();
      String imageUrl3 = itemNode.path("imageUrl3").asText();
      String imageUrl4 = itemNode.path("imageUrl4").asText();
      String imageUrl5 = itemNode.path("imageUrl5").asText();
      String imageUrl6 = itemNode.path("imageUrl6").asText();
      AirConditionItem items = AirConditionItem.builder()
          .dataTime(dataTime)
          .informCause(informCause)
          .informOverall(informOverall)
          .informGrade(informGrade)
          .imageUrl1(imageUrl1)
          .imageUrl2(imageUrl2)
          .imageUrl3(imageUrl3)
          .imageUrl4(imageUrl4)
          .imageUrl5(imageUrl5)
          .imageUrl6(imageUrl6)
          .build();
      AirConditionResponseDto result = AirConditionResponseDto.builder()
          .inform(inform)
          .airConditionItem(items)
          .build();
      returnList.add(result);
    }
    return returnList;
  }
}
