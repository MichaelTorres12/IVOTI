package com.project.ivoti.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "candidatos")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidato", nullable = false)
    private int id_candidato;

    @Column(name = "nombres_candidato")
    private String nombres_candidato;

    @Column(name = "apellidos_candidato")
    private String apellidos_candidato;

    @Column(name = "foto_candidato")
    private String foto_candidato;

    @Column(name = "id_partido")
    private int id_partido;

    //----------------------------------------------------------------
    //Constructor

    public Candidato() {}

    public Candidato(int id_candidato, String nombres_candidato, String apellidos_candidato, String foto_candidato, int id_partido) {
        this.id_candidato = id_candidato;
        this.nombres_candidato = nombres_candidato;
        this.apellidos_candidato = apellidos_candidato;
        this.foto_candidato = foto_candidato;
        this.id_partido = id_partido;
    }

    //--------GET & SET


    public int getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    public String getNombresCandidato() {
        return nombres_candidato;
    }

    public void setNombresCandidato(String nombres_candidato) {
        this.nombres_candidato = nombres_candidato;
    }

    public String getApellidosCandidato() {
        return apellidos_candidato;
    }

    public void setApellidosCandidato(String apellidos_candidato) {
        this.apellidos_candidato = apellidos_candidato;
    }

    public String getFotoCandidato() {
        return foto_candidato;
    }

    public void setFotoCandidato(String foto_candidato) {
        this.foto_candidato = foto_candidato;
    }

    public int getIdPartido() {
        return id_partido;
    }

    public void setIdPartido(int id_partido) {
        this.id_partido = id_partido;
    }
}
