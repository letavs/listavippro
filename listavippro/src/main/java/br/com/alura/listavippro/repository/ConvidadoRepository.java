package br.com.alura.listavippro.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.listavippro.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}
