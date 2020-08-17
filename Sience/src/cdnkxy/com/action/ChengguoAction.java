package cdnkxy.com.action;

import java.util.List;

import cdnkxy.com.entity.Chengguo;
import cdnkxy.com.service.ChengguoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChengguoAction extends ActionSupport {
	
	Chengguo chengguo;
	int id;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	ChengguoService chengguoService;
	public Chengguo getChengguo() {
		return chengguo;
	}
	public void setChengguo(Chengguo chengguo) {
		this.chengguo = chengguo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ChengguoService getChengguoService() {
		return chengguoService;
	}
	public void setChengguoService(ChengguoService chengguoService) {
		this.chengguoService = chengguoService;
	}
	
	//����
	public String doAdd(){
		chengguoService.saveChengguo(chengguo);
		return "add";
	}
	public String doUpdate(){
		chengguoService.updateChengguo(chengguo);
		return "update";
	}
	//ɾ��
	public String doDelete(){
		Chengguo chenguo=chengguoService.findChengguoById(id);
		chengguoService.deleteChegnguo(chenguo);
		return "delete";
	}
	//���ҵ���
	public String doFind(){
		Chengguo c=chengguoService.findChengguoById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("c", c);
		return "find";
	}
	//name����
	public String doFindName(){
		Chengguo ch=chengguoService.findChengguoByName(name);
		ActionContext ac=ActionContext.getContext();
		ac.put("ch", ch);
		return "findName";
	}
	//��������
	public String doFindAll(){
		List<Chengguo> chengguos=chengguoService.findAll();
		ActionContext ac=ActionContext.getContext();
		ac.put("all", chengguos);
		return "findAll";
	}
	//��ʾ��Ϣ�޸�
	public String initUpdate(){
		Chengguo chengguo=chengguoService.findChengguoById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("update", chengguo);
		return "init";
	}
}
