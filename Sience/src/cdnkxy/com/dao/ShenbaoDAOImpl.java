package cdnkxy.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cdnkxy.com.entity.Shenbao;
/*
 * 
 * �걨���ݷ���
 */
public class ShenbaoDAOImpl implements ShenbaoDAO{
	//����sessionFactory
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Shenbao shenbao) {
		// �걨��Ϣ����
		Session session=sessionFactory.getCurrentSession();
		session.save(shenbao);
		
	}

	@Override
	public void update(Shenbao shenbao) {
		// �޸��걨
		Session session=sessionFactory.getCurrentSession();
		session.update(shenbao);
		
	}

	@Override
	public void delete(Shenbao shenbao) {
		// ɾ���걨
		Session session=sessionFactory.getCurrentSession();
		session.delete(shenbao);
		
	}

	@Override
	public Shenbao findById(int id) {
		// ����id�������û�
		Session session=sessionFactory.getCurrentSession();
		String hql="from Shenbao s where id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,id);
		List<Shenbao> slist=query.list();
		Shenbao shenbao=slist.get(0);
		return shenbao;
	}

	@Override
	public List<Shenbao> findAll() {
		// ��ѯ�����û�
		Session session=sessionFactory.getCurrentSession();
		String hql="from Shenbao s";
		Query query=session.createQuery(hql);
		List<Shenbao> slist=query.list();
		return slist;
	}

	@Override
	public Shenbao findByName(String name) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Shenbao s where name=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,name);
		List<Shenbao> slist=query.list();
		Shenbao shenbao=slist.get(0);
		return shenbao;
	}

}
