/**
 * 
 */
package com.algernoon.ws.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuzm
 * @date 2016年11月22日
 * @description TODO
 *
 */
public class ClientTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IWeatherService weatherService = ctx.getBean(IWeatherService.class);
		String result = weatherService.queryWeather("CD");
		System.out.println(result);
	}

}
