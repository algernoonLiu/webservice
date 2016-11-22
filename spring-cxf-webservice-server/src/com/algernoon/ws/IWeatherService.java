/**
 * 
 */
package com.algernoon.ws;

import javax.jws.WebService;

/**
 * @author liuzm
 * @date 2016年11月22日
 * @description TODO
 *
 */
@WebService
public interface IWeatherService {

	public String queryWeather(String cityCode);
	
}

