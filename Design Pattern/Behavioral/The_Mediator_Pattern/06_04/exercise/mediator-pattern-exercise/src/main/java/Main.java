public class Main {

  public static void main(String[] args) {
    Plane plane = new Plane(123);
    Mediator mediator = new Mediator();
    mediator.addPlane(plane);
    mediator.takeOff(plane.getId());

  }

}
