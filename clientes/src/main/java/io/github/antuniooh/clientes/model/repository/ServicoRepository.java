package io.github.antuniooh.clientes.model.repository;

import io.github.antuniooh.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
