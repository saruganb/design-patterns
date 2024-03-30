public class PepperoniPizza extends Pizza {

    @Override
    public void assemble() {
        this.setSauce("Adding Sauce: " + sauce);
        this.setToppings("Adding Toppings: " + toppings);
        this.setCrust("Adding Pepperoni");
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
