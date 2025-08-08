package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
@Value
public class ClienteAlteracaoRequest {
    @NotBlank
    public String nomeCompleto;
    @NotBlank
    public String celular;
    public String telefone;
    public Sexo sexo;
    @NotNull
    public LocalDate dataNascimento;
    @NotNull
    public Boolean aceitaTermos;
}
