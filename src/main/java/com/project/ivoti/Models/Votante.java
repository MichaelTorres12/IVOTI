package com.project.ivoti.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "votante")
public class Votante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dui", nullable = false)
    private int dui;

    @Column(name = "nombres_votante")
    private String nombres_votante;

    @Column(name = "apellidos_votante")
    private String apellidos_votante;

    @Column(name = "fecha_nacimiento_votante")
    private Date fecha_nacimiento_votante;

    @Column(name = "sexo_votante")
    private String sexo_votante;

    @Column(name = "fecha_expedicion_dui_votante")
    private Date fecha_expedicion_dui_votante;

    @Column(name = "id_centro_votacion")
    private int id_centro_votacion;

    @Column(name = "ha_votado")
    private boolean ha_votado;

    //----------------------------------------------------------------
    //Constructor

    public Votante() {}

    public Votante(int dui, String nombres_votante, String apellidos_votante, Date fecha_nacimiento_votante, String sexo_votante, Date fecha_expedicion_dui_votante, int id_centro_votacion, boolean ha_votado) {
        this.dui = dui;
        this.nombres_votante = nombres_votante;
        this.apellidos_votante = apellidos_votante;
        this.fecha_nacimiento_votante = fecha_nacimiento_votante;
        this.sexo_votante = sexo_votante;
        this.fecha_expedicion_dui_votante = fecha_expedicion_dui_votante;
        this.id_centro_votacion = id_centro_votacion;
        this.ha_votado = ha_votado;
    }


    //--------GET & SET


    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public String getNombres_votante() {
        return nombres_votante;
    }

    public void setNombres_votante(String nombres_votante) {
        this.nombres_votante = nombres_votante;
    }

    public String getApellidos_votante() {
        return apellidos_votante;
    }

    public void setApellidos_votante(String apellidos_votante) {
        this.apellidos_votante = apellidos_votante;
    }

    public Date getFecha_nacimiento_votante() {
        return fecha_nacimiento_votante;
    }

    public void setFecha_nacimiento_votante(Date fecha_nacimiento_votante) {
        this.fecha_nacimiento_votante = fecha_nacimiento_votante;
    }

    public String getSexo_votante() {
        return sexo_votante;
    }

    public void setSexo_votante(String sexo_votante) {
        this.sexo_votante = sexo_votante;
    }

    public Date getFecha_expedicion_dui_votante() {
        return fecha_expedicion_dui_votante;
    }

    public void setFecha_expedicion_dui_votante(Date fecha_expedicion_dui_votante) {
        this.fecha_expedicion_dui_votante = fecha_expedicion_dui_votante;
    }

    public int getId_centro_votacion() {
        return id_centro_votacion;
    }

    public void setId_centro_votacion(int id_centro_votacion) {
        this.id_centro_votacion = id_centro_votacion;
    }

    public boolean isHa_votado() {
        return ha_votado;
    }

    public void setHa_votado(boolean ha_votado) {
        this.ha_votado = ha_votado;
    }
}
