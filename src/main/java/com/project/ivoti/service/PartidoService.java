package com.project.ivoti.service;

import com.project.ivoti.Models.Partido;
import com.project.ivoti.interfaceService.IpartidoService;
import com.project.ivoti.interfaces.IPartido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartidoService implements IpartidoService {

    @Autowired
    private IPartido partido;

    @Override
    public List<Partido> listar() {
        return (List<Partido>) partido.findAll();
    }

    @Override
    public Optional<Partido> buscarById(int id) {
        return partido.findById(id);
    }
}
