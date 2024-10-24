package com.itheima.software44.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("airline")
public class Airline {

    private Integer id;

    private String Company;//航空公司

    private String AirlineCode;//航班号

    private String StartDrome;//出发机场

    private String ArriveDrome;//到达机场

    private String startCity;//出发城市

    private String lastCity;//抵达城市

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime StartTime;//出发时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ArriveTime;//到达时间
}
