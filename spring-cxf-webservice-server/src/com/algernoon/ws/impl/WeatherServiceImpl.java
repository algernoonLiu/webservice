/**
 * 
 */
package com.algernoon.ws.impl;

import com.algernoon.ws.IWeatherService;

/**
 * @author liuzm
 * @date 2016年11月22日
 * @description TODO
 *
 */
public class WeatherServiceImpl implements IWeatherService{

	/* (non-Javadoc)
	 * @see com.algernoon.ws.IWeatherService#queryWeather(java.lang.String)
	 */
	@Override
	public String queryWeather(String cityCode) {
		// TODO Auto-generated method stub
		System.out.println("客户端传输的城市编号："+cityCode);
		return "天气晴朗";
	}

}
