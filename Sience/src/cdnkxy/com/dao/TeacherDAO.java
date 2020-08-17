package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.Teacher;





public interface TeacherDAO {
	
	//����
	public void save(Teacher teacher);
	//�޸�
	public void update(Teacher teacher);
	//ɾ��
	public void delete(Teacher teacher);
	//����ID����
	public Teacher findById(int id);
	//name����
	public Teacher findByName(String name);
	//��ѯ����
	public List<Teacher> findAll();
}
