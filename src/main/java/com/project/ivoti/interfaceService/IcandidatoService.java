package com.project.ivoti.interfaceService;

import com.project.ivoti.Models.Candidato;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IcandidatoService {

    public List<Candidato> listar();

    public Optional<Candidato> buscarById(int id);

}
