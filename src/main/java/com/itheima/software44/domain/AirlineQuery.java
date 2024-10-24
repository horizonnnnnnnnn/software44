package com.itheima.software44.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AirlineQuery {

    private String startCity;//出发城市

    private String lastCity;//抵达城市

}
