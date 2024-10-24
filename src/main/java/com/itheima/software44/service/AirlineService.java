package com.itheima.software44.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.software44.domain.Airline;
import com.itheima.software44.domain.AirlineQuery;

import java.util.List;

public interface AirlineService extends IService<Airline> {
    List<Airline> queryAirline(AirlineQuery airlineQuery);
}
