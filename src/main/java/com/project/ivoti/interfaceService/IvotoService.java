package com.project.ivoti.interfaceService;

import com.project.ivoti.Models.Candidato;
import com.project.ivoti.Models.CentroVotacion;
import com.project.ivoti.Models.Votante;
import com.project.ivoti.Models.Voto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IvotoService {

    public List<Voto> listar();

    public Optional<Voto> buscarById(int id);

    public void save(Candidato id_candidato, Votante dui, CentroVotacion id_centro_votacion);

}
