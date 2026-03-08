package com.alura.LiterAlura.Entity;

public enum Language {
    ESPANOL("ES"),
    INGLES("EN"),
    FRANCES("FR"),
    PORTUGES("FR"),
    LATIN("LA"),
    ITALIANO("IT");

    // Campo para almacenar el código de idioma
    private final String codigo;

    // Constructor para inicializar el código
    Language(String codigo) {
        this.codigo = codigo;
    }

    // Método para obtener el código de idioma
    public String getCodigo() {
        return this.codigo;
    }


    // Método estático para obtener el código dado el nombre del idioma
    public static String getCodeForName(String nombre) {
        for (Language idioma : Language.values()) {
            if (idioma.name().equalsIgnoreCase(nombre.replace('Ñ','N').replace('É','E').replace('Í','I'))) {
                return idioma.getCodigo();
            }
        }
        return null; // Si no se encuentra el idioma
    }

    // Método estático para obtener el nombre del idioma dado su código
    public static String getNameForCode(String codigo) {
        // Recorremos todos los idiomas del enum
        for (Language idioma : Language.values()) {
            // Comparamos el código proporcionado con el código del idioma
            if (idioma.getCodigo().equalsIgnoreCase(codigo)) {
                return idioma.name().replace('N','Ñ').replace('E','É').replace('I','Í');
                // Devolvemos el nombre del enum si hay coincidencia
            }
        }
        return null; // Si no se encuentra el idioma con el código dado
    }

}
