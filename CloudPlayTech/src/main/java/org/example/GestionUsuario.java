package org.example;

import clases.*;
import exceptions.VelocidadInvalidException;
import recursos.MyScanner;

import java.util.ArrayList;
import java.util.List;

public class GestionUsuario {

    private List<Usuario> listaUsuarios = new ArrayList<>();
    private MyScanner sc = new MyScanner();

    public void registrarUsuario() {
        System.out.println("--- Registro de Usuario ---");
        String nombre = sc.pideTexto("Nombre: ");
        String correo = sc.pideTexto("Correo: ");

        if (nombre.isEmpty() || !correo.contains("@")) {
            throw new UsuarioInvalidException("Datos de usuario no válidos.");
        }

        Usuario nuevo = new Usuario(nombre, correo, null);
        listaUsuarios.add(nuevo);
        System.out.println("Usuario registrado con éxito.");
    }

    public void cambiarPlan() {
        String correo = sc.pideTexto("Introduce el correo del usuario: ");
        Usuario u = buscarPorCorreo(correo);

        if (u != null) {
            System.out.println("Cambiando plan para: " + u.getNombre());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public void verVelocidad() throws VelocidadInvalidException {
        String correo = sc.pideTexto("Introduce el correo: ");
        Usuario u = buscarPorCorreo(correo);

        if (u == null || u.getPlan() == null) {
            throw new VelocidadInvalidException("No se puede determinar la velocidad.");
        }
        System.out.println("Velocidad máxima: " + u.getPlan().getVelocidad_max() + " Mbps");
    }

    public void buscarUsuarios() {
        String nombre = sc.pideTexto("Nombre a buscar: ");
        for (Usuario u : listaUsuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado: " + u.getNombre() + " (" + u.getCorreo() + ")");
            }
        }
    }

    public void listarUsuarios() {
        System.out.println("--- Lista de Usuarios ---");
        for (Usuario u : listaUsuarios) {
            System.out.println(u.getNombre() + " (" + u.getCorreo() + ")");
        }
    }
}