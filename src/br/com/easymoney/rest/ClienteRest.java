package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.Cliente;
import br.com.easymoney.service.ClienteService;


@Path("/cliente")
public class ClienteRest extends RestAbstract<Cliente,Integer,ClienteService>{}
