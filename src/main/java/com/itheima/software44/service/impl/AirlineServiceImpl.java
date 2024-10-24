package com.itheima.software44.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.software44.domain.Airline;
import com.itheima.software44.domain.AirlineQuery;
import com.itheima.software44.mapper.AirlineMapper;
import com.itheima.software44.service.AirlineService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineServiceImpl extends ServiceImpl<AirlineMapper, Airline> implements AirlineService {


    public List<Airline> queryAirline(AirlineQuery airlineQuery) {

        return lambdaQuery()
                .like(airlineQuery.getLastCity() != null, Airline::getLastCity, airlineQuery.getLastCity())
                .like(airlineQuery.getStartCity() != null, Airline::getStartCity, airlineQuery.getStartCity())
                .list();
    }
}
