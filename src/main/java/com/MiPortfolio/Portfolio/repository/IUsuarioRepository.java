package com.MiPortfolio.Portfolio.repository;

import com.MiPortfolio.Portfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
    public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("select usu from Usuario usu where usu.usuario = :usuario")
    List<Usuario> findByUsuario(@Param("usuario") String usuario);
    
}
