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

    @Column(name = "dui")
    private int dui;

    @Column(name = "id_candidato")
    private int id_candidato;

    @Column(name = "id_centro_votacion")
    private int id_centro_votacion;

    //----------------------------------------------------------------
    //CONSTRUCT
    private Voto(){}

    public Voto(int id_voto, Time hora_voto, int dui, int id_candidato, int id_centro_votacion) {
        this.id_voto = id_voto;
        this.hora_voto = hora_voto;
        this.dui = dui;
        this.id_candidato = id_candidato;
        this.id_centro_votacion = id_centro_votacion;
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

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public int getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    public int getId_centro_votacion() {
        return id_centro_votacion;
    }

    public void setId_centro_votacion(int id_centro_votacion) {
        this.id_centro_votacion = id_centro_votacion;
    }
}
