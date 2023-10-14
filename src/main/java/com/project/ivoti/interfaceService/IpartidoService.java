package com.project.ivoti.interfaceService;

import com.project.ivoti.Models.Partido;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IpartidoService {

    public List<Partido> listar();

    public Optional<Partido> buscarById(int id);
}
