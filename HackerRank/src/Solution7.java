import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution7 {
	

	static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones,
			List<Integer> inMaintenanceDrones) {
		
		long startTime = System.currentTimeMillis();
		
		List<Integer> AvailableDrones = new ArrayList<>();
		
		for (int i = 0; i < inMaintenanceDrones.size(); i++) {
			for (int j = 0; j < drones.size(); j++) {
				if(drones.get(j).getId() == inMaintenanceDrones.get(i)){
					drones.remove(j);
					continue;
				}
			}
		}
		
		//sort by DroneFlightRange
		Collections.sort(drones, new Comparator<Drone>() {
			@Override
			public int compare(Drone d1, Drone d2) {
				return d2.getFlightRange() - d1.getFlightRange();
			}
		});
		
		for (int i = 0; i < numberOfRequiredDrones; i++) {
			AvailableDrones.add(drones.get(i).getId());		
		}
		
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Method time = " + estimatedTime);
		return AvailableDrones;
	}

	private static class Drone {
		private int id;
		private int flightRange;

		public Drone(int id, int flightRange) {

			this.id = id;
			this.flightRange = flightRange;
		}

		public int getId() {
			return id;
		}

		public int getFlightRange() {
			return flightRange;
		}
	}

	// The first line of the input contains three decimal integers separated by
	// space: total number of drones ('D'), number of drones to be selected
	// ('G') and number of drones in maintenance ('M').
	// The following 'D' lines each contains two decimal integers separated by
	// space with information about each drone: ID and flight range in
	// kilometers.
	// The following 'M' lines each contains the numeric ID of a drone currently
	// in maintenance.

	// Print the IDs of the 'G' selected drones to the standard output, one per
	// line, sorted by flight range (greater first).
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("C:\\Users\\Pedro\\Desktop\\input001.txt"));
		
		Scanner in = new Scanner(System.in);

		int numberOfDrones = in.nextInt();
		int numberOfRequiredDrones = in.nextInt();
		int numberOfDronesInMaintenance = in.nextInt();

		List<Drone> drones = new ArrayList<>();
		List<Integer> inMaintenanceDrones = new ArrayList<>();

		for (int i = 0; i < numberOfDrones; i++) {
			drones.add(new Drone(in.nextInt(), in.nextInt()));
		}

		for (int i = 0; i < numberOfDronesInMaintenance; i++) {
			inMaintenanceDrones.add(in.nextInt());
		}

		List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones,
				inMaintenanceDrones);

		for (int i = 0; i < greatestFlightRangeDrones.size(); i++) {
			System.out.println(greatestFlightRangeDrones.get(i));
		}

	}
}
