package SoftwareUdvikling.PersonExample;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}


class Staff extends Person {

    private float salary;

    public Staff(String name, float salary){
        super (name);
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

}

class Customer extends Person {

    private int type;

    public Customer(String name, int type){
        super(name);
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

}

class Company {
    private String companyName;

    public Company(String companyName){
        this.companyName = companyName;
    }

    //Getter
    public String getName() {
        return this.companyName;
    }
}

class Test {

    public static void main(String[] args) {
        Customer c1 = new Customer("Lars", 10);
        Staff s1 = new Staff("Laban", 2000000);
        Company co1 = new Company("Carl ");

        System.out.println("Vores bedste kunde er " + c1.getName() + ".");
        System.out.println("\nDu kender måske hen bag kassen, hen hedder " + s1.getName() + ".");
        System.out.println("\nVi hedder egentlig Carl Ras, men folk kalder os " + co1.getName() + ".");
        System.out.println("\nDu kommer til at tjene \"" + s1.getSalary() + "\" kr om året");
        System.out.println("\nHam der er helt klart kundetype " + c1.getType() + "! Se bare på hans negle!");
    }
}