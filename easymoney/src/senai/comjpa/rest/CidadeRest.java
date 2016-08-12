package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.Cidade;
import senai.comjpa.service.CidadeService;


@Path("/cidade")
public class CidadeRest extends RestAbstract<Cidade,Integer,CidadeService>{}
