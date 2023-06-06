package com.example.econrich.publicApi;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class AirConditionRequestDto {

    private int numOfRows; // 조회날짜로 검색시 사용안함
    private int pageNo; // 조회날짜로 검색시 사용안함

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String searchDate;	//통보시간 검색(조회 날짜 입력이 없을 경우 한달동안 예보통보 발령 날짜의 리스트 정보를 확인)

    public AirConditionRequestDto(){
        this.numOfRows= 10;
        this.pageNo = 1;
        this.searchDate = null;
    }
}
