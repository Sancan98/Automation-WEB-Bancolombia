package org.example.Actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate implements Performable {
    @Override
    public void performAs(Actor actor) {
        //Se utiliza ZoneId y ZonedDateTime para utilizar la zona horaria de Honduras
        //El formato de la fecha trae dia mes año hora y minutos exceptuando AM/PM
        ZoneId zonahoraria = ZoneId.of("America/Tegucigalpa");
        ZonedDateTime myDateObj = ZonedDateTime.now(zonahoraria);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a", Locale.ENGLISH);
        String formattedDate = myDateObj.format(myFormatObj);
        actor.remember("formattedDate", formattedDate);
    }
    public static Performable currentDate() {
        return new FormatDate();
    }
}
