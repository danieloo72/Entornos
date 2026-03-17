package org.example;

import clases.*;
import exceptions.UsuariosInvalidException;
import exceptions.VelocidadInvalidException;
import java.util.ArrayList;
import java.util.List;

public class GestionUsuario {

    protected List<Usuario> listaUsuarios = new ArrayList<>();

    public void registrarUsuario(String nombre, String correo, String tipoPlan) throws UsuariosInvalidException {
        if (nombre == null || nombre.isEmpty() || !correo.contains("@")) {
            throw new UsuariosInvalidException("Datos de usuario no válidos.");
        }

        Usuario nuevo = new Usuario(nombre, correo, generarPlanPorTipo(tipoPlan));
        listaUsuarios.add(nuevo);
    }

    public void cambiarPlan(String correo, String nuevoTipo) throws UsuariosInvalidException {
        Usuario user = buscarPorCorreo(correo);
        if (user == null) {
            throw new UsuariosInvalidException("Usuario no encontrado.");
        }

        user.setPlan(generarPlanPorTipo(nuevoTipo));
    }

    private Plan generarPlanPorTipo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "advanced":
                return new Plan(150, 2, new ArrayList<>());
            case "premium":
                return new Plan(500, 4, new ArrayList<>());
            case "basic":
            default:
                return new Plan(50, 1, new ArrayList<>());
        }
    }

    public int verVelocidad(String correo) throws VelocidadInvalidException {
        Usuario user = buscarPorCorreo(correo);
        if (user == null || user.getPlan() == null) {
            throw new VelocidadInvalidException("No se puede determinar la velocidad.");
        }
        return user.getPlan().getVelocidad_max();
    }

    public Usuario buscarPorCorreo(String correo) {
        for (Usuario user : listaUsuarios) {
            if (user.getCorreo().equalsIgnoreCase(correo)) {
                return user;
            }
        }
        return null;
    }

    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(listaUsuarios);
    }
}