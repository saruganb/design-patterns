import java.util.HashMap;
import java.util.Map;

public class Mediator {

    private Map<Long, Plane> planeLists;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;
    private Runway runway;

    public Mediator(){
        this.planeLists = new HashMap<>();
        this.planesInFlight = new PlanesInFlight();
        this.planesOnGround = new PlanesOnGround();
        this.runway = new Runway();
    }

    public void takeOff(int id){
        Plane p = this.planeLists.get((long)id);
        if(!p.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + id + " is taking off...");
            planesOnGround.removePlane(p);
            planesInFlight.addPlane(p);
            p.setIsInTheAir(true);
        }
    }

    public void addPlane(Plane plane){
        this.planeLists.put((long) plane.getId(),plane);
        this.planesOnGround.addPlane(plane);
    }
}
