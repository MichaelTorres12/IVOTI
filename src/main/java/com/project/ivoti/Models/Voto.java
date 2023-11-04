package com.project.ivoti.Models;


import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "votos")
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_voto")
    private int id_voto;

    @Column(name = "hora_voto")
    private Time hora_voto;

    @OneToOne
    @JoinColumn(name = "dui")
    private Votante dui;

    @OneToOne
    @JoinColumn(name = "id_candidato")
    private Candidato id_candidato;

    @OneToOne
    @JoinColumn(name = "id_centro_votacion")
    private CentroVotacion id_centro_votacion;

    //----------------------------------------------------------------
    //CONSTRUCT

    public Voto(int id_voto, Time hora_voto, Votante dui, Candidato id_candidato, CentroVotacion id_centro_votacion) {
        this.id_voto = id_voto;
        this.hora_voto = hora_voto;
        this.dui = dui;
        this.id_candidato = id_candidato;
        this.id_centro_votacion = id_centro_votacion;
    }

    public Voto() {

    }


    //----------------------------------------------------------------


    public int getId_voto() {
        return id_voto;
    }

    public void setId_voto(int id_voto) {
        this.id_voto = id_voto;
    }

    public Time getHora_voto() {
        return hora_voto;
    }

    public void setHora_voto(Time hora_voto) {
        this.hora_voto = hora_voto;
    }

    public Votante getDui() {
        return dui;
    }

    public void setDui(Votante dui) {
        this.dui = dui;
    }

    public Candidato getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(Candidato id_candidato) {
        this.id_candidato = id_candidato;
    }

    public CentroVotacion getId_centro_votacion() {
        return id_centro_votacion;
    }

    public void setId_centro_votacion(CentroVotacion id_centro_votacion) {
        this.id_centro_votacion = id_centro_votacion;
    }
}
