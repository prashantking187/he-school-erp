package org.he.base.service;

import java.io.Serializable;

/**
 * 
 * <p>
 * Title: BaseService
 * </p>
 * 
 * <p>
 * Description: 可对T类型的数据进行添加、更新、删除、根据主键进行查询。 T可为任意hibernate映射后的实体
 * </p>
 * 
 * <p>
 * Company:
 * </p>
 * 
 * @author huangpromise@gmail.com
 * 
 * @date 2012-10-29
 */
public interface BaseService<T> {

	/**
	 * 
	 * <p>
	 * Title: save
	 * </p>
	 * 
	 * <p>
	 * Description: 将t添加至数据库
	 * </p>
	 * 
	 * @param t
	 * @return 返回新记录的主键
	 */
	public Serializable save(T t);

	/**
	 * * @Title: save
	 * 
	 * @Description: TODO 批量增加
	 * @param list
	 *               需要增加到数据库的数据列表
	 * @return void   
	 * @throws
	 */
	public Integer save(Iterable iterable);

	/**
	 * 
	 * <p>
	 * Title: update
	 * </p>
	 * 
	 * <p>
	 * Description: 将t进行更新
	 * </p>
	 * 
	 * @param t
	 */
	public void update(T t);

	/**
	 * 
	 * <p>
	 * Title: update
	 * </p>
	 * 
	 * <p>
	 * Description: 批量更新
	 * </p>
	 * 
	 * @param collection
	 *            需要更新的集合
	 */
	public Integer update(Iterable iterable);

	/**
	 * 
	 * <p>
	 * Title: delete
	 * </p>
	 * 
	 * <p>
	 * Description:从数据库中删除t记录
	 * </p>
	 * 
	 * @param t
	 */
	public void delete(T t);

	/**
	 * * @Title: save
	 * 
	 * @Description: TODO 批量删除
	 * @param list
	 *               需要删除到数据库的数据列表
	 * @return void   
	 * @throws
	 */
	public Integer delete(Iterable iterable);

	/**
	 * <p>
	 * Title: evictEntity
	 * </p>
	 * <p>
	 * Description: Evicts the entity data for a particular entity "instance".
	 * </p>
	 * 
	 * @param entityName
	 *            The entity name.
	 * @param identifier
	 *            The entity identifier
	 */
	public void evict(T t);
	

	/**
	 * <p>
	 * Title: evictEntity
	 * </p>
	 * <p>
	 * Description:  根据id获取实体对象
	 * </p>
	 * 
	 * @param entityClass
	 *            The entity class.
	 * @param id
	 *            The entity identifier
	 */
	public T getEntity(Class<T> entityClass, Serializable id);
	
	
}
