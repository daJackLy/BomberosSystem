/*public boolean procesarFormulario() {
    try {
        logger.info("Iniciando procesamiento de formulario...");

        // 1. Validar datos obligatorios
        if (!validarDatosObligatorios()) {
            logger.warning("Validación de datos falló");
            return false;
        }

        // 2. Procesar con ambas implementaciones
        procesarConClasesPropias();
        procesarConClasesCompanero();
        
        // 3. Guardar documentos usando los datos de la vista
        String nombres = view.getTxtNom().getText().trim();
        String apellidos = view.getTxtApe().getText().trim();
        String dni = view.getTxtDni().getText().trim();
        
        if (!view.guardarDocumentos(nombres, apellidos, dni)) {
            logger.warning("Algunos documentos no se pudieron guardar correctamente");
        }
        
        logger.info("Formulario procesado exitosamente con ambas implementaciones");
        return true;
        
    } catch (Exception e) {
        logger.severe("Error crítico al procesar formulario: " + e.getMessage());
        JOptionPane.showMessageDialog(view, 
            "Error inesperado al procesar el formulario: " + e.getMessage(), 
            "Error Crítico", 
            JOptionPane.ERROR_MESSAGE);
        return false;
    }
}*/