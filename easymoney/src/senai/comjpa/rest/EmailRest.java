package senai.comjpa.rest;

import javax.ws.rs.Path;

import senai.comjpa.pojo.Email;
import senai.comjpa.service.EmailService;


@Path("/email")
public class EmailRest extends RestAbstract<Email,Integer,EmailService>{}
