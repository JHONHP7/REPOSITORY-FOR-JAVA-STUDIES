import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);
        
			// Data e hour \\
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//IMPORTANTE
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2023-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fmt2);
        LocalDate d10 = LocalDate.of(2023, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 7, 20, 1, 30);
        
        /*for (String s: ZoneId.getAvailableZoneIds()) {//IMPRIME NOMES DAS ZONAS ID
        	System.out.println(s);
        };*/
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);
        
        System.out.println("do4 dia = " + d04.getDayOfMonth());
        System.out.println("do4 mês = " + d04.getMonthValue());
        System.out.println("do4 ano = " + d04.getYear());
        
        System.out.println("do5 hora = " + d05.getHour());
        System.out.println("do5 minuto = " + d05.getMinute());
        
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
        System.out.println("d12 = " + fmt3.format(d06));
        System.out.println("d13 = " + d09.format(fmt4));
        
        			//CALCULO COM DATA HORA\\
        LocalDate d20 = LocalDate.parse("2023-07-20");
        LocalDateTime d21 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant d22 = Instant.parse("2023-07-20T01:30:26Z");
        
        LocalDate pastWeekLocalDate = d20.minusDays(7); //MINUS DIMINUI DIAS/MES/ ANO
        LocalDate nextWeekLocalDate = d20.plusDays(7); //PLUS ADD DIAS MESES ANOS
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);
        
        LocalDateTime pastWeekLocalDateTime = d21.minusDays(7); //MINUS DIMINUI DIAS/MES/ ANO / HORA MINUTO
        LocalDateTime nextWeekLocalDateTime = d21.plusDays(7); //PLUS ADD DIAS MESES ANOS / HORA MINUTO
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);
        
        Instant pastWeekInstant = d22.minus(7,ChronoUnit.DAYS); //MINUS DIMINUI DIAS/MES/ ANO / HORA MINUTO
        Instant nextWeekInstant = d22.plus(7, ChronoUnit.DAYS); //PLUS ADD DIAS MESES ANOS / HORA MINUTO
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = "+ nextWeekInstant);
        
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d20.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d21);
        Duration t3 = Duration.between(pastWeekInstant, d22);
        Duration t4 = Duration.between(d22,pastWeekInstant);
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    
    }
}
