package br.coffeeandit.domain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import br.coffeeandit.api.dto.CpfDto;

@Path("/httpFunction")
@RegisterRestClient
public interface CPFService {

    @GET
    CpfDto validarCpf(@QueryParam("cpf") final String cpf);
}
