package com.flick.demo.repositories;

import com.flick.demo.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
