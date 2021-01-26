package cn.chen.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author chenzepeng
 * @date 2019-08-28
 */
//@Service
public class ChenDao implements BasicDao{




//	@PostConstruct
//	public void initIII(){
//		System.out.println("dfdfdfdfdf");
//	}
//
	public void hello(){
		System.out.println("hello,asdsddsdsd world");
	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("ddddddddddd");
//	}
}
