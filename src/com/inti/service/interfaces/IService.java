package com.inti.service.interfaces;

import java.util.List;

public interface IService<T> {

	void save(T obj);

	void update(T obj);

	void remove(Long id);

	List<T> findAll(Class<?> c);

	T findOne(Class<?> c, Long id);

}
