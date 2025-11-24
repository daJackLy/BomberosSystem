package controller;

import model.*;
import view.VoluntarioFormView;
import javax.swing.*;
import java.util.logging.Logger;

public class VoluntarioController {
    private static final Logger logger = Logger.getLogger(VoluntarioController.class.getName());
    private VoluntarioFormView view;
    private ExportarDatosService exportarService;

    public VoluntarioController(VoluntarioFormView view) {
        this.view = view;
        this.exportarService = new ExportarDatosService();
    }

    public boolean procesarFormulario() {
        try {
            logger.info("Iniciando procesamiento de formulario...");

            // 1. Validar datos obligatorios
            if (!validarDatosObligatorios()) {
                logger.warning("Validación de datos falló");
                return false;
            }

            // 2. Determinar tipo de voluntario
            String tipo = determinarTipoVoluntario();
            logger.info("Tipo de voluntario determinado: " + tipo);

            // 3. Crear voluntario usando Factory Pattern
            Voluntario voluntario = VoluntarioFactory.crearVoluntario(tipo);
            
            // 4. Construir voluntario usando Builder Pattern
            voluntario = construirVoluntario(voluntario, tipo);
            
            // 5. Exportar datos
            exportarService.exportarVoluntario(voluntario);
            logger.info("Datos exportados exitosamente");

            // 6. Guardar documentos
            if (guardarDocumentos(voluntario)) {
                logger.info("Documentos guardados exitosamente");
            }

            return true;
            
        } catch (NumberFormatException e) {
            logger.severe("Error de formato numérico: " + e.getMessage());
            JOptionPane.showMessageDialog(view, 
                "Error en formatos numéricos (DNI, teléfono). Verifique que sean números válidos.", 
                "Error de Formato", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (Exception e) {
            logger.severe("Error crítico al procesar formulario: " + e.getMessage());
            JOptionPane.showMessageDialog(view, 
                "Error inesperado al procesar el formulario: " + e.getMessage(), 
                "Error Crítico", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean validarDatosObligatorios() {
        // Validar datos personales
        if (view.getTxtNom().getText().trim().isEmpty()) {
            mostrarError("El nombre es obligatorio");
            return false;
        }
        
        if (view.getTxtApe().getText().trim().isEmpty()) {
            mostrarError("Los apellidos son obligatorios");
            return false;
        }
        
        // Validar DNI
        String dniText = view.getTxtDni().getText().trim();
        if (dniText.isEmpty()) {
            mostrarError("El DNI es obligatorio");
            return false;
        }
        if (!dniText.matches("\\d{8}")) {
            mostrarError("DNI debe tener exactamente 8 dígitos numéricos");
            return false;
        }
        
        // Validar fecha de nacimiento
        if (view.getTxtFec().getDate() == null) {
            mostrarError("La fecha de nacimiento es obligatoria");
            return false;
        }
        
        // Validar correo
        String correo = view.getTxtCor().getText().trim();
        if (correo.isEmpty()) {
            mostrarError("El correo electrónico es obligatorio");
            return false;
        }
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            mostrarError("Ingrese un correo electrónico válido (ejemplo: usuario@dominio.com)");
            return false;
        }
        
        // Validar teléfono
        String telefono = view.getTxtTel().getText().trim();
        if (telefono.isEmpty()) {
            mostrarError("El teléfono es obligatorio");
            return false;
        }
        if (!telefono.matches("\\d{9}")) {
            mostrarError("El teléfono debe tener 9 dígitos numéricos");
            return false;
        }
        
        // Validar dirección
        if (view.getTxtDir().getText().trim().isEmpty()) {
            mostrarError("La dirección es obligatoria");
            return false;
        }
        
        return true;
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(view, mensaje, "Error de Validación", JOptionPane.ERROR_MESSAGE);
    }

    private String determinarTipoVoluntario() {
        try {
            int edad = Integer.parseInt(view.getTxtEda().getText());
            
            if (edad >= 16 && edad < 18) {
                return "joven";
            } else if (view.getBtnVolSi().isSelected()) {
                return "reingreso";
            } else {
                return "nuevo";
            }
        } catch (NumberFormatException e) {
            logger.warning("Error al determinar tipo de voluntario, usando 'nuevo' por defecto");
            return "nuevo";
        }
    }

    private Voluntario construirVoluntario(Voluntario voluntario, String tipo) {
        VoluntarioBuilder builder = new VoluntarioBuilder(voluntario);
        
        // Datos personales
        builder
            .withNombres(view.getTxtNom().getText().trim())
            .withApellidos(view.getTxtApe().getText().trim())
            .withDni(Integer.parseInt(view.getTxtDni().getText().trim()))
            .withFechaNacimiento(((JTextField)view.getTxtFec().getDateEditor().getUiComponent()).getText())
            .withEdad(Integer.parseInt(view.getTxtEda().getText()))
            .withSexo(view.getBtnSexMasculino().isSelected() ? "Masculino" : "Femenino")
            .withCorreo(view.getTxtCor().getText().trim())
            .withTelefono(Integer.parseInt(view.getTxtTel().getText().trim()))
            .withPoseeLicencia(view.getBtnLicSi().isSelected())
            .withDistrito(view.getTxtDis().getSelectedItem().toString())
            .withDireccion(view.getTxtDir().getText().trim())
            .withReferencia(view.getTxtRef().getText().trim());

        // Experiencia y motivación
        builder
            .withVoluntarioAnteriormente(view.getBtnVolSi().isSelected())
            .withExperienciaPrevia(view.getTxtExpPrevia().getSelectedItem().toString())
            .withParticipacionProgramas(construirParticipacionProgramas())
            .withPreguntaMotivacion(view.getTxtMot().getText().trim())
            .withPreguntaAporte(view.getTxtAport().getText().trim())
            .withPreguntaPresion(view.getTxtManejo().getText().trim())
            .withPreguntaEntrenamientoRegular(view.getBtnEntrSi().isSelected())
            .withPreguntaCapacitacionesIniciales(view.getBtnCompCapaSi().isSelected())
            .withPreguntaImpedimentoFisico(view.getTxtDiscap().getText().trim())
            .withHorarioColaborar(view.getTxtDisp().getSelectedItem().toString())
            .withTipo(tipo);

        // Habilidades - Emergencia y rescate
        builder
            .withPrimAuxilios(view.getBtnSkillPrimerosAuxiliosBasicos().isSelected())
            .withRcp(view.getBtnSkillRCP().isSelected())
            .withControlHemorragias(view.getBtnSkillControlHemorragias().isSelected())
            .withInmovilizacionFracturas(view.getBtnSkillFracturas().isSelected())
            .withEvacuacionHeridos(view.getBtnSkillEvacHeridos().isSelected())
            .withBusquedaRescate(view.getBtnSkillBusqRescate().isSelected())
            .withRescateVehicular(view.getBtnSkillRescVehicular().isSelected())
            .withRescateAcuatico(view.getBtnSkillRescAcuatico().isSelected())
            .withRescateAlturas(view.getBtnSkillRescAltura().isSelected())
            .withSupervivenciaCampoSelva(view.getBtnSkillCampoSelva().isSelected());

        // Habilidades - Conocimiento de incendios
        builder
            .withUsoExtintores(view.getBtnSkillExtintores().isSelected())
            .withManejoMangueras(view.getBtnSkillManguerasAgua().isSelected())
            .withERA(view.getBtnSkillUsoERA().isSelected())
            .withIdentificacionInflamables(view.getBtnSkillMatInflamables().isSelected())
            .withControlIncFforestales(view.getBtnSkillIncendiosForestales().isSelected())
            .withControlIncEstructurales(view.getBtnSkillIncendiosEstructurales().isSelected())
            .withControlIncVehiculares(view.getBtnSkillIncendiosVehiculares().isSelected())
            .withControlIncDomesticos(view.getBtnSkillPrevIncendiosDomesticos().isSelected());

        // Habilidades - Técnicas generales
        builder
            .withMecanica(view.getBtnSkillMecanica().isSelected())
            .withElectricidad(view.getBtnSkillElectricidad().isSelected())
            .withCarpinteria(view.getBtnSkillCarpinteria().isSelected())
            .withAlbanileria(view.getBtnSkillAlbanileria().isSelected())
            .withSoldadura(view.getBtnSkillSoldadura().isSelected())
            .withUsoHerramientas(view.getBtnSkillHerramientas().isSelected())
            .withConduccionVehiculosPesados(view.getBtnSkillConduccionVehicPesados().isSelected())
            .withRadioComunicaciones(view.getBtnSkillRadioComunicaciones().isSelected());

        // Habilidades - Organización y liderazgo
        builder
            .withCoordinacionGrupos(view.getBtnSkillCoordinacionGrupos().isSelected())
            .withGestionEmergencias(view.getBtnSkillGestionEmergencias().isSelected())
            .withLogisticaSuministros(view.getBtnSkillLogisticaSuministros().isSelected())
            .withComunicacionEfectiva(view.getBtnSkillComunicacionEfectiva().isSelected())
            .withCapacitacionEnsenanza(view.getBtnSkillCapacitacionEnsenanza().isSelected())
            .withPlanificacionRutas(view.getBtnSkillRutasEvacuaciones().isSelected());

        // Habilidades - Conocimiento complementario
        builder
            .withInformatica(view.getBtnSkillInformatica().isSelected())
            .withIngles(view.getBtnSkillIngles().isSelected())
            .withDocumentacion(view.getBtnSkillDocumentacion().isSelected())
            .withFotografia(view.getBtnSkillFotografia().isSelected());

        // Habilidades - Condición física
        builder
            .withEntrenamientoRegular(view.getBtnSkillEntrFisicoRegular().isSelected())
            .withNatacion(view.getBtnSkillNatacion().isSelected())
            .withEscalada(view.getBtnSkillEscalada().isSelected())
            .withMarcha(view.getBtnSkillMarchaCaminata().isSelected())
            .withTareasCargaPeso(view.getBtnSkillCargaPeso().isSelected());

        return builder.build();
    }

    private String construirParticipacionProgramas() {
        StringBuilder participacion = new StringBuilder();
        
        if (view.getBtnCapaCRoja().isSelected()) participacion.append("Cruz Roja, ");
        if (view.getBtnCapaPNPFFAA().isSelected()) participacion.append("PNP/FFAA, ");
        if (view.getBtnCapaDCivil().isSelected()) participacion.append("Defensa Civil, ");
        if (view.getBtnCapaOtros().isSelected()) participacion.append("Otros, ");

        if (participacion.length() > 0) {
            participacion.setLength(participacion.length() - 2); // Remover última coma y espacio
        }
        
        return participacion.toString();
    }

    private boolean guardarDocumentos(Voluntario voluntario) {
        try {
            // Tu lógica existente para guardar documentos
            // (la que tenías en el método btn4EntregarFormularioActionPerformed)
            
            File carpetaPrincipal = new File("Postulantes");
            carpetaPrincipal.mkdir();
            
            String carpetaNombre = voluntario.getNombres() + "_" + voluntario.getApellidos() + "_" + voluntario.getDni();
            File carpetaPostulante = new File(carpetaPrincipal, carpetaNombre);
            carpetaPostulante.mkdir();

            // Aquí iría tu lógica para copiar los archivos subidos...
            
            return true;
        } catch (Exception e) {
            logger.warning("Error al guardar documentos: " + e.getMessage());
            return false;
        }
    }
}
