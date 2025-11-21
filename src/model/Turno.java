package model;

import java.time.LocalDateTime;

public class Turno {
    private int idTurno;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private Voluntario voluntario;

    public Turno() {}

    public Turno(int idTurno, LocalDateTime inicio, LocalDateTime fin, Voluntario voluntario) {
        this.idTurno = idTurno;
        this.inicio = inicio;
        this.fin = fin;
        this.voluntario = voluntario;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }
}
