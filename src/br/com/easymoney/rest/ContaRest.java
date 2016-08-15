package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.Conta;
import br.com.easymoney.service.ContaService;


@Path("/conta")
public class ContaRest extends RestAbstract<Conta,Integer,ContaService>{}
