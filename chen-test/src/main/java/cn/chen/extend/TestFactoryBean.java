package cn.chen.extend;

import cn.chen.dao.ChenService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author chenzepeng
 * @date 2019-09-30
 */
//@Component("test")
public class TestFactoryBean implements FactoryBean<ChenService> {
	@Override
	public ChenService getObject() throws Exception {
		return new ChenService();
	}

	@Override
	public Class<?> getObjectType() {
		return ChenService.class;
	}
}
