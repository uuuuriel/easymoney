package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.Conta;
import senai.comjpa.service.ContaService;


@Path("/conta")
public class ContaRest extends RestAbstract<Conta,Integer,ContaService>{}
