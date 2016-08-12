package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.Endereco;
import senai.comjpa.service.EnderecoService;


@Path("/endereco")
public class EnderecoRest extends RestAbstract<Endereco,Integer,EnderecoService>{}
