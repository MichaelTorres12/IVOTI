package com.project.ivoti.service;

import com.project.ivoti.Models.Votante;
import com.project.ivoti.interfaceService.IvotanteService;
import com.project.ivoti.interfaces.IVotante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VotanteService implements IvotanteService {

    @Autowired
    private IVotante votante;

    @Override
    public List<Votante> listar() {
        return (List<Votante>) votante.findAll();
    }

    @Override
    public Optional<Votante> buscarById(int id) {
        return votante.findById(id);
    }
}
