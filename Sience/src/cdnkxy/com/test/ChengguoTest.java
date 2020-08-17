package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Chengguo;
import cdnkxy.com.service.ChengguoService;

public class ChengguoTest {

//	@Test
//	public void testSaveChengguo() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
//		Chengguo chengguo=new Chengguo();
//		chengguo.setName("������");
//		chengguoService.saveChengguo(chengguo);
//		System.out.println("���ok");
//	}

	@Test
	public void testUpdateChengguo() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
		Chengguo chengguo=new Chengguo();
		chengguo.setId(1);
		chengguo.setName("Ψ�Ҷ���");
		System.out.println("����ok");
	}

	@Test
	public void testDeleteChegnguo() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
		Chengguo chengguo=new Chengguo();
		chengguo.setId(1);
		chengguo.setName("Ψ�Ҷ���");
		chengguoService.deleteChegnguo(chengguo);
		System.out.println("ɾ��ok");
	}

//	@Test
//	public void testFindChengguoById() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
//		Chengguo chengguos=chengguoService.findChengguoById(1);
//		System.out.println("�ɹ�Id"+chengguos.getId()+"\t�ɹ���"+chengguos.getName());
//	}
//
//	@Test
//	public void testFindAll() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
//		List<Chengguo> chengguos=chengguoService.findAll();
//		Iterator ite=chengguos.iterator();
//		while(ite.hasNext()){
//			Chengguo chengguo=(Chengguo) ite.next();
//			System.out.println("�ɹ�Id"+chengguo.getId()+"\t�ɹ���"+chengguo.getName());
//		}
//	}

}
