package org.example.Actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DateManipulation {
    public static String Date(String periodicity, Integer value) {

        String futureDate = null;
        // Se obtiene lafecha actual del Dispositivo
        LocalDate DateCurrenly = LocalDate.now();
        // Fecha adelantado un día al calendario dado que se toma como fecha inicial una adelante del calendario
        LocalDate DatePlus = DateCurrenly.plusDays(1);

        // Sumar dias a la fecha actual
        LocalDate futureDateDays = DatePlus.plusDays(value);

        // Sumar meses a la fecha actual
        LocalDate futureDateMonths = DatePlus.plusMonths(value);

        // Sumar años a la fecha actual
        LocalDate futureDateAnual = DatePlus.plusYears(value);

        // Definir el formato deseado para la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if(Objects.equals(periodicity, "Anual")){
            futureDate = futureDateAnual.format(formato);
        } else if (Objects.equals(periodicity, "Diaria")) {
            futureDate = futureDateDays.format(formato);
        } else if (Objects.equals(periodicity, "Semanal")) {
            futureDate = futureDateDays.format(formato);
        } else if (Objects.equals(periodicity, "Quincenal")) {
            futureDate = futureDateDays.format(formato);
        } else if (Objects.equals(periodicity, "Mensual")) {
            futureDate = futureDateMonths.format(formato);
        }
        return futureDate;
    }
}
