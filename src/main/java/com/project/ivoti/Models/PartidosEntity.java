package com.project.ivoti.Models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "partidos", schema = "ivotidb", catalog = "")
public class PartidosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPartido", nullable = false, length = 4)
    private String idPartido;
    @Basic
    @Column(name = "nombrePartido", nullable = false, length = 60)
    private String nombrePartido;
    @Basic
    @Column(name = "abreviacionPartido", nullable = false, length = 10)
    private String abreviacionPartido;
    @Basic
    @Column(name = "rutaLogo", nullable = true, length = 255)
    private String rutaLogo;
    @OneToMany(mappedBy = "partidosByIdPartido")
    private Collection<CandidatosEntity> candidatosByIdPartido;

    public String getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public String getAbreviacionPartido() {
        return abreviacionPartido;
    }

    public void setAbreviacionPartido(String abreviacionPartido) {
        this.abreviacionPartido = abreviacionPartido;
    }

    public String getRutaLogo() {
        return rutaLogo;
    }

    public void setRutaLogo(String rutaLogo) {
        this.rutaLogo = rutaLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartidosEntity that = (PartidosEntity) o;

        if (idPartido != null ? !idPartido.equals(that.idPartido) : that.idPartido != null) return false;
        if (nombrePartido != null ? !nombrePartido.equals(that.nombrePartido) : that.nombrePartido != null)
            return false;
        if (abreviacionPartido != null ? !abreviacionPartido.equals(that.abreviacionPartido) : that.abreviacionPartido != null)
            return false;
        if (rutaLogo != null ? !rutaLogo.equals(that.rutaLogo) : that.rutaLogo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPartido != null ? idPartido.hashCode() : 0;
        result = 31 * result + (nombrePartido != null ? nombrePartido.hashCode() : 0);
        result = 31 * result + (abreviacionPartido != null ? abreviacionPartido.hashCode() : 0);
        result = 31 * result + (rutaLogo != null ? rutaLogo.hashCode() : 0);
        return result;
    }

    public Collection<CandidatosEntity> getCandidatosByIdPartido() {
        return candidatosByIdPartido;
    }

    public void setCandidatosByIdPartido(Collection<CandidatosEntity> candidatosByIdPartido) {
        this.candidatosByIdPartido = candidatosByIdPartido;
    }
}
