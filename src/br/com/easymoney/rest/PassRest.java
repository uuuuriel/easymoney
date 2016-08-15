package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.Pass;
import br.com.easymoney.service.PassService;


@Path("/pass")
public class PassRest extends RestAbstract<Pass,Integer,PassService>{}
