package exemplo.comparable;

public class Employee implements Comparable<Employee> {
    private int id;

    public Employee(int id) {
        this.id = id;
    }

    public String toString() {
        return "Employee ID: " + this.id;
    }

    @Override
    public int compareTo(Employee employee) {
        if(employee == null) {
            if(this.id < employee.id){
                return -1; // A vem antes de B
            } else if(this.id > id) {
                return 1;   // A vem depois de B
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
