package com.MiPortfolio.Portfolio.controller;

import com.MiPortfolio.Portfolio.model.Persona;
import com.MiPortfolio.Portfolio.model.Usuario;
import com.MiPortfolio.Portfolio.service.PersonaService;
import com.MiPortfolio.Portfolio.service.UsuarioService;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //capa controladora, atiende las solicitudes entrantes
@RequestMapping("usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
    
    @Autowired
    private PersonaService personaService;

    @Autowired      
    private UsuarioService usuarioService;
    
    @PostMapping("/login") //chequea usuario y contraseña y devuelve id de Persona
    @ResponseBody
    public LoginResponse login(@RequestBody Usuario usuario) {        

        Usuario savedUser = usuarioService.login(usuario);
        
        if(savedUser == null){
            return null;
        }
        
        return new LoginResponse(savedUser.getPersona().getId(), savedUser.getRole());
    }
}
