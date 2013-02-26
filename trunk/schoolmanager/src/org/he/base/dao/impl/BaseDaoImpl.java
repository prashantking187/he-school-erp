package org.he.base.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;

import org.he.base.dao.BaseDao;
import org.he.common.spring.support.SpringInit;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	public void delete(T t) {
		getHibernateTemplate().delete(t);
	}

	public Integer delete(final  Iterable iterable) {
		return (Integer) getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						// 开始事务
						int i = 0;
						for (Iterator it = iterable.iterator(); it.hasNext();) {
							Object object = it.next();
							// 在Session级别缓存Object实例
							session.delete(object);
							// 每当累加器是20的倍数时，将Session中的数据刷入数据库，并清空Session缓存
							if (i % 20 == 0) {
								session.flush();
								session.clear();
							}
							i++;
						}
						return i;
					}
				});
	}

	public void evict(T t) {
		getHibernateTemplate().evict(t);
	}

	public Integer save(final Iterable iterable) {
		return (Integer) getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						// 开始事务
						int i = 0;
						for (Iterator it = iterable.iterator(); it.hasNext();) {
							Object object = it.next();
							// 在Session级别缓存Object实例
							session.save(object);
							// 每当累加器是20的倍数时，将Session中的数据刷入数据库，并清空Session缓存
							if (i % 20 == 0) {
								session.flush();
								session.clear();
							}
							i++;
						}
						return i;
					}
				});
	}

	public Serializable save(T t) {
		return getHibernateTemplate().save(t);
	}

	public Integer update(final Iterable iterable) {
		
	return (Integer)	getHibernateTemplate().execute(new HibernateCallback<Object>() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				 //开始事务
			    int i = 0;
			    for (Iterator it = iterable.iterator(); it.hasNext() ; ) 
			    {
			    	Object object = it.next();
			        //在Session级别缓存Object实例
			        session.update(object);
			        //每当累加器是20的倍数时，将Session中的数据刷入数据库，并清空Session缓存
			        if (i % 20 == 0)
			        {
			            session.flush();
			            session.clear();
			        }
			        i++;
			    }
				return i;
			}
		});
	}

	public void  update(T t) {
		getHibernateTemplate().update(t);
	}

}
