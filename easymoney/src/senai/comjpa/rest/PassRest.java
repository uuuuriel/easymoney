package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.Pass;
import senai.comjpa.service.PassService;


@Path("/pass")
public class PassRest extends RestAbstract<Pass,Integer,PassService>{}
