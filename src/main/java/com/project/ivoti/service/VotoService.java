package com.project.ivoti.service;

import com.project.ivoti.Models.Candidato;
import com.project.ivoti.Models.CentroVotacion;
import com.project.ivoti.Models.Votante;
import com.project.ivoti.Models.Voto;
import com.project.ivoti.interfaceService.IvotoService;
import com.project.ivoti.interfaces.IVoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VotoService implements IvotoService {

    @Autowired
    private IVoto voto;

    @Override
    public List<Voto> listar() {
        return (List<Voto>) voto.findAll();
    }

    @Override
    public Optional<Voto> buscarById(int id) {
        return voto.findById(id);
    }



    @Override
    public void save(Candidato id_candidato, Votante dui, CentroVotacion id_centro_votacion) {

        // Obtener la hora actual en formato LocalTime
        LocalTime horaActual = LocalTime.now();
        // Convertir LocalTime a Time
        Time hora_voto = Time.valueOf(horaActual);


        Voto voto1 = new Voto();
        voto1.setHora_voto(hora_voto);
        voto1.setDui(dui);
        voto1.setId_candidato(id_candidato);
        voto1.setId_centro_votacion(id_centro_votacion);

        voto.save(voto1);
    }
}
