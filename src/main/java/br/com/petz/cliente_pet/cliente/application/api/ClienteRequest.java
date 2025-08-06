package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.domain.Sexo;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Value
public class ClienteRequest {
    @NotBlank
    public String nomeCompleto;
    @NotBlank
    @Email
    @Column(unique = true)
    public String email;
    @NotBlank
    public String celular;
    public String telefone;
    public Sexo sexo;
    @NotNull
    public LocalDate dataNascimento;
    @CPF
    @Column(unique = true)
    public String cpf;
    @NotNull
    public Boolean aceitaTermos;
}
