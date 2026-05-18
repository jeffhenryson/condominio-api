package io.github.devJeff.acesso_api.adapter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.devJeff.acesso_api.adapter.converters.VisitanteConverter;
import io.github.devJeff.acesso_api.adapter.dtos.VisitanteDto;
import io.github.devJeff.acesso_api.core.domain.Visitante;
import io.github.devJeff.acesso_api.core.ports.VisitanteServicePort;
import lombok.RequiredArgsConstructor;

import java.util.stream.Collectors;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteServicePort visitanteServicePort;

    private final VisitanteConverter visitanteConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitanteDto create(@RequestBody VisitanteDto visitanteDto) {
        Visitante visitante = visitanteServicePort.createVisitante(visitanteConverter.toDomain(visitanteDto));
        return visitanteConverter.toDto(visitante);
    }

    @GetMapping("/{rg}")
    public VisitanteDto obtainByRg(@RequestParam String rg) {j
        return visitanteConverter.toDto(visitanteServicePort.obtainByRg(rg));
    }

    @GetMapping("")
    public List<VisitanteDto> listall() {
        return visitanteServicePort.listAll().stream().map(visitanteConverter::toDto).collect(Collectors.toList());
    }
}