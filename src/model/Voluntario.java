package model;

public class Voluntario {

    private String nombres;
    private String apellidos;
    private int dni;
    private String fecha_nacimiento;
    private int edad;
    private String sexo;
    private String correo;
    private int telefono;
    private boolean posee_licencia;
    private String distrito;
    private String direccion;
    private String referencia;
    private boolean voluntario_anteriormente;
    private String experiencia_previa;
    private String participacion_en_programas;
    private String pregunta_motivacion; 
    private String pregunta_aporte; 
    private String pregunta_presion;
    private boolean pregunta_entrenamiento_regular;
    private boolean pregunta_capacitaciones_iniciales;
    private String pregunta_impedimento_fisico;
    private String horario_colaborar;

    // habilidades
    private boolean prim_auxilios;
    private boolean rcp;
    private boolean control_hemorragias;
    private boolean inmovilizacion_fracturas;
    private boolean evacuacion_heridos;
    private boolean busqueda_rescate;
    private boolean rescate_vehicular;
    private boolean rescate_acuatico;
    private boolean rescate_alturas;
    private boolean supervivencia_campo_o_selva;

    private boolean uso_extintores;
    private boolean manejo_mangueras;
    private boolean ERA;
    private boolean identificacion_inflamables;
    private boolean control_incendios_forestales;
    private boolean control_incendios_estructurales;
    private boolean control_incendios_vehiculares;
    private boolean control_incendios_domestioos;

    private boolean mecanica;
    private boolean electricidad;
    private boolean carpinteria;
    private boolean albanileria;
    private boolean soldadura;
    private boolean uso_herramientas;
    private boolean coonduccion_vehiculos_pesados;
    private boolean radio_y_comunicaciones;

    private boolean coordinacion_grupos;
    private boolean gestion_emergencias;
    private boolean logstica_suministros;
    private boolean comunicacion_efectiva;
    private boolean capacitacion_ensenanza;
    private boolean planificacion_rutas;

    private boolean informatica;
    private boolean ingles;
    private boolean documentacion;
    private boolean fotografia;

    private boolean entrenamiento_regular;
    private boolean natacion;
    private boolean escalada;
    private boolean marcha;
    private boolean tareas_carga_peso;

    private String tipo;

    //constructores

    public Voluntario() {}
    
    public Voluntario(String tipo) {
        this.tipo = tipo;
    }

    public Voluntario(
        String nombres, String apellidos, int dni, String fecha_nacimiento, int edad,
        String sexo, String correo, int telefono, boolean posee_licencia, String distrito,
        String direccion, String referencia, boolean voluntario_anteriormente,
        String experiencia_previa, String participacion_en_programas, String pregunta_motivacion,
        String pregunta_aporte, String pregunta_presion, boolean pregunta_entrenamiento_regular,
        boolean pregunta_capacitaciones_iniciales, String pregunta_impedimento_fisico,
        String horario_colaborar, boolean prim_auxilios, boolean rcp,
        boolean control_hemorragias, boolean inmovilizacion_fracturas,
        boolean evacuacion_heridos, boolean busqueda_rescate, boolean rescate_vehicular,
        boolean rescate_acuatico, boolean rescate_alturas, boolean supervivencia_campo_o_selva,
        boolean uso_extintores, boolean manejo_mangueras, boolean ERA,
        boolean identificacion_inflamables, boolean control_incendios_forestales,
        boolean control_incendios_estructurales, boolean control_incendios_vehiculares,
        boolean control_incendios_domestioos, boolean mecanica, boolean electricidad,
        boolean carpinteria, boolean albanileria, boolean soldadura, boolean uso_herramientas,
        boolean coonduccion_vehiculos_pesados, boolean radio_y_comunicaciones,
        boolean coordinacion_grupos, boolean gestion_emergencias, boolean logstica_suministros,
        boolean comunicacion_efectiva, boolean capacitacion_ensenanza,
        boolean planificacion_rutas, boolean informatica, boolean ingles,
        boolean documentacion, boolean fotografia, boolean entrenamiento_regular,
        boolean natacion, boolean escalada, boolean marcha, boolean tareas_carga_peso,
        String tipo
    ) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.sexo = sexo;
        this.correo = correo;
        this.telefono = telefono;
        this.posee_licencia = posee_licencia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.referencia = referencia;
        this.voluntario_anteriormente = voluntario_anteriormente;
        this.experiencia_previa = experiencia_previa;
        this.participacion_en_programas = participacion_en_programas;
        this.pregunta_motivacion = pregunta_motivacion;
        this.pregunta_aporte = pregunta_aporte;
        this.pregunta_presion = pregunta_presion;
        this.pregunta_entrenamiento_regular = pregunta_entrenamiento_regular;
        this.pregunta_capacitaciones_iniciales = pregunta_capacitaciones_iniciales;
        this.pregunta_impedimento_fisico = pregunta_impedimento_fisico;
        this.horario_colaborar = horario_colaborar;

