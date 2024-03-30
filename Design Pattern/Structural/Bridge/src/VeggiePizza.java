public class VeggiePizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding Cheese");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is: " + crust);
    }

    @Override
    public void setSauce(String s) {

    }

    @Override
    public void setToppings(String s) {

    }

    @Override
    public void setCrust(String s) {

    }

}
