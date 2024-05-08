class Employee {
    int eid;
    String ename;

    Employee(int id, String name) {
        eid = id;
        ename = name;
    }

    Employee(Employee obj) {
        eid = obj.eid;
        ename = obj.ename;
    }

    void display() {
        System.out.println(eid + " " + ename);
    }
}

class EmployeeCopy {
    public static void main(String args[]) {
        Employee e1 = new Employee(101, "ABC");
        Employee e2 = new Employee(e1);
        e1.display();
        e2.display();
    }
}