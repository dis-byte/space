package cdnkxy.com.test;



import javassist.bytecode.Descriptor.Iterator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Qian;
import cdnkxy.com.service.QianService;
/*
 * ����Service��ʵ����
 */
public class QianTest {

//	@Test
//	public void testSaveQian() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		Qian qian=new Qian();
//		qian.setName("�Ƽ��������ľ���");
//		qian.setMoney(22423);
//		qianService.saveQian(qian);
//		System.out.println("����ok");
//	}
	
	
	//hbm.xml���ú�entity����������ƥ��
//	@Test
//	public void testUpdateQian() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		Qian qian=new Qian();
//		qian.setId(1);
//		qian.setName("diss");
//		qian.setMoney(1223);
//		qianService.updateQian(qian);
//		System.out.println("����ok");
//	}

//	@Test
//	public void testDeleteQian() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		Qian qian=new Qian();
//		qian.setId(2);
//		qian.setName("������");
//		qian.setMoney(2342);
//		qianService.deleteQian(qian);
//		System.out.println("ɾ��ok");
//	}

//	@Test
//	public void testFindQianById() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		
//		Qian qians=qianService.findQianById(3);
//		System.out.println("id="+qians.getId()+"\t����="+qians.getName()+"\t����="+qians.getMoney());
//		
//		
//	}

//	@Test
//	public void testFindAll() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		List(Qian) qians=qianService.findAll();
//		Iterator ite=qians.iterator();
//		while(ite.hasNext()){
//			Qian qian=ite.next();
//			System.out.println("id="+qian.getId()+"\t����="+qian.getName()+"\t����="+qian.getMoney());
//		}
//	}

}
