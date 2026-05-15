package io.github.devJeff.acesso_api.core.domain;

import java.time.LocalDateTime;

public class Visita {

    private Long id;
    private LocalDateTime datahora;
    private Long idMorador;
    private Long idVisitante;

    public Visita() {
    }

    public Visita(Long id, LocalDateTime datahora, Long idMorador, Long idVisitante) {
        this.id = id;
        this.datahora = datahora;
        this.idMorador = idMorador;
        this.idVisitante = idVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    public Long getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(Long idMorador) {
        this.idMorador = idMorador;
    }

    public Long getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Long idVisitante) {
        this.idVisitante = idVisitante;
    }
}
