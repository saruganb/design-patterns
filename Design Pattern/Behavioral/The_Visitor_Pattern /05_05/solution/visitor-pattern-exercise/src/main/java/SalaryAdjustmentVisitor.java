public class SalaryAdjustmentVisitor implements Visitor {

  public void visit(Manager manager) {
    manager.setSalary(65000);
  }

  public void visit(SalesPerson salesPerson) {
    salesPerson.setSalary(57000);
  }

  public void visit(StaffList staffList) {
    System.out.println("Salary adjustments have been applied to all staff");
  }

}
