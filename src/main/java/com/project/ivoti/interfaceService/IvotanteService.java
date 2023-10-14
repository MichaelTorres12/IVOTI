package com.project.ivoti.interfaceService;

import com.project.ivoti.Models.Votante;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IvotanteService {

    public List<Votante> listar();

    public Optional<Votante> buscarById(int id);

}
