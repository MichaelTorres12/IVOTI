package com.project.ivoti.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "centrovotacion", schema = "ivotidb", catalog = "")
public class CentrovotacionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdCentroVotacion", nullable = false, length = 6)
    private String idCentroVotacion;
    @Basic
    @Column(name = "NombreCentroVotacion", nullable = false, length = 255)
    private String nombreCentroVotacion;
    @Basic
    @Column(name = "Departamento", nullable = false, length = 255)
    private String departamento;
    @Basic
    @Column(name = "Municipio", nullable = false, length = 255)
    private String municipio;
    @Basic
    @Column(name = "Distrito", nullable = false, length = 255)
    private String distrito;

    public String getIdCentroVotacion() {
        return idCentroVotacion;
    }

    public void setIdCentroVotacion(String idCentroVotacion) {
        this.idCentroVotacion = idCentroVotacion;
    }

    public String getNombreCentroVotacion() {
        return nombreCentroVotacion;
    }

    public void setNombreCentroVotacion(String nombreCentroVotacion) {
        this.nombreCentroVotacion = nombreCentroVotacion;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CentrovotacionEntity that = (CentrovotacionEntity) o;

        if (idCentroVotacion != null ? !idCentroVotacion.equals(that.idCentroVotacion) : that.idCentroVotacion != null)
            return false;
        if (nombreCentroVotacion != null ? !nombreCentroVotacion.equals(that.nombreCentroVotacion) : that.nombreCentroVotacion != null)
            return false;
        if (departamento != null ? !departamento.equals(that.departamento) : that.departamento != null) return false;
        if (municipio != null ? !municipio.equals(that.municipio) : that.municipio != null) return false;
        if (distrito != null ? !distrito.equals(that.distrito) : that.distrito != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCentroVotacion != null ? idCentroVotacion.hashCode() : 0;
        result = 31 * result + (nombreCentroVotacion != null ? nombreCentroVotacion.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (municipio != null ? municipio.hashCode() : 0);
        result = 31 * result + (distrito != null ? distrito.hashCode() : 0);
        return result;
    }
}
