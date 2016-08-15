package br.com.easymoney.daoe;

import br.com.easymoney.dao.jpa.CidadeJPADAO;
import br.com.easymoney.dao.jpa.ClienteJPADAO;
import br.com.easymoney.dao.jpa.ContaJPADAO;
import br.com.easymoney.dao.jpa.EmailJPADAO;
import br.com.easymoney.dao.jpa.EnderecoJPADAO;
import br.com.easymoney.dao.jpa.TelefoneJPADAO;

public class DAOFactory {
	
	@SuppressWarnings("rawtypes")
	public static Object getInstanceOf(Class c) {
		if ( c.equals(ClienteDAO.class) ) {
			return new ClienteJPADAO();
		} else if ( c.equals(CidadeDAO.class) ) {
			return new CidadeJPADAO();
		} else if ( c.equals(ContaDAO.class) ) {
			return new ContaJPADAO();
		} else if ( c.equals(EmailDAO.class) ) {
			return new EmailJPADAO();
		} else if ( c.equals(EnderecoDAO.class) ) {
			return new EnderecoJPADAO();
		} else if ( c.equals(TelefoneDAO.class) ) {
			return new TelefoneJPADAO();
		}
		return null;
	}
}
