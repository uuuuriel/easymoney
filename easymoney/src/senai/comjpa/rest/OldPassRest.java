package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.OldPass;
import senai.comjpa.service.OldPassService;


@Path("/oldpass")
public class OldPassRest extends RestAbstract<OldPass,Integer,OldPassService>{}
