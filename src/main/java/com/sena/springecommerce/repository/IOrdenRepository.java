package com.sena.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.springecommerce.model.Orden;
import java.util.List;
import com.sena.springecommerce.model.Usuario;


@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	
	List<Orden> findByUsuario(Usuario usuario);

}
