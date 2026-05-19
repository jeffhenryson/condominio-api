package io.github.devJeff.acesso_api.adapter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.devJeff.acesso_api.adapter.converters.MoradorConverter;
import io.github.devJeff.acesso_api.adapter.dtos.MoradorDto;
import io.github.devJeff.acesso_api.core.domain.Morador;
import io.github.devJeff.acesso_api.core.ports.MoradorServicePort;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    private final MoradorServicePort moradorServicePort;
    private final MoradorConverter moradorConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MoradorDto create(@RequestBody MoradorDto moradorDto) {
        Morador novoMorador = moradorServicePort.createMorador(moradorConverter.toDomain(moradorDto));
        return moradorConverter.toDto(novoMorador);
    }

    @GetMapping
    public Collection<MoradorDto> findAll() {
        return moradorServicePort.findAll().stream().map(moradorConverter::toDto).toList();
    }
}
