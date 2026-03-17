package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exceptions.UsuariosInvalidException;
import exceptions.VelocidadInvalidException;
import clases.Usuario;

public class GestionUsuarioTest {

    private GestionUsuario gestion;

    @BeforeEach
    void setUp() {
        gestion = new GestionUsuario();
    }

    @Test
    void testCambiarPlanABasic() throws UsuariosInvalidException, VelocidadInvalidException {
        gestion.registrarUsuario("Test", "test@mail.com", "premium");

        gestion.cambiarPlan("test@mail.com", "basic");

        assertEquals(50, gestion.verVelocidad("test@mail.com"));
    }

    @Test
    void testCambiarPlanAAdvanced() throws UsuariosInvalidException, VelocidadInvalidException {
        gestion.registrarUsuario("User2", "user2@mail.com", "basic");

        gestion.cambiarPlan("user2@mail.com", "advanced");

        assertEquals(150, gestion.verVelocidad("user2@mail.com"));
    }

    @Test
    void testCambiarPlanUsuarioNoExisteLanzaExcepcion() {
        assertThrows(UsuariosInvalidException.class, () -> {
            gestion.cambiarPlan("noexiste@mail.com", "premium");
        });
    }

    @Test
    void testRegistrarUsuarioYListar() throws UsuariosInvalidException {
        gestion.registrarUsuario("Pepe", "pepe@mail.com", "basic");
        assertEquals(1, gestion.listarUsuarios().size());
        assertEquals("Pepe", gestion.listarUsuarios().get(0).getNombre());
    }
}