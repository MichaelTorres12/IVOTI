package com.project.ivoti.service;

import com.project.ivoti.Models.Voto;
import com.project.ivoti.interfaceService.IvotoService;
import com.project.ivoti.interfaces.IVoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
