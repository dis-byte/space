package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.Chengguo;

public interface ChengguoDAO {
	public void save(Chengguo chengguo);
	public void update(Chengguo chengguo);
	public void delete(Chengguo chengguo);
	//����id��ѯ
	public Chengguo findById(int id);
	//name����
	public Chengguo findByName(String name);
	//��ѯ����
	public List<Chengguo> findAll();
}
