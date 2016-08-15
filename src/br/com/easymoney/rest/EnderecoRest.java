package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.Endereco;
import br.com.easymoney.service.EnderecoService;


@Path("/endereco")
public class EnderecoRest extends RestAbstract<Endereco,Integer,EnderecoService>{}
