import Airport.Model.Plane;
import Airport.service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService ps = new PlaneService();
        System.out.println("Creating first plane");
        Plane plane1 = ps.create();
        System.out.println("Creating second plane");
        Plane plane2 = ps.create();
        System.out.println("Creating third plane");
        Plane plane3 = ps.create();
        Plane[] planes = {plane1, plane2, plane3};

        ps.printInformation(plane1);
        ps.printSomeInfo(plane2);
        ps.printInformation(ps.newer(plane2, plane3));
        ps.biggerWingspan(plane1, plane2);
        ps.printInformation(ps.MostExpensive(plane1, plane2, plane3));
        ps.printPlaneWithSmallestSeats(plane1, plane2, plane3);
        ps.NotMilitaryPlanes(planes);
        ps.MilitariesMoreThan100Hours(planes);
        ps.printInformation(ps.minimalWeight(planes));
        ps.printInformation(ps.cheapest(planes));
        ps.printByYear(planes);
        ps.printBySeats(planes);
    }
}
