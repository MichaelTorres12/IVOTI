package com.project.ivoti.Models;

import jakarta.persistence.*;

@Entity
@Table(name="partidos")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partido", nullable = false)
    private int id_partido;

    @Column(name = "nombre_partido")
    private String nombre_partido;

    @Column(name = "abreviacion_partido")
    private String abreviacion_partido;

    @Column(name = "img_logo")
    private String img_logo;

    //----------------------------------------------------------------
    //CONSTRUCT
    public Partido() {}

    public Partido(int id_partido, String nombre_partido, String abreviacion_partido, String img_logo) {
        this.id_partido = id_partido;
        this.nombre_partido = nombre_partido;
        this.abreviacion_partido = abreviacion_partido;
        this.img_logo = img_logo;
    }

    //----------------------------------------------------------------
    //--------GET & SET


    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public String getNombre_partido() {
        return nombre_partido;
    }

    public void setNombre_partido(String nombre_partido) {
        this.nombre_partido = nombre_partido;
    }

    public String getAbreviacion_partido() {
        return abreviacion_partido;
    }

    public void setAbreviacion_partido(String abreviacion_partido) {
        this.abreviacion_partido = abreviacion_partido;
    }

    public String getImg_logo() {
        return img_logo;
    }

    public void setImg_logo(String img_logo) {
        this.img_logo = img_logo;
    }
}
