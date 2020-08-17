package cdnkxy.com.action;

import java.util.List;

import cdnkxy.com.entity.User;
import cdnkxy.com.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	User user;
	int id;//�û����
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	UserService userService;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//��¼
	public String doLogin(){
		List<User> lists=userService.login(user);
		if(lists.size()>0){
			return "success";
		}else{
			return "fail";
		}
	}
	//�û����
	public String doAdd(){
		userService.saveUser(user);
		return "add";
	}
	//�û�ע��
	public String rigister(){
		userService.saveUser(user);
		return "rigister";
	}
	//�޸��û�
	public String doUpdate(){
		userService.updateUser(user);
		return "update";
	}
	//ɾ���û�
	public String doDelete(){
		//����id��ѯ�û�
		User user=userService.findUserById(id);
		//ɾ���û�
		userService.deleteUser(user);
		return "delete";
	}
	//Id��ѯ�����û�
	public String doFind(){
		User u=userService.findUserById(id);
		//���û�����ֵջ
		ActionContext ac=ActionContext.getContext();
		ac.put("u", u);
		return "find";
	}
	//name��ѯ�û�
	public String doFindName(){
		User ua = userService.findUserByName(name);
		ActionContext ac = ActionContext.getContext();
		ac.put("ua", ua);
		return "findName";
	}
	//select all user
	public String doFindAll(){
		List<User> users=userService.findAll();
		//���û���Ϣ����ֵջ
		ActionContext ac=ActionContext.getContext();
		ac.put("all", users);
		return "findAll";
	}
	//��ʾ�û���ǰ��Ϣ���޸�
	public String initUpdate(){
		User user=userService.findUserById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("update", user);
		return "init";
	}
}
