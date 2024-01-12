package br.com.petz.clientepet.pet.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.pet.application.service.Petservice;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {
    
	private final Petservice petservice;
	@Override
	public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia] PetControlle - postPet");
		log.info("[idCliente] {}", idCliente);
		PetResponse pet = petservice.criaPet(idCliente,petRequest);
		log.info("[finaliza] PetControlle - postPet");
		return pet;
	}

}
