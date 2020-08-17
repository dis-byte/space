package cdnkxy.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cdnkxy.com.entity.Chengguo;

public class ChengguoDAOImpl implements ChengguoDAO {
	//����sessionFactory
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Chengguo chengguo) {
		// ����ɹ���Ϣ
		Session session=sessionFactory.getCurrentSession();
		session.save(chengguo);
	}

	@Override
	public void update(Chengguo chengguo) {
		// �޸�
		Session session=sessionFactory.getCurrentSession();
		session.update(chengguo);

	}

	@Override
	public void delete(Chengguo chengguo) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.delete(chengguo);
		
	}

	@Override
	public Chengguo findById(int id) {
		// ����id������
		Session session=sessionFactory.getCurrentSession();
		String hql="from Chengguo c where id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, id);
		List<Chengguo> clist=query.list();
		Chengguo chengguo=clist.get(0);
		return chengguo;
	}

	@Override
	public List<Chengguo> findAll() {
		// // ��ѯ����
		Session session=sessionFactory.getCurrentSession();
		String hql="from Chengguo c";
		Query query=session.createQuery(hql);
		List<Chengguo> clist=query.list();
		return clist;
	}

	@Override
	public Chengguo findByName(String name) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Chengguo c where name=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, name);
		List<Chengguo> clist=query.list();
		Chengguo chengguo=clist.get(0);
		return chengguo;
	}

}
