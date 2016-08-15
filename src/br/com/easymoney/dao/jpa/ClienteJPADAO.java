package br.com.easymoney.dao.jpa;

import br.com.easymoney.daoe.ClienteDAO;
import br.com.easymoney.pojo.Cliente;

public class ClienteJPADAO extends JPAAbstract<Cliente, Integer> implements ClienteDAO {}