package br.com.petz.cliente_pet.cliente.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @Getter
    @Entity
    public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
        public UUID idCliente;
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

        public LocalDateTime dataHoraDoCadastro;
        public LocalDateTime daraHoraDaUltimaAlteracao;

//        public Cliente(UUID idCliente, String nomeCompleto, String email, String celular, String telefone, Sexo sexo, LocalDate dataNascimento, String cpf, Boolean aceitaTermos) {
//            this.idCliente = idCliente;
//            this.nomeCompleto = nomeCompleto;
//            this.email = email;
//            this.celular = celular;
//            this.telefone = telefone;
//            this.sexo = sexo;
//            this.dataNascimento = dataNascimento;
//            this.cpf = cpf;
//            this.aceitaTermos = aceitaTermos;
//        }
    }




