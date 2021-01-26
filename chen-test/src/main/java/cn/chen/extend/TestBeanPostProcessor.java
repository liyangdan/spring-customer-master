package cn.chen.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * @author chenzepeng
 * @date 2019-09-30
 */
//@Component
//@Order(1)
public class TestBeanPostProcessor implements MergedBeanDefinitionPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("chenService".equals(beanName)) {
			System.out.println(beanName + "   hhhhhh");
		}
        return bean;
    }



    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//    	if("test".equals(beanName)) {
//			System.out.println(beanName + "   ssssss");
//		}
        return bean;
    }

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

	}


//	@Override
//	public int getOrder() {
//		return 2;
//	}
}
