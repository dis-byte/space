package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.entity.Chengguo;

/*
 * ҵ���߼���
 * ��dao���Ӧ
 */
public interface ChengguoService {
	public void saveChengguo(Chengguo chengguo);
	public void updateChengguo(Chengguo chengguo);
	public void deleteChegnguo(Chengguo chengguo);
	public Chengguo findChengguoById(int id);
	public Chengguo findChengguoByName(String name);
	public List<Chengguo> findAll();
	
	
	
}
