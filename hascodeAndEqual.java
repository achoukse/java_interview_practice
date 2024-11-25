import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hascodeAndEqual {
    public static void main(String[] args) {
        Employee emp1= new Employee(1);
        Employee emp2 = new Employee(1);

        Map <Employee,String> map = new HashMap<>();
        map.put(emp1,"Jack");
        map.put(emp2,"jack");

        System.out.println(map.size());

        Integer i = new Integer(1);
        Integer i1 = new Integer(1);

        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(i,"one");
        map1.put(i1,"one");
        System.out.println(map1.size());


    }

}
class Employee{
    int id;
    public Employee(int id){
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}