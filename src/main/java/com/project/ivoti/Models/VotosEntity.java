package com.project.ivoti.Models;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "votos", schema = "ivotidb", catalog = "")
public class VotosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdVoto", nullable = false)
    private Integer idVoto;
    @Basic
    @Column(name = "horaVoto", nullable = false)
    private Time horaVoto;
    @Basic
    @Column(name = "DUI", nullable = true)
    private Integer dui;
    @Basic
    @Column(name = "IdCandidato", nullable = true, length = 6)
    private String idCandidato;
    @Basic
    @Column(name = "IdCentroVotacion", nullable = true, length = 6)
    private String idCentroVotacion;
    @ManyToOne
    @JoinColumn(name = "DUI", referencedColumnName = "DUI")
    private VotanteEntity votanteByDui;
    @ManyToOne
    @JoinColumn(name = "IdCandidato", referencedColumnName = "IdCandidato")
    private CandidatosEntity candidatosByIdCandidato;
    @ManyToOne
    @JoinColumn(name = "IdCentroVotacion", referencedColumnName = "IdCentroVotacion")
    private CentrovotacionEntity centrovotacionByIdCentroVotacion;

    public Integer getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(Integer idVoto) {
        this.idVoto = idVoto;
    }

    public Time getHoraVoto() {
        return horaVoto;
    }

    public void setHoraVoto(Time horaVoto) {
        this.horaVoto = horaVoto;
    }

    public Integer getDui() {
        return dui;
    }

    public void setDui(Integer dui) {
        this.dui = dui;
    }

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getIdCentroVotacion() {
        return idCentroVotacion;
    }

    public void setIdCentroVotacion(String idCentroVotacion) {
        this.idCentroVotacion = idCentroVotacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VotosEntity that = (VotosEntity) o;

        if (idVoto != null ? !idVoto.equals(that.idVoto) : that.idVoto != null) return false;
        if (horaVoto != null ? !horaVoto.equals(that.horaVoto) : that.horaVoto != null) return false;
        if (dui != null ? !dui.equals(that.dui) : that.dui != null) return false;
        if (idCandidato != null ? !idCandidato.equals(that.idCandidato) : that.idCandidato != null) return false;
        if (idCentroVotacion != null ? !idCentroVotacion.equals(that.idCentroVotacion) : that.idCentroVotacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVoto != null ? idVoto.hashCode() : 0;
        result = 31 * result + (horaVoto != null ? horaVoto.hashCode() : 0);
        result = 31 * result + (dui != null ? dui.hashCode() : 0);
        result = 31 * result + (idCandidato != null ? idCandidato.hashCode() : 0);
        result = 31 * result + (idCentroVotacion != null ? idCentroVotacion.hashCode() : 0);
        return result;
    }

    public VotanteEntity getVotanteByDui() {
        return votanteByDui;
    }

    public void setVotanteByDui(VotanteEntity votanteByDui) {
        this.votanteByDui = votanteByDui;
    }

    public CandidatosEntity getCandidatosByIdCandidato() {
        return candidatosByIdCandidato;
    }

    public void setCandidatosByIdCandidato(CandidatosEntity candidatosByIdCandidato) {
        this.candidatosByIdCandidato = candidatosByIdCandidato;
    }

    public CentrovotacionEntity getCentrovotacionByIdCentroVotacion() {
        return centrovotacionByIdCentroVotacion;
    }

    public void setCentrovotacionByIdCentroVotacion(CentrovotacionEntity centrovotacionByIdCentroVotacion) {
        this.centrovotacionByIdCentroVotacion = centrovotacionByIdCentroVotacion;
    }
}
