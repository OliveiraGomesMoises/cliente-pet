package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.application.service.ClienteService;
import br.com.petz.cliente_pet.handler.ApiException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente");
        return clienteCriado;
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - getTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
        log.info("[finaliza] ClienteController - getTodosClientes");
        return clientes;
    }

    @Override
    public ClienteDetalhadoResponse getClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteController - getClientePorId");
        log.info("[idCliente] {}",idCliente);
        ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClientePorId(idCliente);
        log.info("[finaliza] ClienteController - getClientePorId");
        return clienteDetalhado;
    }

    @Override
    public void deletaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteController - deletaClientePorId");
        log.info("[idClinete] {}",idCliente);
        clienteService.deletaClientePorId(idCliente);
        log.info("[finaliza] ClienteController - deletaClientePorId");

    }

    @Override
    public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia] ClienteController - patchAlteraCliente");
        log.info("[idClinete] {}",idCliente);
        clienteService.alteraClientePorId(idCliente, clienteAlteracaoRequest);
        log.info("[finaliza] ClienteController - patchAlteraCliente");
    }
}
