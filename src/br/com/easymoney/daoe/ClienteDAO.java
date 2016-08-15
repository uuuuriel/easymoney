package br.com.easymoney.daoe;

import java.sql.SQLException;

import br.com.easymoney.dao.jpa.Crud;
import br.com.easymoney.pojo.Cidade;
import br.com.easymoney.pojo.Cliente;

public interface ClienteDAO  extends Crud<Cliente,Integer>{}