package senai.comjpa.service;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import senai.comjpa.dao.jpa.Crud;
import senai.comjpa.daoe.DAOFactory;

public class ServiceAbstract<E,ID,DAO extends Crud<E,ID>> implements ServiceBase<E,ID>{

	private DAO dao;
	
	@SuppressWarnings("unchecked")
	public ServiceAbstract(){
		
		@SuppressWarnings("rawtypes")
		Class<? extends ServiceAbstract> realClass = getClass();
		
		ParameterizedType superclass = (ParameterizedType) realClass.getGenericSuperclass();
		
		Class<DAO> dao = (Class<DAO>) superclass.getActualTypeArguments()[2];
		
		this.dao = (DAO) DAOFactory.getInstanceOf(dao);
	}
	
	public E getObjeto(ID id) {
		return this.dao.getObjeto(id);
	}

	public void cadastrar(E e) {
		this.dao.cadastrar(e);
	}

	public void editar(E e) {
		this.dao.editar(e);
	}

	public void remover(ID id) {
		this.dao.remover(id);
	}

	public List<E> listar(){
		return this.dao.listar();
	}
}