        this.prim_auxilios = prim_auxilios;
        this.rcp = rcp;
        this.control_hemorragias = control_hemorragias;
        this.inmovilizacion_fracturas = inmovilizacion_fracturas;
        this.evacuacion_heridos = evacuacion_heridos;
        this.busqueda_rescate = busqueda_rescate;
        this.rescate_vehicular = rescate_vehicular;
        this.rescate_acuatico = rescate_acuatico;
        this.rescate_alturas = rescate_alturas;
        this.supervivencia_campo_o_selva = supervivencia_campo_o_selva;

        this.uso_extintores = uso_extintores;
        this.manejo_mangueras = manejo_mangueras;
        this.ERA = ERA;
        this.identificacion_inflamables = identificacion_inflamables;
        this.control_incendios_forestales = control_incendios_forestales;
        this.control_incendios_estructurales = control_incendios_estructurales;
        this.control_incendios_vehiculares = control_incendios_vehiculares;
        this.control_incendios_domestioos = control_incendios_domestioos;

        this.mecanica = mecanica;
        this.electricidad = electricidad;
        this.carpinteria = carpinteria;
        this.albanileria = albanileria;
        this.soldadura = soldadura;
        this.uso_herramientas = uso_herramientas;
        this.coonduccion_vehiculos_pesados = coonduccion_vehiculos_pesados;
        this.radio_y_comunicaciones = radio_y_comunicaciones;

        this.coordinacion_grupos = coordinacion_grupos;
        this.gestion_emergencias = gestion_emergencias;
        this.logstica_suministros = logstica_suministros;
        this.comunicacion_efectiva = comunicacion_efectiva;
        this.capacitacion_ensenanza = capacitacion_ensenanza;
        this.planificacion_rutas = planificacion_rutas;

        this.informatica = informatica;
        this.ingles = ingles;
        this.documentacion = documentacion;
        this.fotografia = fotografia;

        this.entrenamiento_regular = entrenamiento_regular;
        this.natacion = natacion;
        this.escalada = escalada;
        this.marcha = marcha;
        this.tareas_carga_peso = tareas_carga_peso;

