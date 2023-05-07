package com.aplicacao.apiformulario.repositorio;

import com.aplicacao.apiformulario.modelo.DadosModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosRepositorio extends JpaRepository<DadosModelo, Long> {
}
