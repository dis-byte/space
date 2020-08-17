package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.User;

public interface UserDAO {
	//�û���¼
	public List<User> login(User user);

	//�û�ע��
	public void save(User user);
	//����û�
	public void save2(User user);
	//�û��޸�
	public void update(User user);
	//ɾ���û�
	public void delete(User user);
	//����ID�����û�
	public User findById(int id);
	//����
	public User findByName(String name);
	//��ѯ�����û�
	public List<User> findAll();
}