        this.tipo = tipo;
    }

    //getters y setters
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getFecha_nacimiento() { return fecha_nacimiento; }
    public void setFecha_nacimiento(String fecha_nacimiento) { this.fecha_nacimiento = fecha_nacimiento; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public boolean isPosee_licencia() { return posee_licencia; }
    public void setPosee_licencia(boolean posee_licencia) { this.posee_licencia = posee_licencia; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public boolean isVoluntario_anteriormente() { return voluntario_anteriormente; }
    public void setVoluntario_anteriormente(boolean voluntario_anteriormente) { this.voluntario_anteriormente = voluntario_anteriormente; }

    public String getExperiencia_previa() { return experiencia_previa; }
    public void setExperiencia_previa(String experiencia_previa) { this.experiencia_previa = experiencia_previa; }

    public String getParticipacion_en_programas() { return participacion_en_programas; }
    public void setParticipacion_en_programas(String participacion_en_programas) { this.participacion_en_programas = participacion_en_programas; }

    public String getPregunta_motivacion() { return pregunta_motivacion; }
    public void setPregunta_motivacion(String pregunta_motivacion) { this.pregunta_motivacion = pregunta_motivacion; }

    public String getPregunta_aporte() { return pregunta_aporte; }
    public void setPregunta_aporte(String pregunta_aporte) { this.pregunta_aporte = pregunta_aporte; }

    public String getPregunta_presion() { return pregunta_presion; }
    public void setPregunta_presion(String pregunta_presion) { this.pregunta_presion = pregunta_presion; }

    public boolean isPregunta_entrenamiento_regular() { return pregunta_entrenamiento_regular; }
    public void setPregunta_entrenamiento_regular(boolean pregunta_entrenamiento_regular) { this.pregunta_entrenamiento_regular = pregunta_entrenamiento_regular; }

    public boolean isPregunta_capacitaciones_iniciales() { return pregunta_capacitaciones_iniciales; }
    public void setPregunta_capacitaciones_iniciales(boolean pregunta_capacitaciones_iniciales) { this.pregunta_capacitaciones_iniciales = pregunta_capacitaciones_iniciales; }

    public String getPregunta_impedimento_fisico() { return pregunta_impedimento_fisico; }
    public void setPregunta_impedimento_fisico(String pregunta_impedimento_fisico) { this.pregunta_impedimento_fisico = pregunta_impedimento_fisico; }

    public String getHorario_colaborar() { return horario_colaborar; }
    public void setHorario_colaborar(String horario_colaborar) { this.horario_colaborar = horario_colaborar; }

    public boolean isPrim_auxilios() { return prim_auxilios; }
    public void setPrim_auxilios(boolean prim_auxilios) { this.prim_auxilios = prim_auxilios; }

    public boolean isRcp() { return rcp; }
    public void setRcp(boolean rcp) { this.rcp = rcp; }

    public boolean isControl_hemorragias() { return control_hemorragias; }
    public void setControl_hemorragias(boolean control_hemorragias) { this.control_hemorragias = control_hemorragias; }

    public boolean isInmovilizacion_fracturas() { return inmovilizacion_fracturas; }
    public void setInmovilizacion_fracturas(boolean inmovilizacion_fracturas) { this.inmovilizacion_fracturas = inmovilizacion_fracturas; }

    public boolean isEvacuacion_heridos() { return evacuacion_heridos; }
    public void setEvacuacion_heridos(boolean evacuacion_heridos) { this.evacuacion_heridos = evacuacion_heridos; }

    public boolean isBusqueda_rescate() { return busqueda_rescate; }
    public void setBusqueda_rescate(boolean busqueda_rescate) { this.busqueda_rescate = busqueda_rescate; }

    public boolean isRescate_vehicular() { return rescate_vehicular; }
    public void setRescate_vehicular(boolean rescate_vehicular) { this.rescate_vehicular = rescate_vehicular; }

    public boolean isRescate_acuatico() { return rescate_acuatico; }
    public void setRescate_acuatico(boolean rescate_acuatico) { this.rescate_acuatico = rescate_acuatico; }

    public boolean isRescate_alturas() { return rescate_alturas; }
    public void setRescate_alturas(boolean rescate_alturas) { this.rescate_alturas = rescate_alturas; }

    public boolean isSupervivencia_campo_o_selva() { return supervivencia_campo_o_selva; }
    public void setSupervivencia_campo_o_selva(boolean supervivencia_campo_o_selva) { this.supervivencia_campo_o_selva = supervivencia_campo_o_selva; }

    public boolean isUso_extintores() { return uso_extintores; }
    public void setUso_extintores(boolean uso_extintores) { this.uso_extintores = uso_extintores; }

    public boolean isManejo_mangueras() { return manejo_mangueras; }
    public void setManejo_mangueras(boolean manejo_mangueras) { this.manejo_mangueras = manejo_mangueras; }

    public boolean isERA() { return ERA; }
    public void setERA(boolean ERA) { this.ERA = ERA; }

    public boolean isIdentificacion_inflamables() { return identificacion_inflamables; }
    public void setIdentificacion_inflamables(boolean identificacion_inflamables) { this.identificacion_inflamables = identificacion_inflamables; }

    public boolean isControl_incendios_forestales() { return control_incendios_forestales; }
    public void setControl_incendios_forestales(boolean control_incendios_forestales) { this.control_incendios_forestales = control_incendios_forestales; }

    public boolean isControl_incendios_estructurales() { return control_incendios_estructurales; }
    public void setControl_incendios_estructurales(boolean control_incendios_estructurales) { this.control_incendios_estructurales = control_incendios_estructurales; }

    public boolean isControl_incendios_vehiculares() { return control_incendios_vehiculares; }
    public void setControl_incendios_vehiculares(boolean control_incendios_vehiculares) { this.control_incendios_vehiculares = control_incendios_vehiculares; }

    public boolean isControl_incendios_domestioos() { return control_incendios_domestioos; }
    public void setControl_incendios_domestioos(boolean control_incendios_domestioos) { this.control_incendios_domestioos = control_incendios_domestioos; }

    public boolean isMecanica() { return mecanica; }
    public void setMecanica(boolean mecanica) { this.mecanica = mecanica; }

    public boolean isElectricidad() { return electricidad; }
    public void setElectricidad(boolean electricidad) { this.electricidad = electricidad; }

    public boolean isCarpinteria() { return carpinteria; }
    public void setCarpinteria(boolean carpinteria) { this.carpinteria = carpinteria; }

    public boolean isAlbanileria() { return albanileria; }
    public void setAlbanileria(boolean albanileria) { this.albanileria = albanileria; }

    public boolean isSoldadura() { return soldadura; }
    public void setSoldadura(boolean soldadura) { this.soldadura = soldadura; }

    public boolean isUso_herramientas() { return uso_herramientas; }
    public void setUso_herramientas(boolean uso_herramientas) { this.uso_herramientas = uso_herramientas; }

    public boolean isCoonduccion_vehiculos_pesados() { return coonduccion_vehiculos_pesados; }
    public void setCoonduccion_vehiculos_pesados(boolean coonduccion_vehiculos_pesados) { this.coonduccion_vehiculos_pesados = coonduccion_vehiculos_pesados; }

    public boolean isRadio_y_comunicaciones() { return radio_y_comunicaciones; }
    public void setRadio_y_comunicaciones(boolean radio_y_comunicaciones) { this.radio_y_comunicaciones = radio_y_comunicaciones; }

    public boolean isCoordinacion_grupos() { return coordinacion_grupos; }
    public void setCoordinacion_grupos(boolean coordinacion_grupos) { this.coordinacion_grupos = coordinacion_grupos; }

    public boolean isGestion_emergencias() { return gestion_emergencias; }
    public void setGestion_emergencias(boolean gestion_emergencias) { this.gestion_emergencias = gestion_emergencias; }

    public boolean isLogstica_suministros() { return logstica_suministros; }
    public void setLogstica_suministros(boolean logstica_suministros) { this.logstica_suministros = logstica_suministros; }

    public boolean isComunicacion_efectiva() { return comunicacion_efectiva; }
    public void setComunicacion_efectiva(boolean comunicacion_efectiva) { this.comunicacion_efectiva = comunicacion_efectiva; }

    public boolean isCapacitacion_ensenanza() { return capacitacion_ensenanza; }
    public void setCapacitacion_ensenanza(boolean capacitacion_ensenanza) { this.capacitacion_ensenanza = capacitacion_ensenanza; }

    public boolean isPlanificacion_rutas() { return planificacion_rutas; }
    public void setPlanificacion_rutas(boolean planificacion_rutas) { this.planificacion_rutas = planificacion_rutas; }

    public boolean isInformatica() { return informatica; }
    public void setInformatica(boolean informatica) { this.informatica = informatica; }

    public boolean isIngles() { return ingles; }
    public void setIngles(boolean ingles) { this.ingles = ingles; }

    public boolean isDocumentacion() { return documentacion; }
    public void setDocumentacion(boolean documentacion) { this.documentacion = documentacion; }

    public boolean isFotografia() { return fotografia; }
    public void setFotografia(boolean fotografia) { this.fotografia = fotografia; }

    public boolean isEntrenamiento_regular() { return entrenamiento_regular; }
    public void setEntrenamiento_regular(boolean entrenamiento_regular) { this.entrenamiento_regular = entrenamiento_regular; }

    public boolean isNatacion() { return natacion; }
    public void setNatacion(boolean natacion) { this.natacion = natacion; }

    public boolean isEscalada() { return escalada; }
    public void setEscalada(boolean escalada) { this.escalada = escalada; }

    public boolean isMarcha() { return marcha; }
    public void setMarcha(boolean marcha) { this.marcha = marcha; }

    public boolean isTareas_carga_peso() { return tareas_carga_peso; }
    public void setTareas_carga_peso(boolean tareas_carga_peso) { this.tareas_carga_peso = tareas_carga_peso; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

}





/*
INFORME TECNICO CODIGO:

ESTUDIANTE 1 - NOMBRE: Cardenas Tantalean, Jhair Alexis
Clases realizadas: BomberosSystem.java, Voluntario.java, VoluntarioBuilder.java, VoluntarioFactory.java, VoluntarioJoven.java, VoluntarioNuevo.java, VoluntarioReingreso.java, ExportarDatosService.java, VoluntarioFormView.java
Patrones implementados: Factory(1), Builder(1), Service(1)
Evidencia de avance GitHub: https://github.com/daJackLy/BomberosSystem.git

ESTUDIANTE 2 - NOMBRE:
Clases realizadas:
Patrones implementados:
Evidencia de avance GitHub: https://github.com/daJackLy/BomberosSystem.git

ESTUDIANTE 3 - NOMBRE:
Clases realizadas:
Patrones implementados:
Evidencia de avance GitHub: https://github.com/daJackLy/BomberosSystem.git
*/

