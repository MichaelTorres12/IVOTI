package com.project.ivoti.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "candidatos", schema = "ivotidb", catalog = "")
public class CandidatosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdCandidato", nullable = false, length = 6)
    private String idCandidato;
    @Basic
    @Column(name = "nombresCandidato", nullable = false, length = 100)
    private String nombresCandidato;
    @Basic
    @Column(name = "apellidosCandidato", nullable = false, length = 100)
    private String apellidosCandidato;
    @Basic
    @Column(name = "fotoCandidato", nullable = true, length = 255)
    private String fotoCandidato;
    @Basic
    @Column(name = "idPartido", nullable = false, length = 4)
    private String idPartido;

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNombresCandidato() {
        return nombresCandidato;
    }

    public void setNombresCandidato(String nombresCandidato) {
        this.nombresCandidato = nombresCandidato;
    }

    public String getApellidosCandidato() {
        return apellidosCandidato;
    }

    public void setApellidosCandidato(String apellidosCandidato) {
        this.apellidosCandidato = apellidosCandidato;
    }

    public String getFotoCandidato() {
        return fotoCandidato;
    }

    public void setFotoCandidato(String fotoCandidato) {
        this.fotoCandidato = fotoCandidato;
    }

    public String getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandidatosEntity that = (CandidatosEntity) o;

        if (idCandidato != null ? !idCandidato.equals(that.idCandidato) : that.idCandidato != null) return false;
        if (nombresCandidato != null ? !nombresCandidato.equals(that.nombresCandidato) : that.nombresCandidato != null)
            return false;
        if (apellidosCandidato != null ? !apellidosCandidato.equals(that.apellidosCandidato) : that.apellidosCandidato != null)
            return false;
        if (fotoCandidato != null ? !fotoCandidato.equals(that.fotoCandidato) : that.fotoCandidato != null)
            return false;
        if (idPartido != null ? !idPartido.equals(that.idPartido) : that.idPartido != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCandidato != null ? idCandidato.hashCode() : 0;
        result = 31 * result + (nombresCandidato != null ? nombresCandidato.hashCode() : 0);
        result = 31 * result + (apellidosCandidato != null ? apellidosCandidato.hashCode() : 0);
        result = 31 * result + (fotoCandidato != null ? fotoCandidato.hashCode() : 0);
        result = 31 * result + (idPartido != null ? idPartido.hashCode() : 0);
        return result;
    }
}
