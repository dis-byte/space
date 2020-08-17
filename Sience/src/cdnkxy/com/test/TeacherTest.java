package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Teacher;
import cdnkxy.com.service.TeacherService;



public class TeacherTest {

//	@Test
//	public void testSaveTeacher() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
//		Teacher teacher =new Teacher();
//		teacher.setName("��ʦү�Ķ���ү");
//		teacher.setGender("��");
//		teacher.setAddress("�»�����·����һ¥");
//		teacher.setTel("13378283838");
//		teacher.setPosition("����ָ����ʦ");
//		teacher.setInfo("������");
//		teacherService.saveTeacher(teacher);
//		System.out.println("����ɹ�");
//	}

//	@Test
//	public void testUpdateTeacher() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
//		Teacher teacher=new Teacher();
//		teacher.setId(1);
//		teacher.setName("����ʦ");
//		teacher.setAddress("������·��һ��");
//		teacherService.updateTeacher(teacher);
//		System.out.println("����ok");
//		
//	}
//
//	@Test
//	public void testDeleteTeacher() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
//		Teacher teacher=new Teacher();
//		teacher.setId(1);
//		System.out.println("ɾ��ok");
//	}

	@Test
	public void testFindTeacherById() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
		Teacher teachers=teacherService.findTeacherById(2);
		System.out.println("id"+teachers.getId()+"\t����"+teachers.getName()+"\t�Ա�"+teachers.getGender()+"\tסַ"+teachers.getAddress()+"\t�绰"+teachers.getTel()+"\tְλ"+teachers.getPosition()+"\t��Ϣ"+teachers.getInfo());
		
	}

	@Test
	public void testFindAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
		List<Teacher> teachers=teacherService.findAll();
		Iterator ite=teachers.iterator();
		while(ite.hasNext()){
			Teacher teacher=(Teacher) ite.next();
			System.out.println("id"+teacher.getId()+"\t����"+teacher.getName()+"\t�Ա�"+teacher.getGender()+"\tסַ"+teacher.getAddress()+"\t�绰"+teacher.getTel()+"\tְλ"+teacher.getPosition()+"\t��Ϣ"+teacher.getInfo());
			
		}
	}

}
