package br.com.easymoney.service;

import java.util.List;

public interface ServiceBase<E,ID> {

	public E getObjeto(ID id);
	public void cadastrar(E e);
	public void editar(E e);
	public void remover(ID id);
	public List<E> listar();
}
