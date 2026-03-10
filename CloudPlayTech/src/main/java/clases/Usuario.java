package clases;

public class Usuario {
    protected String nombre;
    protected String correo;
    protected Plan plan;

    public Usuario(String nombre, String correo, Plan plan) {
        this.nombre = nombre;
        this.correo = correo;
        this.plan = plan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}