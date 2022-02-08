package Applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date now  = new Date();
		
		System.out.println("Enter Room number : ");
		int room = sc.nextInt();
		System.out.println("Enter date Check-in (dd/MM/yyyy) : ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Enter date Check-out (dd/MM/yyyy) : ");
		Date checkOut = sdf.parse(sc.next());
		
		if(checkIn.before(now) || checkOut.before(now) || (!checkOut.after(checkIn))) {
			System.out.println("Invalid Date ");
		}else {

			Reservation reservation =  new Reservation(checkIn, checkOut, room);
			System.out.println("Reservation : " + reservation.toString());
			
			System.out.println("");
			
			System.out.println("Enter date to update the reservation : ");
			System.out.println("Enter Room number : ");
			room = sc.nextInt();
			System.out.println("Enter date Check-in (dd/MM/yyyy) : ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Enter date Check-out (dd/MM/yyyy) : ");
			checkOut = sdf.parse(sc.next());
			
			if((!checkOut.after(checkIn)) || (checkIn.before(now) || checkOut.before(now))) {
				System.out.println("Invalid Date to update ");
			}else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation : " + reservation.toString());
			}
		}
		
		
			sc.close();
			System.out.println("Program Finish");
		
	}

}