import java.util.Iterator;

public class StaffListIterator implements Iterator {
    private StaffList staffList;
    private int index = 0;
    public StaffListIterator(StaffList staffList){
        this.staffList = staffList;
    }

    @Override
    public boolean hasNext() {
        Employee [] employees = staffList.getEmployees();
        return index < employees.length;
    }

    @Override
    public Object next() {
        Employee [] employees = staffList.getEmployees();

        if (hasNext()){
           Employee employee = employees[index++];
           return employee;
        }
        return null;
    }
}
