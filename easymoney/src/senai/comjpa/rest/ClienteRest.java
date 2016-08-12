package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.Cliente;
import senai.comjpa.service.ClienteService;


@Path("/cliente")
public class ClienteRest extends RestAbstract<Cliente,Integer,ClienteService>{}
