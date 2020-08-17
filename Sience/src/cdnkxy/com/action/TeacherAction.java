package cdnkxy.com.action;

import java.util.List;

import cdnkxy.com.entity.Teacher;
import cdnkxy.com.service.TeacherService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport{
	Teacher teacher;
	int id;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	TeacherService teacherService;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	//����
	public String doAdd(){
		teacherService.saveTeacher(teacher);
		return "add";
	}
	//�޸�
	public String doUpdate(){
		teacherService.updateTeacher(teacher);
		return "update";
	}
	//ɾ��
	public String doDelete(){
		Teacher teacher=teacherService.findTeacherById(id);
		teacherService.deleteTeacher(teacher);
		return "delete";
	}
	//���ҵ���
	public String doFind(){
		Teacher t=teacherService.findTeacherById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("t", t);
		return "find";
	}
	//name���ҵ���
		public String doFindName(){
			Teacher te=teacherService.findTeacherByName(name);
			ActionContext ac=ActionContext.getContext();
			ac.put("te", te);
			return "findName";
		}
	//���������걨
	public String doFindAll(){
		List<Teacher> teachers=teacherService.findAll();
		ActionContext ac=ActionContext.getContext();
		ac.put("all", teachers);
		return "findAll";
	}
	//��ʾ��Ϣ���޸�
	public String initUpdate(){
		Teacher teacher=teacherService.findTeacherById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("update", teacher);
		return "init";
	}
}
