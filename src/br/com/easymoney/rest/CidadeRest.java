package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.Cidade;
import br.com.easymoney.service.CidadeService;


@Path("/cidade")
public class CidadeRest extends RestAbstract<Cidade,Integer,CidadeService>{}
