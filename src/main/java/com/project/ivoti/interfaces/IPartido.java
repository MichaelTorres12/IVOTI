package com.project.ivoti.interfaces;

import com.project.ivoti.Models.Partido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartido extends CrudRepository<Partido, Integer> {
}
