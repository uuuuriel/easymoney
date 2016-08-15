package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.Email;
import br.com.easymoney.service.EmailService;


@Path("/email")
public class EmailRest extends RestAbstract<Email,Integer,EmailService>{}
