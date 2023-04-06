package com.trer.group.repository;

import com.trer.group.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Integer> {
	Utente findByUsernameAndPassword(String username, String password);

}
