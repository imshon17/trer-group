package com.trer.group.repository;

import com.trer.group.model.Ruolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuoloRepo extends JpaRepository<Ruolo, Integer> {
}
