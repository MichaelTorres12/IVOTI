package com.project.ivoti.interfaces;

import com.project.ivoti.Models.Candidato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICandidato extends CrudRepository<Candidato, Integer> {
}
