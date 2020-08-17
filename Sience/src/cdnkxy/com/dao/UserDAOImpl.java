package cdnkxy.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cdnkxy.com.entity.User;
/*
 * �û����ݷ���
 */
public class UserDAOImpl implements UserDAO {
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//�û���¼
	@Override
	public List<User> login(User user) {
		Session session=sessionFactory.getCurrentSession();
		String hql="From User u where name=? and password=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, user.getName());
		query.setParameter(1,user.getPassword());
		List<User> ulist=query.list();
		return ulist;
		
	}
	
	//�����û���ע���û���
	@Override
	public void save(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
	}
	@Override
	public void save2(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
	}
	
	//�û��޸�
	@Override
	public void update(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
	}
	//�û�ɾ��
	@Override
	public void delete(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(user);
	}
	//����id�������û�
	@Override
	public User findById(int id) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User u where id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,id);
		List<User> ulist=query.list();//�����
		User user=ulist.get(0);
		return user;
	}
	//�û�����
			@Override
			public User findByName(String name){
				Session session=sessionFactory.getCurrentSession();
				String hql="from User u where name=?";
				Query query=session.createQuery(hql);
				query.setParameter(0,name);
				List<User> ulist=query.list();//�����
				User user=ulist.get(0);
				return user;
			}
	//��ѯ�����û�
	@Override
	public List<User> findAll() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User u";
		Query query=session.createQuery(hql);
		List<User> ulist=query.list();
		return ulist;
		
	}


}
