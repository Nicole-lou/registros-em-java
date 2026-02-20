import java.util.Objects;

public class employeeClass {

    private final String name;

    public String getName() {
        return name;
    }

// Modo tradicional
    @Override
    public String toString() {
        return "employeeClass(name=" + this.getName() +", employeeNumber=" + this.getEmployeeNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        employeeClass that = (employeeClass) o;
        return employeeNumber == that.employeeNumber && Objects.equals(name, that.name);
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    private final int employeeNumber;

    public employeeClass (String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }
}

/* Armazenando dados de pessoas de modo tradicional na pasta employeeClass.java e recordsTutorial*/

