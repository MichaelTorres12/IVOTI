package com.project.ivoti.Models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "votante", schema = "ivotidb", catalog = "")
public class VotanteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DUI", nullable = false)
    private Integer dui;
    @Basic
    @Column(name = "nombresVotante", nullable = false, length = 255)
    private String nombresVotante;
    @Basic
    @Column(name = "apellidosVotante", nullable = false, length = 255)
    private String apellidosVotante;
    @Basic
    @Column(name = "fechaNacimientoVotante", nullable = false)
    private Date fechaNacimientoVotante;
    @Basic
    @Column(name = "sexoVotante", nullable = false, length = 10)
    private String sexoVotante;
    @Basic
    @Column(name = "celularVotante", nullable = false)
    private Integer celularVotante;
    @Basic
    @Column(name = "fechaExpedicionDuiVotante", nullable = false)
    private Date fechaExpedicionDuiVotante;
    @Basic
    @Column(name = "IdCentroVotacion", nullable = true, length = 6)
    private String idCentroVotacion;
    @Basic
    @Column(name = "haVotado", nullable = false)
    private Boolean haVotado;
    @ManyToOne
    @JoinColumn(name = "IdCentroVotacion", referencedColumnName = "IdCentroVotacion")
    private CentrovotacionEntity centrovotacionByIdCentroVotacion;

    public Integer getDui() {
        return dui;
    }

    public void setDui(Integer dui) {
        this.dui = dui;
    }

    public String getNombresVotante() {
        return nombresVotante;
    }

    public void setNombresVotante(String nombresVotante) {
        this.nombresVotante = nombresVotante;
    }

    public String getApellidosVotante() {
        return apellidosVotante;
    }

    public void setApellidosVotante(String apellidosVotante) {
        this.apellidosVotante = apellidosVotante;
    }

    public Date getFechaNacimientoVotante() {
        return fechaNacimientoVotante;
    }

    public void setFechaNacimientoVotante(Date fechaNacimientoVotante) {
        this.fechaNacimientoVotante = fechaNacimientoVotante;
    }

    public String getSexoVotante() {
        return sexoVotante;
    }

    public void setSexoVotante(String sexoVotante) {
        this.sexoVotante = sexoVotante;
    }

    public Integer getCelularVotante() {
        return celularVotante;
    }

    public void setCelularVotante(Integer celularVotante) {
        this.celularVotante = celularVotante;
    }

    public Date getFechaExpedicionDuiVotante() {
        return fechaExpedicionDuiVotante;
    }

    public void setFechaExpedicionDuiVotante(Date fechaExpedicionDuiVotante) {
        this.fechaExpedicionDuiVotante = fechaExpedicionDuiVotante;
    }

    public String getIdCentroVotacion() {
        return idCentroVotacion;
    }

    public void setIdCentroVotacion(String idCentroVotacion) {
        this.idCentroVotacion = idCentroVotacion;
    }

    public Boolean getHaVotado() {
        return haVotado;
    }

    public void setHaVotado(Boolean haVotado) {
        this.haVotado = haVotado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VotanteEntity that = (VotanteEntity) o;

        if (dui != null ? !dui.equals(that.dui) : that.dui != null) return false;
        if (nombresVotante != null ? !nombresVotante.equals(that.nombresVotante) : that.nombresVotante != null)
            return false;
        if (apellidosVotante != null ? !apellidosVotante.equals(that.apellidosVotante) : that.apellidosVotante != null)
            return false;
        if (fechaNacimientoVotante != null ? !fechaNacimientoVotante.equals(that.fechaNacimientoVotante) : that.fechaNacimientoVotante != null)
            return false;
        if (sexoVotante != null ? !sexoVotante.equals(that.sexoVotante) : that.sexoVotante != null) return false;
        if (celularVotante != null ? !celularVotante.equals(that.celularVotante) : that.celularVotante != null)
            return false;
        if (fechaExpedicionDuiVotante != null ? !fechaExpedicionDuiVotante.equals(that.fechaExpedicionDuiVotante) : that.fechaExpedicionDuiVotante != null)
            return false;
        if (idCentroVotacion != null ? !idCentroVotacion.equals(that.idCentroVotacion) : that.idCentroVotacion != null)
            return false;
        if (haVotado != null ? !haVotado.equals(that.haVotado) : that.haVotado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dui != null ? dui.hashCode() : 0;
        result = 31 * result + (nombresVotante != null ? nombresVotante.hashCode() : 0);
        result = 31 * result + (apellidosVotante != null ? apellidosVotante.hashCode() : 0);
        result = 31 * result + (fechaNacimientoVotante != null ? fechaNacimientoVotante.hashCode() : 0);
        result = 31 * result + (sexoVotante != null ? sexoVotante.hashCode() : 0);
        result = 31 * result + (celularVotante != null ? celularVotante.hashCode() : 0);
        result = 31 * result + (fechaExpedicionDuiVotante != null ? fechaExpedicionDuiVotante.hashCode() : 0);
        result = 31 * result + (idCentroVotacion != null ? idCentroVotacion.hashCode() : 0);
        result = 31 * result + (haVotado != null ? haVotado.hashCode() : 0);
        return result;
    }

    public CentrovotacionEntity getCentrovotacionByIdCentroVotacion() {
        return centrovotacionByIdCentroVotacion;
    }

    public void setCentrovotacionByIdCentroVotacion(CentrovotacionEntity centrovotacionByIdCentroVotacion) {
        this.centrovotacionByIdCentroVotacion = centrovotacionByIdCentroVotacion;
    }
}
