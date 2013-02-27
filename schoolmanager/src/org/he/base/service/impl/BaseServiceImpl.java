package org.he.base.service.impl;

import java.io.Serializable;

import org.he.base.dao.BaseDao;
import org.he.base.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
	private BaseDao<T> baseDao;
	
	

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public Serializable save(T t) {
		return baseDao.save(t);
	}

	public Integer save(Iterable iterable) {
		return baseDao.save(iterable);
	}

	public void update(T t) {
		baseDao.update(t);
	}

	public Integer update(Iterable iterable) {
		return baseDao.update(iterable);
	}

	public void delete(T t) {
		baseDao.delete(t);
	}

	public Integer delete(Iterable iterable) {
		return baseDao.delete(iterable);
	}

	public void evict(T t) {
		baseDao.evict(t);
	}

	/* (非 Javadoc) 
	* <p>Title: getEntity</p>
	* <p>Description: </p>
	* @see org.he.base.service.BaseService#getEntity(java.lang.Class, java.io.Serializable) 
	*/ 
	public T getEntity(Class<T> entityClass, Serializable id) {
		return  baseDao.getEntity(entityClass, id);
	}

}
