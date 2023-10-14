package com.project.ivoti.interfaces;

import com.project.ivoti.Models.Voto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoto extends CrudRepository<Voto, Integer> {
}
