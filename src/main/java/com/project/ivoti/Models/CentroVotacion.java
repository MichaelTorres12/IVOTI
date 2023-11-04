package com.project.ivoti.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "centro_votacion")
public class CentroVotacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_centro_votacion")
    private int id_centro_votacion;

    @Column(name = "nombre_centro_votacion")
    private String nombre_centro_votacion;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "distrito")
    private String distrito;

    //----------------------------------------------------------------


    public CentroVotacion(int id_centro_votacion, String nombre_centro_votacion, String departamento, String municipio, String distrito) {
        this.id_centro_votacion = id_centro_votacion;
        this.nombre_centro_votacion = nombre_centro_votacion;
        this.departamento = departamento;
        this.municipio = municipio;
        this.distrito = distrito;
    }

    public CentroVotacion () {}

    //----------------------------------------------------------------


    public int getId_centro_votacion() {
        return id_centro_votacion;
    }

    public void setId_centro_votacion(int id_centro_votacion) {
        this.id_centro_votacion = id_centro_votacion;
    }

    public String getNombre_centro_votacion() {
        return nombre_centro_votacion;
    }

    public void setNombre_centro_votacion(String nombre_centro_votacion) {
        this.nombre_centro_votacion = nombre_centro_votacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
