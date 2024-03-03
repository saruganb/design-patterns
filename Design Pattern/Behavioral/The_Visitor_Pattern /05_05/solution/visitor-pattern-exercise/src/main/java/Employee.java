public interface Employee {

  void accept(Visitor visitor);
  int getSalary();

}
