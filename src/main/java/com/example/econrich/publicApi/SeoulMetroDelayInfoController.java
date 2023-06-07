package com.example.econrich.publicApi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeoulMetroDelayInfoController {

  @Value("${security.myapp.key}")
  private String serviceKey;

  @Value("http://apis.data.go.kr/B553766/smt-delay/delay")
  private String endPoint;

  @PostMapping("/metro")
  @ResponseBody
  public MetroDelayInfoResponse getDelayInfo(@RequestParam String lineNum)
      throws IOException, InterruptedException {
    String url = endPoint + "?serviceKey=" + serviceKey;

    url += "&numOfRows=" + "1" + "&pageNo=" + "1";
    url += "&lineNum=" + lineNum;
    System.out.println(url);

    String returnObject = OpenApiRequestUtil.getInfoFromOpenApi(url);

    ObjectMapper objectMapper = new ObjectMapper();

    JsonNode jsonNode = objectMapper.readTree(returnObject);

    if (jsonNode.path("resultMsg").asText().equals("정상")) {
      return MetroDelayInfoResponse.builder()
          .resultMsg(lineNum + "호선의 지연되고 있는 열차가 없습니다.")
          .build();
    } else {
      return MetroDelayInfoResponse.builder()
          .resultMsg(lineNum + "호선 열차 지연 정보입니다.")
          .item(returnObject)
          .build();
    }
  }

  @AllArgsConstructor
  @Data
  @Builder
  static class MetroDelayInfoResponse {

    private String resultMsg;
    private String item;

  }
}
