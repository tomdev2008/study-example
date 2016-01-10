package org.zcgewu.study.example.dubbo.provider;

import java.util.Date;
import java.util.Map;

public interface DubboServiceProvider {

	Date getCurrentDate();
	
	Map<String, Double[]> getBigObj();
}
