package StreamAPI;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

    public class GetSalary {
        public static void main(String[] args) {
            HashMap<String, Employee> empMap = new HashMap<>();
            empMap.put("Raju", new Employee("Raju", "Java", 1000));
            empMap.put("Kiran", new Employee("Kiran", "BI", 2000));
            empMap.put("Suman", new Employee("Suman", "C#", 5000));
            empMap.put("Ramu", new Employee("Ramu", ".Net", 10000));
            System.out.println(getEmployees(empMap, 3000));
        }

        public static List<Employee> getEmployees(HashMap<String, Employee> empMap, int salary){
           // empMap.entrySet().stream().filter(e->e.getValue().getSalary()>salary).map(e->e.getValue()).collect(Collectors.toList());
            return empMap.entrySet().stream().filter(e->e.getValue().getSalary()>salary).map(e->e.getValue()).collect(Collectors.toList());
        }
    }
    class Employee{
        private String name;
        private String dept;
        private int salary;
        public Employee(String name, String dept, int salary) {
            super();
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDept() {
            return dept;
        }
        public void setDept(String dept) {
            this.dept = dept;
        }
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
        @Override
        public String toString() {
            return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
        }
    }

