package model;

public class Experiencia {
    private boolean primAuxilios;
    private boolean rcp;
    private boolean controlHemorragias;
    private boolean inmovilizacionFracturas;
    private boolean evacuacionHeridos;
    private boolean busquedaRescate;
    private boolean rescateVehicular;
    private boolean rescateAcuatico;
    private boolean rescateAlturas;
    private boolean supervivenciaCampoSelva;

    public Experiencia(boolean primAuxilios, boolean rcp, boolean controlHemorragias, boolean inmovilizacionFracturas,
                       boolean evacuacionHeridos, boolean busquedaRescate, boolean rescateVehicular,
                       boolean rescateAcuatico, boolean rescateAlturas, boolean supervivenciaCampoSelva) {
        this.primAuxilios = primAuxilios;
        this.rcp = rcp;
        this.controlHemorragias = controlHemorragias;
        this.inmovilizacionFracturas = inmovilizacionFracturas;
        this.evacuacionHeridos = evacuacionHeridos;
        this.busquedaRescate = busquedaRescate;
        this.rescateVehicular = rescateVehicular;
        this.rescateAcuatico = rescateAcuatico;
        this.rescateAlturas = rescateAlturas;
        this.supervivenciaCampoSelva = supervivenciaCampoSelva;
    }

    // getters
    public boolean isPrimAuxilios() { return primAuxilios; }
    public boolean isRcp() { return rcp; }
    public boolean isControlHemorragias() { return controlHemorragias; }
    public boolean isInmovilizacionFracturas() { return inmovilizacionFracturas; }
    public boolean isEvacuacionHeridos() { return evacuacionHeridos; }
    public boolean isBusquedaRescate() { return busquedaRescate; }
    public boolean isRescateVehicular() { return rescateVehicular; }
    public boolean isRescateAcuatico() { return rescateAcuatico; }
    public boolean isRescateAlturas() { return rescateAlturas; }
    public boolean isSupervivenciaCampoSelva() { return supervivenciaCampoSelva; }
}
