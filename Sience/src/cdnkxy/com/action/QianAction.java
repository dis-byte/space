package cdnkxy.com.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cdnkxy.com.bean.PageBean;
import cdnkxy.com.bean.PageHelper;
import cdnkxy.com.entity.Qian;
import cdnkxy.com.service.QianService;



public class QianAction {
	Qian qian;
	int id;
	String name;
	private int currentPage = 1;
    private PageBean pageBean;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	QianService qianService;
	public Qian getQian() {
		return qian;
	}
	public void setQian(Qian qian) {
		this.qian = qian;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public QianService getQianService() {
		return qianService;
	}
	public void setQianService(QianService qianService) {
		this.qianService = qianService;
	}
	
	
	//��ӹ���
	public String doAdd(){
		qianService.saveQian(qian);
		return "add";
	}
	public String doUpdate(){
		qianService.updateQian(qian);
		return "update";
	}
	//
	public String doDelete(){
		Qian qian=qianService.findQianById(id);
		qianService.deleteQian(qian);
		return "delete";
	}
	//
	public String doFind(){	
		Qian q=qianService.findQianById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("q", q);
		return "find";
	}
	//
	public String doFindName(){	
		Qian qi=qianService.findQianByName(name);
		ActionContext ac=ActionContext.getContext();
		ac.put("qi", qi);
		return "findName";
	}
	//��������
	public String doFindAll(){
		List<Qian> qians=qianService.findAll();
		ActionContext ac=ActionContext.getContext();
		ac.put("all", qians);
		return "findAll";
	}
	//��ʾ��Ϣ���޸�
	public String initUpdate(){
		Qian qian=qianService.findQianById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("update", qian);
		return "init";
	}
	//��ҳ
	  public String showComment()
	    {       
	        int rows = 0;       
	        rows = qianService.getRows();
	        PageBean page = PageHelper.getPage(currentPage, rows);  
	        page.setStartRow((currentPage-1) * page.getPageSize());
	        List<Qian> qian = (List<Qian>)qianService.queryForPage(page.getPageSize(), page.getStartRow());
	        Map request = (Map) ActionContext.getContext().get("request");
	        request.put("qian", qian); //protected Map<String, Object> request;
	        request.put("page", page);
	        return "success";
	    }
}
