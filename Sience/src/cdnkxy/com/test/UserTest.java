package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.User;
import cdnkxy.com.service.UserService;

public class UserTest {
	
	@Test
	public void testLogin() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setName("jack");
		user.setPassword("132");
		List<User> users=userService.login(user);
		if(users.isEmpty()){
			System.out.println("��¼ʧ��");
		}else{
			System.out.println("��¼�ɹ�");
		}
	}

	@Test
	public void testSaveUser() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setName("jsps");
		user.setPassword("333");
		userService.saveUser(user);
		System.out.println("�û�ע��ɹ�");
	}

	@Test
	public void testUpdateUser() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setId(4);
		user.setName("disa");
		user.setPassword("123");
		userService.updateUser(user);
		System.out.println("����ok");
		
	}

	@Test
	public void testDeleteUser() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setId(4);
		user.setName("disa");
		user.setPassword("123");
		userService.deleteUser(user);
		System.out.println("ɾ��ok");
	}

	@Test
	public void testFindUserById() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		
		User users=userService.findUserById(1);
		System.out.println("�û�Id"+users.getId()+"\t�û���"+users.getName()+"\t�û�����"+users.getPassword());
	}

	@Test
	public void testFindAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		List<User> users=userService.findAll();
		Iterator ite=users.iterator();
		while(ite.hasNext()){
			User user=(User) ite.next();
			System.out.println("�û�Id"+user.getId()+"\t�û���"+user.getName()+"\t�û�����"+user.getPassword());
		}
	}

}
