package br.com.easymoney.rest;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;

import br.com.easymoney.service.ServiceBase;

public class RestAbstract<E,ID,SERVICE extends ServiceBase<E,ID>> {

	private Class<E> entidade;
	private Class<SERVICE> service;
	private UtilRest util = new UtilRest();
	
	@SuppressWarnings("unchecked")
	public RestAbstract(){
		
		@SuppressWarnings("rawtypes")
		Class<? extends RestAbstract> realClass = getClass();
		
		ParameterizedType superclass = (ParameterizedType) realClass.getGenericSuperclass();
		
		this.entidade = (Class<E>) superclass.getActualTypeArguments()[0];
		this.service = (Class<SERVICE>) superclass.getActualTypeArguments()[2];
	}
	
	@GET
	//@Path("/getObjeto/{id}")
	@Path("/{id}")
	@Produces("application/*")
	public Response getObjeto(@PathParam("id") ID id){
		
		try{
			SERVICE service = this.service.newInstance();
			
			E e = service.getObjeto(id);
			
			return this.util.retornaSucesso(e);
		}catch(Exception e){
			e.printStackTrace();
			return this.util.retornaErro(e.getMessage());
		}
	}
	
	@GET
	@Produces("application/*")
	public Response listar(){
		
		try{
			SERVICE service = this.service.newInstance();
			
			List<E> e = service.listar();
			
			return this.util.retornaSucesso(e);
		}catch(Exception e){
			e.printStackTrace();
			return this.util.retornaErro(e.getMessage());
		}
	}
	
	@POST
	//@Path("/cadastrar")
	@Produces("application/*")
	@Consumes("application/*")
	public Response cadastrar(String json){
		
		try{
			E e = new ObjectMapper().readValue(json, this.entidade);
			
			SERVICE service = this.service.newInstance();
			
			service.cadastrar(e);
			
			return this.util.retornaSucesso(true);
		}catch(Exception e){
			e.printStackTrace();
			return this.util.retornaErro(e.getMessage());
		}
	}
	
	@PUT
	//@Path("/editar")
	@Produces("application/*")
	@Consumes("application/*")
	public Response editar(String json){
		
		try{
			E e = new ObjectMapper().readValue(json, this.entidade);
			
			SERVICE service = this.service.newInstance();
			
			service.editar(e);
			
			return this.util.retornaSucesso(true);
		}catch(Exception e){
			e.printStackTrace();
			return this.util.retornaErro(e.getMessage());
		}
	}
	
	@DELETE
	//@Path("/remover/{id}")
	@Path("/{id}")
	@Produces("application/*")
	public Response remover(@PathParam("id") ID id){
		
		try{
			SERVICE service = this.service.newInstance();
			
			service.remover(id);
			
			return this.util.retornaSucesso(true);
		}catch(Exception e){
			e.printStackTrace();
			return this.util.retornaErro(e.getMessage());
		}
	}
}
