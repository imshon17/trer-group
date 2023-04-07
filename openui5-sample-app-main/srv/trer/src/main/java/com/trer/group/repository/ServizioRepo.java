package com.trer.group.repository;

import com.trer.group.model.Servizio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServizioRepo extends JpaRepository<Servizio, Integer> {
}
