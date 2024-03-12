package EJERCICIO3punto2;

public class Trabajador {
    private String nombre;
    private String mes;
    private int año;
    private double salarioBruto;
    private double salarioNeto;

    public Trabajador(String nombre, String mes, int año) {
        this.nombre = nombre;
        this.mes = mes;
        this.año = año;
    }

    public double calculaSalarioBruto(String tipoEmpleado, double ventasMes, int horasExtra) {
        double salarioBase;
        if (tipoEmpleado.equals("vendedor")) {
            salarioBase = 1000;
        } else {
            salarioBase = 1500;
        }

        double prima;
        if (ventasMes >= 1500) {
            prima = 200;
        } else if (ventasMes >= 1000) {
            prima = 100;
        } else {
            prima = 0;
        }

        double pagoHorasExtra = horasExtra * 20;
        this.salarioBruto = salarioBase + prima + pagoHorasExtra;
        return this.salarioBruto;
    }

    public double calculaSalarioNeto(double salarioBruto) {
        double retencion;
        if (salarioBruto < 1000) {
            retencion = 0;
        } else if (salarioBruto < 1500) {
            retencion = 0.16;
        } else {
            retencion = 0.18;
        }
        this.salarioNeto = salarioBruto * (1 - retencion);
        return this.salarioNeto;
    }

    // Métodos get y set para cada variable de clase
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }
    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }
    public double getSalarioBruto() { return salarioBruto; }
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }
    public double getSalarioNeto() { return salarioNeto; }
    public void setSalarioNeto(double salarioNeto) { this.salarioNeto = salarioNeto; }
}