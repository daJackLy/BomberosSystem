package controller;

import model.Voluntario;

import java.io.*;

public class ExportarDatosService {

    public void exportarVoluntario(Voluntario v) {

        try {
            // Carpeta principal
            File carpetaPrincipal = new File("Postulantes");
            carpetaPrincipal.mkdir();
            //Nombre carpeta del postulante
            String carpetaNombre = v.getNombres() + "_" + v.getApellidos() + "_" + v.getDni();

            File carpetaPostulante = new File(carpetaPrincipal, carpetaNombre);
            carpetaPostulante.mkdir();

            File archivoDatos = new File(carpetaPostulante, "datos.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoDatos));

            writer.write("Nombres: " + v.getNombres() + "\n");
            writer.write("Apellidos: " + v.getApellidos() + "\n");
            writer.write("DNI: " + v.getDni() + "\n");
            writer.write("Fecha de nacimiento: " + v.getFecha_nacimiento() + "\n");
            writer.write("Edad: " + v.getEdad() + "\n");
            writer.write("Sexo: " + v.getSexo() + "\n");
            writer.write("Correo: " + v.getCorreo() + "\n");
            writer.write("Teléfono: " + v.getTelefono() + "\n");
            writer.write("Posee licencia: " + v.isPosee_licencia() + "\n");
            writer.write("Distrito: " + v.getDistrito() + "\n");
            writer.write("Dirección: " + v.getDireccion() + "\n");
            writer.write("Referencia: " + v.getReferencia() + "\n");
            writer.write("Voluntario anteriormente: " + v.isVoluntario_anteriormente() + "\n");
            writer.write("Experiencia previa: " + v.getExperiencia_previa() + "\n");
            writer.write("Participación en programas: " + v.getParticipacion_en_programas() + "\n");
            writer.write("Motivación: " + v.getPregunta_motivacion() + "\n");
            writer.write("Aporte: " + v.getPregunta_aporte() + "\n");
            writer.write("Presión: " + v.getPregunta_presion() + "\n");
            writer.write("Entrenamiento regular: " + v.isPregunta_entrenamiento_regular() + "\n");
            writer.write("Capacitaciones iniciales: " + v.isPregunta_capacitaciones_iniciales() + "\n");
            writer.write("Impedimento físico: " + v.getPregunta_impedimento_fisico() + "\n");
            writer.write("Horario para colaborar: " + v.getHorario_colaborar() + "\n");

            writer.write("HABILIDADES: \n");
            writer.write("Primeros auxilios: " + v.isPrim_auxilios() + "\n");
            writer.write("RCP: " + v.isRcp() + "\n");
            writer.write("Control de hemorragias: " + v.isControl_hemorragias() + "\n");
            writer.write("Inmovilización de fracturas: " + v.isInmovilizacion_fracturas() + "\n");
            writer.write("Evacuación de heridos: " + v.isEvacuacion_heridos() + "\n");
            writer.write("Búsqueda y rescate: " + v.isBusqueda_rescate() + "\n");
            writer.write("Rescate vehicular: " + v.isRescate_vehicular() + "\n");
            writer.write("Rescate acuático: " + v.isRescate_acuatico() + "\n");
            writer.write("Rescate en alturas: " + v.isRescate_alturas() + "\n");
            writer.write("Supervivencia en campo/selva: " + v.isSupervivencia_campo_o_selva() + "\n");
            writer.write("Uso de extintores: " + v.isUso_extintores() + "\n");
            writer.write("Manejo de mangueras: " + v.isManejo_mangueras() + "\n");
            writer.write("ERA: " + v.isERA() + "\n");
            writer.write("Identificación de inflamables: " + v.isIdentificacion_inflamables() + "\n");
            writer.write("Control incendios forestales: " + v.isControl_incendios_forestales() + "\n");
            writer.write("Control incendios estructurales: " + v.isControl_incendios_estructurales() + "\n");
            writer.write("Control incendios vehiculares: " + v.isControl_incendios_vehiculares() + "\n");
            writer.write("Control incendios domésticos: " + v.isControl_incendios_domestioos() + "\n");

            writer.write("TECNICAS GENERALES: \n");
            writer.write("Mecánica: " + v.isMecanica() + "\n");
            writer.write("Electricidad: " + v.isElectricidad() + "\n");
            writer.write("Carpintería: " + v.isCarpinteria() + "\n");
            writer.write("Albañilería: " + v.isAlbanileria() + "\n");
            writer.write("Soldadura: " + v.isSoldadura() + "\n");
            writer.write("Uso de herramientas: " + v.isUso_herramientas() + "\n");
            writer.write("Conducción vehículos pesados: " + v.isCoonduccion_vehiculos_pesados() + "\n");
            writer.write("Radio y comunicaciones: " + v.isRadio_y_comunicaciones() + "\n");
            writer.write("Coordinación de grupos: " + v.isCoordinacion_grupos() + "\n");
            writer.write("Gestión de emergencias: " + v.isGestion_emergencias() + "\n");
            writer.write("Logística y suministros: " + v.isLogstica_suministros() + "\n");
            writer.write("Comunicación efectiva: " + v.isComunicacion_efectiva() + "\n");
            writer.write("Capacitación/Enseñanza: " + v.isCapacitacion_ensenanza() + "\n");
            writer.write("Planificación de rutas: " + v.isPlanificacion_rutas() + "\n");
            writer.write("Informática: " + v.isInformatica() + "\n");
            writer.write("Inglés: " + v.isIngles() + "\n");
            writer.write("Documentación: " + v.isDocumentacion() + "\n");
            writer.write("Fotografía: " + v.isFotografia() + "\n");

            writer.write("CAPACIDAD FISICA: \n");
            writer.write("Entrenamiento regular: " + v.isEntrenamiento_regular() + "\n");
            writer.write("Natación: " + v.isNatacion() + "\n");
            writer.write("Escalada: " + v.isEscalada() + "\n");
            writer.write("Marcha: " + v.isMarcha() + "\n");
            writer.write("Tareas de carga/peso: " + v.isTareas_carga_peso() + "\n");

            writer.write("Tipo de voluntario: " + v.getTipo() + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al exportar: " + e.getMessage());
        }
    }
}
