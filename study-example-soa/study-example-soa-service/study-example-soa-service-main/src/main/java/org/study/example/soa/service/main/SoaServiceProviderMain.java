package org.study.example.soa.service.main;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoaServiceProviderMain {

	protected static final Logger LOGGER = LoggerFactory.getLogger(SoaServiceProviderMain.class);

    private static String[] fn = null;

    // 初始化spring文档
    private static void contextInitialized() {
        fn = new String[] { "soa-service-main.xml" };
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        contextInitialized();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(fn);
        TimeUnit.MINUTES.sleep(1);
        ctx.close();
    }
}
