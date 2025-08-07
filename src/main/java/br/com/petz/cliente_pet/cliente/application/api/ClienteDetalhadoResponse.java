package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.domain.Cliente;
import br.com.petz.cliente_pet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    public UUID idCliente;
    public String nomeCompleto;
    public String email;
    public String celular;
    public String cpf;
    public Sexo sexo;
    public LocalDate dataNascimento;
    public Boolean aceitaTermos;
    public LocalDateTime dataHoraDoCadastro;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
        this.sexo = cliente.getSexo();
        this.dataNascimento = cliente.getDataNascimento();
        this.aceitaTermos = cliente.getAceitaTermos();
        this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
    }
}
