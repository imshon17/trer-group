package com.trer.group.repository;

import com.trer.group.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepo extends JpaRepository<Prodotto, Integer> {
}
