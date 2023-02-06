
import java.time.*;
import java.time.temporal.*;

public class fechas {

    public static void main(String[] args) {
        LocalDate hoy;
        hoy = LocalDate.now();

        System.out.println("Hoy es:  " + hoy);
        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println("La hora actual es: " + LocalTime.now());
        System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());
        System.out.println("La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now());

        //Uso de of
        System.out.println("Fecha de mi cumpleaños: " + LocalDate.of(2002, Month.JULY, 26)); //año mes y día

        //Es posible extraer cualquier parte de una fecha o una hora a través de los métodos getrXXX() : getHour(), getMonth(), getDayOfWeek()...
        System.out.println("Hoy es Día: " + hoy.getDayOfWeek());
        System.out.println("Este Mes es: " + hoy.getMonth());
        System.out.println("Este Año es: " + hoy.getYear());

        //with
        System.out.println("El primer día del próximo mes es: " + LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());

        LocalDate fNacimiento = LocalDate.of(2002, Month.JULY, 26);
        System.out.println("Tu edad es de " + ChronoUnit.YEARS.between(fNacimiento, LocalDate.now()) + " años");

        //period
        LocalDate finDeAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinDeAnio = hoy.until(finDeAnio);
        int meses = hastaFinDeAnio.getMonths();
        int dias = hastaFinDeAnio.getDays();
        System.out.println("Faltan " + meses + " mes(es) y " + dias + " día(s) hasta final de año.");

        hastaFinDeAnio = Period.between(hoy, finDeAnio);
        System.out.println("Hasta fin de año: " + hastaFinDeAnio);

    }
}
