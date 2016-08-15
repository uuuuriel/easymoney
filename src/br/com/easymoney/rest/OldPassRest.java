package br.com.easymoney.rest;

import javax.ws.rs.Path;

import br.com.easymoney.pojo.OldPass;
import br.com.easymoney.service.OldPassService;


@Path("/oldpass")
public class OldPassRest extends RestAbstract<OldPass,Integer,OldPassService>{}
