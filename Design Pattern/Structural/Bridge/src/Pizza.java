public abstract class Pizza {

    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();

    public abstract void setSauce(String s);

    public abstract void setToppings(String s);

    public abstract void setCrust(String s);

}