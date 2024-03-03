public class Memento {
    private int savedValue;

    public Memento(int value){
        this.savedValue = value;
    }

    public void setState (int value){
        this.savedValue = value;
    }

    public int getState () {
        return this.savedValue;
    }
}
