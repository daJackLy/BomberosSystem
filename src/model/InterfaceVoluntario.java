package model;

import java.time.LocalDate;

public interface InterfaceVoluntario {
    String getNombres();
    String getApellidos();
    String getDni();
    LocalDate getFechaNac();
    int getEdad();
    String getDistrito();
    String getTelefono();
    String getEmail();
    String getDireccion();
    String getTipoRegistro();
    String getDisponibilidad();
}
