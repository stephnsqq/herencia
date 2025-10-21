// Clase base
class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public double calcularSalario() {
        return salario;
    }
    
    public void mostrarInfo() {
        System.out.println(nombre + " - Salario: $" + calcularSalario());
    }
}

// Empleado con bono
class EmpleadoConBono extends Empleado {
    private double bono;
    
    public EmpleadoConBono(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario() {
        return salario + bono;
    }
}

// Empleado por horas
class EmpleadoPorHoras extends Empleado {
    private int horas;
    
    public EmpleadoPorHoras(String nombre, int horas, double tarifa) {
        super(nombre, horas * tarifa);
        this.horas = horas;
    }
}

// Clase principal
public class empleos {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 3000);
        EmpleadoConBono emp2 = new EmpleadoConBono("Ana", 3000, 500);
        EmpleadoPorHoras emp3 = new EmpleadoPorHoras("Carlos", 160, 25);
        
        emp1.mostrarInfo();
        emp2.mostrarInfo();
        emp3.mostrarInfo();
    }
}