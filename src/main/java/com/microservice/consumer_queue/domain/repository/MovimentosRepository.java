package com.microservice.consumer_queue.domain.repository;

import com.microservice.consumer_queue.domain.model.Movimentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentosRepository extends JpaRepository<Movimentos, Integer> {}
