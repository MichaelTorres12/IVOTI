package com.project.ivoti.interfaces;

import com.project.ivoti.Models.Votante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVotante extends CrudRepository<Votante, Integer> {
}
