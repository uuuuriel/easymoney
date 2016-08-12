package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.Telefone;
import senai.comjpa.service.TelefoneService;


@Path("/telefone")
public class TelefoneRest extends RestAbstract<Telefone,Integer,TelefoneService>{}
