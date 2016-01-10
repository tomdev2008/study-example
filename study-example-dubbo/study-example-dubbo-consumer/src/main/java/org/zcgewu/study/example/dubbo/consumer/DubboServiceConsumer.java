package org.zcgewu.study.example.dubbo.consumer;

import java.util.concurrent.TimeUnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zcgewu.study.example.dubbo.provider.DubboServiceProvider;

public class DubboServiceConsumer {

	private DubboServiceProvider dubboServiceProvider;

	public DubboServiceProvider getDubboServiceProvider() {
		return dubboServiceProvider;
	}

	public void setDubboServiceProvider(DubboServiceProvider dubboServiceProvider) {
		this.dubboServiceProvider = dubboServiceProvider;
	}

	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-service-consumer.xml");

		DubboServiceConsumer consumer = ctx.getBean(DubboServiceConsumer.class);

		for(int i = 0; i < 50; i++){
			workThread(consumer);
		}
		
		Thread.currentThread().join();
	}
	
	public static void workThread(final DubboServiceConsumer consumer){
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 10000; i++) {
					System.out.println("线程 "+Thread.currentThread().getName()+" 当前第 " + i + "次调用: " + consumer.getDubboServiceProvider().getBigObj());
//					try {
//						TimeUnit.SECONDS.sleep(1);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}
			}
		}).start();
	}
}
