package cn.chen.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzepeng
 * @date 2019-09-25
 */
@Service
public class ChenService implements ApplicationContextAware {


    ApplicationContext applicationContext;

//    @Autowired
    private ChenDao chenDao;

//    @Resource
//    private BasicDao testDao;



    @Required
	@Autowired(required = false)
    public void setChenDao(ChenDao chenDao) {
        this.chenDao = chenDao;
    }


    public void hello() {
    	chenDao.hello();
//        System.out.println("init   "+ testDasssssso);
//        List<ChenDao> list = new ArrayList<>();
//        list.addAll(testDasssssso);
//        list.add(chenDao);
//		System.out.println("initwwww   "+ list);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("dddd");
        this.applicationContext = applicationContext;
    }
    //
    // @PostConstruct
    // public void initIII() {
    // System.out.println("init " + chenDao);
    // }
    //
    //
    // @Override
    // public void afterPropertiesSet() throws Exception {
    // System.out.println("after " + chenDao);
    // }
}
