package cn.chen;

import cn.chen.config.ChenConfig;
import cn.chen.dao.ChenDao;
import cn.chen.dao.ChenService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenzepeng
 * @date 2019-08-28
 */

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ChenConfig.class);

		ChenService dao = context.getBean(ChenService.class);
		dao.hello();

//		ChenService chenService =  context.getBean(ChenService.class);
//		chenService.hello();
	}
}
