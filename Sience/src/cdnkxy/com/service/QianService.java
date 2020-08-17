package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.entity.Qian;
/*
 * ҵ���߼���
 * ��dao�����Ӧ
 */
public interface QianService {
	public void saveQian(Qian qian);
	public void updateQian(Qian qian);
	public void deleteQian(Qian qian);
	public Qian findQianById(int id);
	public Qian findQianByName(String name);
	public List<Qian> findAll();
	//��ҳ
	public List queryForPage(int pageSize,int currentPage);
	public int getRows();
}
