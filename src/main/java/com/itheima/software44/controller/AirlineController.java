package com.itheima.software44.controller;

import com.itheima.software44.domain.Airline;
import com.itheima.software44.domain.AirlineQuery;
import com.itheima.software44.domain.Result;
import com.itheima.software44.service.AirlineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airline")
@Api(tags = "航班接口")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @GetMapping
    @ApiOperation("查询航班时刻表")
    public Result getAirline(AirlineQuery airlineQuery) {
        List<Airline> list = airlineService.queryAirline(airlineQuery);
        return Result.success(list);
    }
}
