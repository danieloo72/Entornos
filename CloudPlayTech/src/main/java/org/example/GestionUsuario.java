package org.example;

import clases.*;
import exceptions.UsuariosInvalidException;
import exceptions.VelocidadInvalidException;
import recursos.MyScanner;

import java.util.ArrayList;
import java.util.List;

public class GestionUsuario {

    protected List<Usuario> listaUsuarios = new ArrayList<>();
    protected MyScanner sc = new MyScanner();
    protected Plan basic = new Plan(50, 1, List<>());
    protected Plan advanced = new Plan(150, 2, List<>());
    protected Plan premium = new Plan(500, 4, List<String>());

    public void registrarUsuario() throws UsuariosInvalidException {
        System.out.println("== REGISTRO DE USUARIO ==");
        String nombre = sc.pideTexto("Nombre: ");
        String correo = sc.pideTexto("Correo: ");
        String plan =  sc.pideTexto("Elige un plan(Basic, Advanced, Premium): ");

        if (nombre.isEmpty() || !correo.contains("@")) {
            throw new UsuariosInvalidException("Datos de usuario no válidos.");
        }

        Usuario nuevo = new Usuario(nombre, correo, Plan);
        listaUsuarios.add(nuevo);
        System.out.println("Usuario registrado con éxito.");
    }

    public void cambiarPlan() throws UsuariosInvalidException {
        String correo = sc.pideTexto("Introduce el correo del usuario: ");
        Usuario user = buscarPorCorreo(correo);

        if (user != null) {
            System.out.println("Cambiando plan para: " + user.getNombre());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public void verVelocidad() throws VelocidadInvalidException, UsuariosInvalidException {
        String correo = sc.pideTexto("Introduce el correo: ");
        Usuario user = buscarPorCorreo(correo);

        if (user == null || user.getPlan() == null) {
            throw new VelocidadInvalidException("No se puede determinar la velocidad.");
        }
        System.out.println("Velocidad máxima: " + user.getPlan().getVelocidad_max() + " Mbps");
    }

    public void buscarUsuarios() throws UsuariosInvalidException {
        try {
            String nombre = sc.pideTexto("Nombre a buscar: ");
            for (Usuario user : listaUsuarios) {
                if (user.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Encontrado: " + user.getNombre() + " (" + user.getCorreo() + ")");
                } else {
                    throw new UsuariosInvalidException("Usuario no encontrado");
                }
            }
        } catch (UsuariosInvalidException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarUsuarios() {
        System.out.println("== LISTA DE USUARIOS ==");
        for (Usuario user : listaUsuarios) {
            System.out.println(user.getNombre() + " (" + user.getCorreo() + ")");
        }
    }

    public void buscarPorCorreo(String correo) throws UsuariosInvalidException {
        try {
            String email = sc.pideTexto("Introduce el correo: ");
            for (Usuario user : listaUsuarios) {
                if (user.getCorreo().equalsIgnoreCase(correo)) {
                    System.out.println("Encontrado: " + user.getCorreo() + " (" + user.getNombre() + ")");
                } else {
                    throw new UsuariosInvalidException("Usuario no encontrado");
                }
            }
        } catch (UsuariosInvalidException e) {
            System.out.println(e.getMessage());
        }
        return;
    }
}