package br.com.petz.cliente_pet.cliente.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    public UUID idCliente;
    public String nomeCompleto;
    public String email;
    public String celular;
    public String cpf;
}
