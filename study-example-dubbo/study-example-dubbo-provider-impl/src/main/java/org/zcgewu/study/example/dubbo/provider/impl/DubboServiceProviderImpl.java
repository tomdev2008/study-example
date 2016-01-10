package org.zcgewu.study.example.dubbo.provider.impl;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zcgewu.study.example.dubbo.provider.DubboServiceProvider;

public class DubboServiceProviderImpl implements DubboServiceProvider{

	@Override
	public Date getCurrentDate() {
		return new Date();
	}

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-service-provider.xml");
		System.in.read();
		ctx.destroy();
	}

	@Override
	public Map<String, Double[]> getBigObj() {
		Map<String, Double[]> map = new HashMap<String, Double[]>();
		for(int i = 0; i < 10; i++){
			String key = System.currentTimeMillis() + new Random().hashCode() + "";
			// double 8字节  1024字节=1kb 
			Double[] value = new Double[1024*10]; //80kb
			map.put(key, value);
		}
		return map;
	}
}
