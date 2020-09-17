package geolocation;

public class Main {

		public static void main(String[] args) {
		GeoLocation P1_DiagonalFromDoor = new GeoLocation(40.672853, -111.942420);
		GeoLocation P2_ProfessorDesk = new GeoLocation(40.672853, -111.942325);
		GeoLocation P3_Door = new GeoLocation(40.672961, -111.942323);
		GeoLocation P4_Cabinet = new GeoLocation(40.672960, -111.942419);
		System.out.println(P4_Cabinet.distanceFrom(P3_Door) * 5280);
		System.out.println(P3_Door.distanceFrom(P1_DiagonalFromDoor) * 5280);
		}
}
