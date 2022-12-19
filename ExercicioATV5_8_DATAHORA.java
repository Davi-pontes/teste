package program; 


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExercicioATV5_8_DATAHORA {

	public static void main(String[] args) {
		
		//DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Scanner leitor = new Scanner(System.in);
		//LocalDate date = LocalDate.now();
		//LocalDateTime date2 = LocalDateTime.now();
		//Instant date3 = Instant.now();
		
		//LocalDate date4 = LocalDate.parse("2022-12-14");
		//LocalDateTime date5 = LocalDateTime.parse("2022-12-14T18:32:23");
		//Instant date6 = Instant.parse("2022-12-14T18:32:23Z");
		//Instant date7 = Instant.parse("2022-12-14T18:32:23-03:00");
		
		//LocalDate date8 = LocalDate.parse("14/12/2022" , fmt1);
		//LocalDateTime date9 = LocalDateTime.parse("14/12/2022 17:22" , fmt2);
		
		//LocalDate date10 = LocalDate.of(2022, 8, 13);
		//LocalDateTime date11 = LocalDateTime.of(2022, 8, 13, 1, 30);
		
		//System.out.println(date);
		//System.out.println(date2);
		//System.out.println(date3);
		//System.out.println(date4);
		//System.out.println(date5);
		//System.out.println(date6);
		//System.out.println(date7);
		//System.out.println(date8);
		//System.out.println(date9);
		//System.out.println(date10);
		//System.out.println(date11);
		
		
		//Convertendo data hora em texto
		
		LocalDate date12 = LocalDate.parse("2022-12-14");
		LocalDateTime date13 = LocalDateTime.parse("2022-12-14T18:32:23");
		Instant date14 = Instant.parse("2022-12-14T18:32:23Z");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println(date12.format(fmt3));
		System.out.println(fmt3.format(date12));
		//System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(date13.format(fmt3));
		System.out.println(date13.format(fmt4));
		
		System.out.println(fmt5.format(date14) );
		System.out.println(fmt7.format(date14) );
		
		
		
	}
}




