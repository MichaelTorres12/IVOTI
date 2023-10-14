package com.project.ivoti.service;

import com.project.ivoti.Models.Candidato;
import com.project.ivoti.interfaceService.IcandidatoService;
import com.project.ivoti.interfaces.ICandidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoService implements IcandidatoService {

    @Autowired
    private ICandidato candidato;

    @Override
    public List<Candidato> listar() {
        return (List<Candidato>) candidato.findAll();
    }

    @Override
    public Optional<Candidato> buscarById(int id) {
        return candidato.findById(id);
    }
}
