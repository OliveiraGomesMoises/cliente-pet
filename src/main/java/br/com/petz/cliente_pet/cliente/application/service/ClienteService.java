package br.com.petz.cliente_pet.cliente.application.service;

import br.com.petz.cliente_pet.cliente.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClientePorId(UUID idCliente);
    void deletaClientePorId(UUID idCliente);
    void alteraClientePorId(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}
