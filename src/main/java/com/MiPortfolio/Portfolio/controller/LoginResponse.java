package com.MiPortfolio.Portfolio.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor //constructor con argumentos
@NoArgsConstructor //constructor vacío
@Data //crea getters y setter
public class LoginResponse {
    private Long idPersona;
    private String role;
}
