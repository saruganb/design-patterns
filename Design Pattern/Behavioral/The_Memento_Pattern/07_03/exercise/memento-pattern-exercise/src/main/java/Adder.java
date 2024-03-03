public class Adder {

  private int result;
  private Memento memento = new Memento(result);

  public void add(int newNumber) {
    result += newNumber;
  }

  public int getResult() {
    return result;
  }

  public void save(){
    memento.setState(this.result);
  }

  public void undo(){
    this.result = memento.getState();
  }

}
