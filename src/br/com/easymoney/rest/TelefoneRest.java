package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.Telefone;
import br.com.easymoney.service.TelefoneService;


@Path("/telefone")
public class TelefoneRest extends RestAbstract<Telefone,Integer,TelefoneService>{}
