package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.Shenbao;

public interface ShenbaoDAO {
	//��ɾ�Ĳ�
	public void save(Shenbao shenbao);
	public void update(Shenbao shenbao);
	public void delete(Shenbao shenbao);
	//����id��ѯ 
	public Shenbao findById(int id);
	//
	public Shenbao findByName(String name);
	//��ѯ�����걨
	public List<Shenbao> findAll();
}
