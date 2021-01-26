package cn.chen.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenzepeng
 * @date 2019-09-26
 */
@Service
public class TestDao implements BasicDao{

//	private  ChenDao chenDao;
//	private  String aa;

//	@Autowired
//	public TestDao(List<ChenDao> chenDaos) {
//		System.out.println("TestDao11111");
////		this.chenDao = chenDao;
//	}
////	@Autowired
////	public TestDao() {
////		System.out.println("TestDao2222");
////	}
//
////	@Autowired(required = false)
//	public TestDao(ChenDao chenDao, String aa) {
//		System.out.println("TestDao33333");
//		this.chenDao = chenDao;
//		this.aa = aa;
//
//	}

	public void hello(){
		System.out.println("tttttttt");
	}
}
