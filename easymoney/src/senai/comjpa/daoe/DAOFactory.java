package senai.comjpa.daoe;

import senai.comjpa.dao.jpa.CidadeJPADAO;
import senai.comjpa.dao.jpa.ClienteJPADAO;
import senai.comjpa.dao.jpa.ContaJPADAO;
import senai.comjpa.dao.jpa.EmailJPADAO;
import senai.comjpa.dao.jpa.EnderecoJPADAO;
import senai.comjpa.dao.jpa.TelefoneJPADAO;

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
