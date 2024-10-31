package com.example.vendasingressos.repository;

import com.example.vendasingressos.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRpository extends JpaRepository<Ingresso, Long> {
}
