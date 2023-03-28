package com.trer.group.repository;

import com.trer.group.model.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteRepo extends JpaRepository<Dipendente, Integer> {
}
