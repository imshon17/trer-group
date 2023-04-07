package com.trer.group.repository;

import com.trer.group.model.Centro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentroRepo extends JpaRepository<Centro, Integer> {
}
