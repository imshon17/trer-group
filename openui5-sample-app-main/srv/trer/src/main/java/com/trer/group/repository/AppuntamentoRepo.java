package com.trer.group.repository;

import com.trer.group.model.Appuntamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppuntamentoRepo extends JpaRepository<Appuntamento, Integer> {

}
