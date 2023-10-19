package br.coffeeandit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/v1/coffee")
@Tag(name = "/v1/coffee", description = "APi de Hello World")
public class HelloWorldController {

	@GET
	@Path("/{name}")
	@Operation(description = "API responsável por retornar o nome para Hello")
	@APIResponses(value = {
			@APIResponse(description = "Retorna 200 com o nome de Hello", responseCode = "200"),
			@APIResponse(description = "Retorna 400 caso parametros errados", responseCode = "400"),
			@APIResponse(description = "Retorna 401 caso token não informado ou expirado", responseCode = "401"),
			@APIResponse(description = "Retorna 500 no caso de erro inexperado", responseCode = "500")
		})
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld(@PathParam("name") final String name) {
		return "Hello " + name;
	}
}
