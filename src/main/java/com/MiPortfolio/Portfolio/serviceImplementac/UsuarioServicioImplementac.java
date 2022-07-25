package com.MiPortfolio.Portfolio.serviceImplementac;

import com.MiPortfolio.Portfolio.model.Usuario;
import com.MiPortfolio.Portfolio.repository.IPersonaRepository;
import com.MiPortfolio.Portfolio.repository.IUsuarioRepository;
import com.MiPortfolio.Portfolio.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImplementac implements UsuarioService {
    
    @Autowired //inyecta una dependencia dentro de otra
    public IPersonaRepository personaRepo;
    @Autowired //inyecta una dependencia dentro de otra
    public IUsuarioRepository usuRepo;

    public UsuarioServicioImplementac() {
    }
 
    @Override
    public Usuario login(Usuario usuario) {
    usuRepo.findAll();
    List<Usuario> usuarios = usuRepo.findAll();
        if (!usuarios.isEmpty()){
            for(Usuario usus : usuarios){
            if(usus.getUsuario().equals(usuario.getUsuario())&& usus.getContrasenia().equals(usuario.getContrasenia())){
                    return usus;
                }
        }
    }
        return null;
    }
}       
       




    
    
    
    
    
    
    
    /*public Long login(String usuario, String contrasenia) {
        List<Usuario> usuarios = usuRepo.findByUsuario(usuario);
        if (!usuarios.isEmpty()){
            Usuario savedUser = usuarios.get(0);
            if(savedUser.getContrasenia().equals(contrasenia))
                return savedUser.getPersona().getId();
        }
        return null;
    }*/