package io.github.devJeff.acesso_api.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.devJeff.acesso_api.core.ports.MoradorRepositoryPort;
import io.github.devJeff.acesso_api.core.ports.MoradorServicePort;
import io.github.devJeff.acesso_api.core.ports.UsuarioRepositoryPort;
import io.github.devJeff.acesso_api.core.ports.UsuarioServicePort;
import io.github.devJeff.acesso_api.core.ports.VisitanteRepositoryPort;
import io.github.devJeff.acesso_api.core.ports.VisitanteServicePort;
import io.github.devJeff.acesso_api.core.services.MoradorService;
import io.github.devJeff.acesso_api.core.services.UsuarioService;
import io.github.devJeff.acesso_api.core.services.VisitanteService;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort){
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public MoradorServicePort moradorServicePort(MoradorRepositoryPort moradorRepositoryPort){
        return new MoradorService(moradorRepositoryPort);
    }

    @Bean
    public VisitanteServicePort VisitanteServicePort(VisitanteRepositoryPort visitanteRepositoryPort){
        return new VisitanteService(visitanteRepositoryPort);
    }
}
