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

  /*

 {"response":{
  "body":{
    "totalCount":28,
    "items":
       [
        {
          "imageUrl4":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM2P5.1hsp.2023060321.png",
          "informCode":"PM10",
          "imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM2P5.1hsp.2023060403.png",
          "imageUrl6":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM2P5.1hsp.2023060409.png",
          "actionKnack":null,
          "informCause":"○ [미세먼지] 원활한 대기 확산으로 대기질이 대체로 '보통' 수준일 것으로 예상됩니다.",
          "informOverall":"○ [미세먼지] 전 권역이 '좋음'∼'보통'으로 예상됩니다.",
          "informData":"2023-06-03",
          "informGrade":"서울 : 보통,제주 : 보통,전남 : 보통,전북 : 보통,광주 : 보통,경남 : 보통,경북 : 보통,울산 : 보통,대구 : 보통,부산 : 보통,충남 : 보통,충북 : 보통,세종 : 좋음,대전 : 좋음,영동 : 좋음,영서 : 좋음,경기남부 : 보통,경기북부 : 보통,인천 : 보통",
          "dataTime":"2023-06-03 23시 발표",
          "imageUrl3":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM10.1hsp.2023060409.png",
          "imageUrl2":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM10.1hsp.2023060403.png",
          "imageUrl1":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM10.1hsp.2023060321.png"
        },
        {
          "imageUrl4":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM2P5.1hsp.2023060321.png",
          "informCode":"PM25",
          "imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM2P5.1hsp.2023060403.png",
          "imageUrl6":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM2P5.1hsp.2023060409.png",
          "actionKnack":null,
          "informCause":"○ [미세먼지] 원활한 대기 확산으로 대기질이 대체로 '보통' 수준일 것으로 예상됩니다.",
          "informOverall":"○ [미세먼지] 전 권역이 '좋음'∼'보통'으로 예상됩니다.",
          "informData":"2023-06-03",
          "informGrade":"서울 : 좋음,제주 : 보통,전남 : 보통,전북 : 보통,광주 : 보통,경남 : 보통,경북 : 보통,울산 : 보통,대구 : 보통,부산 : 보통,충남 : 좋음,충북 : 보통,세종 : 좋음,대전 : 좋음,영동 : 좋음,영서 : 좋음,경기남부 : 좋음,경기북부 : 좋음,인천 : 좋음",
          "dataTime":"2023-06-03 23시 발표",
          "imageUrl3":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM10.1hsp.2023060409.png",
          "imageUrl2":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM10.1hsp.2023060403.png",
          "imageUrl1":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.PM10.1hsp.2023060321.png"
        },
        {
          "imageUrl4":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060503.png","informCode":"O3","imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060506.png","imageUrl6":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060509.png","actionKnack":null,
          "informCause":"○ [오존] 대기오염물질의 광화학 반응에 의한 오존 생성과 이동으로 대부분 지역은 오후에 일시적으로 농도가 높을 것으로 예상됩니다.",
          "informOverall":"○ [오존] 인천·경기도·충북·충남·전북·전남·영남권은 '나쁨', 그 밖의 권역은 '보통'으로 예상됩니다.",
          "informData":"2023-06-04",
          "informGrade":"서울 : 보통,제주 : 보통,전남 : 나쁨,전북 : 나쁨,광주 : 보통,경남 : 나쁨,경북 : 나쁨,울산 : 나쁨,대구 : 나쁨,부산 : 나쁨,충남 : 나쁨,충북 : 나쁨,세종 : 보통,대전 : 보통,영동 : 보통,영서 : 보통,경기남부 : 나쁨,경기북부 : 나쁨,인천 : 나쁨",
          "dataTime":"2023-06-03 23시 발표","imageUrl3":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060409.png","imageUrl2":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060406.png","imageUrl1":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060403.png"},
        {
          "imageUrl4":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060503.png","informCode":"O3","imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060506.png","imageUrl6":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060509.png","actionKnack":null,
          "informCause":"○ [오존] 대기오염물질의 광화학 반응에 의한 오존 생성과 이동으로 대부분 지역은 오후에 일시적으로 농도가 높을 것으로 예상됩니다.",
          "informOverall":"○ [오존] 수도권·충청권·호남권·영남권은 '나쁨', 그 밖의 권역은 '보통'으로 예상됩니다.",
          "informData":"2023-06-05",
          "informGrade":"서울 : 나쁨,제주 : 보통,전남 : 나쁨,전북 : 나쁨,광주 : 나쁨,경남 : 나쁨,경북 : 나쁨,울산 : 나쁨,대구 : 나쁨,부산 : 나쁨,충남 : 나쁨,충북 : 나쁨,세종 : 나쁨,대전 : 나쁨,영동 : 보통,영서 : 보통,경기남부 : 나쁨,경기북부 : 나쁨,인천 : 나쁨","dataTime":"2023-06-03 23시 발표","imageUrl3":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060409.png","imageUrl2":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060406.png","imageUrl1":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv1_15h.20230603.KNU_09_01.O3.1hsp.2023060403.png"},{"imageUrl4":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM2P5.1hsp.2023060303.png","informCode":"PM10","imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM2P5.1hsp.2023060309.png","imageUrl6":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM2P5.1hsp.2023060315.png","actionKnack":null,"informCause":"○ [미세먼지] 원활한 대기 확산으로 대기질이 대체로 '보통' 수준일 것으로 예상됩니다.","informOverall":"○ [미세먼지] 전 권역이 '좋음'∼'보통'으로 예상됩니다.","informData":"2023-06-03","informGrade":"서울 : 좋음,제주 : 보통,전남 : 보통,전북 : 보통,광주 : 보통,경남 : 보통,경북 : 보통,울산 : 보통,대구 : 보통,부산 : 보통,충남 : 보통,충북 : 보통,세종 : 좋음,대전 : 좋음,영동 : 좋음,영서 : 좋음,경기남부 : 좋음,경기북부 : 좋음,인천 : 좋음","dataTime":"2023-06-03 11시 발표","imageUrl3":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM10.1hsp.2023060315.png","imageUrl2":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM10.1hsp.2023060309.png","imageUrl1":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM10.1hsp.2023060303.png"},{"imageUrl4":null,"informCode":"PM10","imageUrl5":null,"imageUrl6":null,"actionKnack":null,"informCause":"○ [미세먼지] 원활한 대기 확산으로 대기질이 대체로 '보통' 수준일 것으로 예상됩니다.","informOverall":"○ [미세먼지] 전 권역이 '좋음'∼'보통'으로 예상됩니다.","informData":"2023-06-04","informGrade":"서울 : 보통,제주 : 좋음,전남 : 좋음,전북 : 보통,광주 : 보통,경남 : 좋음,경북 : 좋음,울산 : 보통,대구 : 좋음,부산 : 보통,충남 : 보통,충북 : 보통,세종 : 좋음,대전 : 좋음,영동 : 좋음,영서 : 좋음,경기남부 : 보통,경기북부 : 보통,인천 : 보통","dataTime":"2023-06-03 11시 발표","imageUrl3":null,"imageUrl2":null,"imageUrl1":null},{"imageUrl4":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM2P5.1hsp.2023060303.png","informCode":"PM25","imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM2P5.1hsp.2023060309.png","imageUrl6":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM2P5.1hsp.2023060315.png","actionKnack":null,"informCause":"○ [미세먼지] 원활한 대기 확산으로 대기질이 대체로 '보통' 수준일 것으로 예상됩니다.","informOverall":"○ [미세먼지] 전 권역이 '좋음'∼'보통'으로 예상됩니다.","informData":"2023-06-03","informGrade":"서울 : 좋음,제주 : 보통,전남 : 보통,전북 : 보통,광주 : 보통,경남 : 보통,경북 : 보통,울산 : 보통,대구 : 보통,부산 : 보통,충남 : 보통,충북 : 보통,세종 : 좋음,대전 : 좋음,영동 : 좋음,영서 : 좋음,경기남부 : 보통,경기북부 : 좋음,인천 : 좋음","dataTime":"2023-06-03 11시 발표","imageUrl3":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM10.1hsp.2023060315.png","imageUrl2":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM10.1hsp.2023060309.png","imageUrl1":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.PM10.1hsp.2023060303.png"},{"imageUrl4":null,"informCode":"PM25","imageUrl5":null,"imageUrl6":null,"actionKnack":null,"informCause":"○ [미세먼지] 원활한 대기 확산으로 대기질이 대체로 '보통' 수준일 것으로 예상됩니다.","informOverall":"○ [미세먼지] 전 권역이 '좋음'∼'보통'으로 예상됩니다.","informData":"2023-06-04","informGrade":"서울 : 보통,제주 : 좋음,전남 : 좋음,전북 : 보통,광주 : 보통,경남 : 좋음,경북 : 좋음,울산 : 보통,대구 : 좋음,부산 : 보통,충남 : 보통,충북 : 보통,세종 : 좋음,대전 : 좋음,영동 : 좋음,영서 : 좋음,경기남부 : 보통,경기북부 : 보통,인천 : 보통","dataTime":"2023-06-03 11시 발표","imageUrl3":null,"imageUrl2":null,"imageUrl1":null},{"imageUrl4":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.O3.1hsp.2023060403.png","informCode":"O3","imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.O3.1hsp.2023060406.png","imageUrl6":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.O3.1hsp.2023060409.png","actionKnack":null,"informCause":"○ [오존] 대기오염물질의 광화학 반응에 의한 오존 생성과 이동으로 대부분 지역은 오후에 일시적으로 농도가 높을 것으로 예상됩니다.","informOverall":"○ [오존] 수도권·강원영서·충북·충남·전북·전남·영남권·제주권은 '나쁨', 그 밖의 권역은 '보통'으로 예상됩니다.","informData":"2023-06-03","informGrade":"서울 : 나쁨,제주 : 나쁨,전남 : 나쁨,전북 : 나쁨,광주 : 보통,경남 : 나쁨,경북 : 나쁨,울산 : 나쁨,대구 : 나쁨,부산 : 나쁨,충남 : 나쁨,충북 : 나쁨,세종 : 보통,대전 : 보통,영동 : 보통,영서 : 나쁨,경기남부 : 나쁨,경기북부 : 나쁨,인천 : 나쁨","dataTime":"2023-06-03 11시 발표","imageUrl3":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.O3.1hsp.2023060309.png","imageUrl2":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.O3.1hsp.2023060306.png","imageUrl1":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.O3.1hsp.2023060303.png"},{"imageUrl4":null,"informCode":"O3","imageUrl5":"https://www.airkorea.or.kr/file/proxyImage?fileName=2023/06/03/AQFv4_03h.20230603.KNU_09_01.O3.1hsp.2023060406.png","imageUrl6":null,"actionKnack":null,"informCause":"○ [오존] 대기오염물질의 광화학 반응에 의한 오존 생성과 이동으로 대부분 지역은 오후에 일시적으로 농도가 높을 것으로 예상됩니다.","informOverall":"○ [오존] 수도권·강원영서·충북·충남·전북·전남·영남권은 '나쁨', 그 밖의 권역은 '보통'으로 예상됩니다.","informData":"2023-06-04","informGrade":"서울 : 나쁨,제주 : 보통,전남 : 나쁨,전북 : 나쁨,광주 : 보통,경남 : 나쁨,경북 : 나쁨,울산 : 나쁨,대구 : 나쁨,부산 : 나쁨,충남 : 나쁨,충북 : 나쁨,세종 : 보통,대전 : 보통,영동 : 보통,영서 : 나쁨,경기남부 : 나쁨,경기북부 : 나쁨,인천 : 나쁨","dataTime":"2023-06-03 11시 발표","imageUrl3":null,"imageUrl2":null,"imageUrl1":null}],"pageNo":1,"numOfRows":10},"header":{"resultMsg":"NORMAL_CODE","resultCode":"00"}}}


   */

}
