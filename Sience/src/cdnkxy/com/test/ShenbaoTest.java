package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Shenbao;
import cdnkxy.com.service.ShenbaoService;

public class ShenbaoTest {

//	@Test
//	public void testSaveShenbao() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
//		Shenbao shenbao=new Shenbao();
//		shenbao.setName("ԭ�ӵ�233");
//		shenbao.setMoney("123");
//		shenbaoService.saveShenbao(shenbao);
//		System.out.println("����ɹ�");
//	}

	@Test
	public void testUpdateShenbao() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
		Shenbao shenbao=new Shenbao();
		shenbao.setId(1);
		shenbao.setName("as");
		shenbao.setMoney("40");
		shenbaoService.updateShenbao(shenbao);
		System.out.println("���³ɹ�");
	}

	@Test
	public void testDeleteShenbao() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
		Shenbao shenbao=new Shenbao();
		shenbao.setId(1);
		shenbao.setName("dis");
		shenbao.setMoney("123");
		System.out.println("ɾ��ok");
	}

//	@Test
//	public void testFindShenbaoById() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
//		
//		Shenbao shenbaos=shenbaoService.findShenbaoById(1);
//		System.out.println("��ĿId"+shenbaos.getId()+"\t��Ŀ��"+shenbaos.getName()+"\t��Ŀ����"+shenbaos.getMoney());
//	}

//	@Test
//	public void testFindAll() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
//		List<Shenbao> shenbaos=shenbaoService.findAll();
//		Iterator ite=shenbaos.iterator();
//		while(ite.hasNext()){
//			Shenbao shenbao=(Shenbao) ite.next();
//			System.out.println("��ĿId"+shenbao.getId()+"\t��Ŀ��"+shenbao.getName()+"\t��Ŀ����"+shenbao.getMoney());
//		}
//	}

}
