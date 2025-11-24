package model;

public class VoluntarioBuilder {

    private Voluntario voluntario;

    public VoluntarioBuilder(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    public VoluntarioBuilder withNombres(String nombres) {
        voluntario.setNombres(nombres);
        return this;
    }

    public VoluntarioBuilder withApellidos(String apellidos) {
        voluntario.setApellidos(apellidos);
        return this;
    }

    public VoluntarioBuilder withDni(int dni) {
        voluntario.setDni(dni);
        return this;
    }

    public VoluntarioBuilder withFechaNacimiento(String fecha) {
        voluntario.setFecha_nacimiento(fecha);
        return this;
    }

    public VoluntarioBuilder withEdad(int edad) {
        voluntario.setEdad(edad);
        return this;
    }

    public VoluntarioBuilder withSexo(String sexo) {
        voluntario.setSexo(sexo);
        return this;
    }

    public VoluntarioBuilder withCorreo(String correo) {
        voluntario.setCorreo(correo);
        return this;
    }

    public VoluntarioBuilder withTelefono(int telefono) {
        voluntario.setTelefono(telefono);
        return this;
    }

    public VoluntarioBuilder withPoseeLicencia(boolean posee) {
        voluntario.setPosee_licencia(posee);
        return this;
    }

    public VoluntarioBuilder withDistrito(String distrito) {
        voluntario.setDistrito(distrito);
        return this;
    }

    public VoluntarioBuilder withDireccion(String direccion) {
        voluntario.setDireccion(direccion);
        return this;
    }

    public VoluntarioBuilder withReferencia(String referencia) {
        voluntario.setReferencia(referencia);
        return this;
    }

    public VoluntarioBuilder withVoluntarioAnteriormente(boolean v) {
        voluntario.setVoluntario_anteriormente(v);
        return this;
    }

    public VoluntarioBuilder withExperienciaPrevia(String exp) {
        voluntario.setExperiencia_previa(exp);
        return this;
    }

    public VoluntarioBuilder withParticipacionProgramas(String part) {
        voluntario.setParticipacion_en_programas(part);
        return this;
    }

    public VoluntarioBuilder withPreguntaMotivacion(String txt) {
        voluntario.setPregunta_motivacion(txt);
        return this;
    }

    public VoluntarioBuilder withPreguntaAporte(String txt) {
        voluntario.setPregunta_aporte(txt);
        return this;
    }

    public VoluntarioBuilder withPreguntaPresion(String txt) {
        voluntario.setPregunta_presion(txt);
        return this;
    }

    public VoluntarioBuilder withPreguntaEntrenamientoRegular(boolean v) {
        voluntario.setPregunta_entrenamiento_regular(v);
        return this;
    }

    public VoluntarioBuilder withPreguntaCapacitacionesIniciales(boolean v) {
        voluntario.setPregunta_capacitaciones_iniciales(v);
        return this;
    }

    public VoluntarioBuilder withPreguntaImpedimentoFisico(String txt) {
        voluntario.setPregunta_impedimento_fisico(txt);
        return this;
    }

    public VoluntarioBuilder withHorarioColaborar(String horario) {
        voluntario.setHorario_colaborar(horario);
        return this;
    }

    // ------------ HABILIDADES -------------

    public VoluntarioBuilder withPrimAuxilios(boolean v) { voluntario.setPrim_auxilios(v); return this; }
    public VoluntarioBuilder withRcp(boolean v) { voluntario.setRcp(v); return this; }
    public VoluntarioBuilder withControlHemorragias(boolean v) { voluntario.setControl_hemorragias(v); return this; }
    public VoluntarioBuilder withInmovilizacionFracturas(boolean v) { voluntario.setInmovilizacion_fracturas(v); return this; }
    public VoluntarioBuilder withEvacuacionHeridos(boolean v) { voluntario.setEvacuacion_heridos(v); return this; }
    public VoluntarioBuilder withBusquedaRescate(boolean v) { voluntario.setBusqueda_rescate(v); return this; }
    public VoluntarioBuilder withRescateVehicular(boolean v) { voluntario.setRescate_vehicular(v); return this; }
    public VoluntarioBuilder withRescateAcuatico(boolean v) { voluntario.setRescate_acuatico(v); return this; }
    public VoluntarioBuilder withRescateAlturas(boolean v) { voluntario.setRescate_alturas(v); return this; }
    public VoluntarioBuilder withSupervivenciaCampoSelva(boolean v) { voluntario.setSupervivencia_campo_o_selva(v); return this; }

    public VoluntarioBuilder withUsoExtintores(boolean v) { voluntario.setUso_extintores(v); return this; }
    public VoluntarioBuilder withManejoMangueras(boolean v) { voluntario.setManejo_mangueras(v); return this; }
    public VoluntarioBuilder withERA(boolean v) { voluntario.setERA(v); return this; }
    public VoluntarioBuilder withIdentificacionInflamables(boolean v) { voluntario.setIdentificacion_inflamables(v); return this; }
    public VoluntarioBuilder withControlIncFforestales(boolean v) { voluntario.setControl_incendios_forestales(v); return this; }
    public VoluntarioBuilder withControlIncEstructurales(boolean v) { voluntario.setControl_incendios_estructurales(v); return this; }
    public VoluntarioBuilder withControlIncVehiculares(boolean v) { voluntario.setControl_incendios_vehiculares(v); return this; }
    public VoluntarioBuilder withControlIncDomesticos(boolean v) { voluntario.setControl_incendios_domestioos(v); return this; }

    public VoluntarioBuilder withMecanica(boolean v) { voluntario.setMecanica(v); return this; }
    public VoluntarioBuilder withElectricidad(boolean v) { voluntario.setElectricidad(v); return this; }
    public VoluntarioBuilder withCarpinteria(boolean v) { voluntario.setCarpinteria(v); return this; }
    public VoluntarioBuilder withAlbanileria(boolean v) { voluntario.setAlbanileria(v); return this; }
    public VoluntarioBuilder withSoldadura(boolean v) { voluntario.setSoldadura(v); return this; }
    public VoluntarioBuilder withUsoHerramientas(boolean v) { voluntario.setUso_herramientas(v); return this; }
    public VoluntarioBuilder withConduccionVehiculosPesados(boolean v) { voluntario.setCoonduccion_vehiculos_pesados(v); return this; }
    public VoluntarioBuilder withRadioComunicaciones(boolean v) { voluntario.setRadio_y_comunicaciones(v); return this; }

    public VoluntarioBuilder withCoordinacionGrupos(boolean v) { voluntario.setCoordinacion_grupos(v); return this; }
    public VoluntarioBuilder withGestionEmergencias(boolean v) { voluntario.setGestion_emergencias(v); return this; }
    public VoluntarioBuilder withLogisticaSuministros(boolean v) { voluntario.setLogstica_suministros(v); return this; }
    public VoluntarioBuilder withComunicacionEfectiva(boolean v) { voluntario.setComunicacion_efectiva(v); return this; }
    public VoluntarioBuilder withCapacitacionEnsenanza(boolean v) { voluntario.setCapacitacion_ensenanza(v); return this; }
    public VoluntarioBuilder withPlanificacionRutas(boolean v) { voluntario.setPlanificacion_rutas(v); return this; }

    public VoluntarioBuilder withInformatica(boolean v) { voluntario.setInformatica(v); return this; }
    public VoluntarioBuilder withIngles(boolean v) { voluntario.setIngles(v); return this; }
    public VoluntarioBuilder withDocumentacion(boolean v) { voluntario.setDocumentacion(v); return this; }
    public VoluntarioBuilder withFotografia(boolean v) { voluntario.setFotografia(v); return this; }

    public VoluntarioBuilder withEntrenamientoRegular(boolean v) { voluntario.setEntrenamiento_regular(v); return this; }
    public VoluntarioBuilder withNatacion(boolean v) { voluntario.setNatacion(v); return this; }
    public VoluntarioBuilder withEscalada(boolean v) { voluntario.setEscalada(v); return this; }
    public VoluntarioBuilder withMarcha(boolean v) { voluntario.setMarcha(v); return this; }
    public VoluntarioBuilder withTareasCargaPeso(boolean v) { voluntario.setTareas_carga_peso(v); return this; }

    public VoluntarioBuilder withTipo(String tipo) {
        voluntario.setTipo(tipo);
        return this;
    }

    public Voluntario build() {
        return voluntario;
    }
}
