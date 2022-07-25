package com.MiPortfolio.Portfolio.service;

import com.MiPortfolio.Portfolio.controller.LoginResponse;
import com.MiPortfolio.Portfolio.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
    
    public Usuario login(Usuario usuario);
     
}
