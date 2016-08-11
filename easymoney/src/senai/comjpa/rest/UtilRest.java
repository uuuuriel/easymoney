package senai.comjpa.rest;

import java.io.File;
import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.codehaus.jackson.map.ObjectMapper;

public class UtilRest {

	// Metodo para retornar uma mensagem de sucesso.
	public Response retornaSucesso(Object msg){
		
		StringWriter fw = new StringWriter();
		try{
			ObjectMapper mapper = new ObjectMapper();
			
			mapper.writeValue(fw, msg);
			
			return Response.ok(fw.toString()).build();
		}catch(Exception ex){
			return this.retornaErro(ex.getMessage());
		}
	}
	
	// Metodo para retornar um erro.
	public Response retornaErro(String mens){
		
		ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		
		rb = rb.entity(mens);
		
		rb = rb.type("text/plain");
		
		return rb.build();
	}
	
	// Metodo para retornar texto plano.
	public Response retornaTextoPlano(String texto){
		
		return Response.ok(texto).type(MediaType.TEXT_PLAIN).build();
	}

	public Response retornaDownload(File arquivo) {
		
		String extensao = this.retornaExtensaoArquivo(arquivo);
		
		ResponseBuilder response = Response.ok((Object) arquivo);
		
		response.header("Content-Disposition", "attachment; filename=\"anexo."+ extensao +"\"");
		
		return response.build();
	}

	private String retornaExtensaoArquivo(File arquivo) {
		
		String[] nomeArray = arquivo.getName().split("\\.");
		
		String extensao = nomeArray[nomeArray.length - 1];
		
		return extensao;
	}
}
