package farmacia;

public class Empleado {

    private String nombreEmpleado;
    private int cedula;
    private int horasTrabajadas;
    private double valorPorHora;
    private double montoDeVenta;

    //Constructor


    public Empleado(String nombreEmpleado, int cedula, int horasTrabajadas, double valorPorHora) {
        this.nombreEmpleado = nombreEmpleado;
        this.cedula = cedula;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
        this.montoDeVenta = montoDeVenta;
    }

    //get y set

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getMontoDeVenta() {
        return montoDeVenta;
    }

    public void setMontoDeVenta(double montoDeVenta) {
        this.montoDeVenta = montoDeVenta;
    }

    //metodos
    public double calcularSalarioBruto(){
        double auxiliar;
        double SalarioBruto1=0.0;
        double restaHora;
        if(horasTrabajadas<=40){
            SalarioBruto1 = horasTrabajadas*valorPorHora;
        }else{
            restaHora=horasTrabajadas-40;
            auxiliar=40*valorPorHora;
            if(restaHora<=10){
                SalarioBruto1 = auxiliar+(restaHora*(valorPorHora)+(valorPorHora*0.10));
            } else if (restaHora<=15){
                SalarioBruto1 = auxiliar+(restaHora*(valorPorHora)+(valorPorHora*0.15));

            }else{
                SalarioBruto1 = auxiliar+(restaHora*(valorPorHora)+(valorPorHora*0.20));
            }
        }
        return SalarioBruto1;
    }

    public double calculcularBonificaciones() {
        double bonificacion = 0.0;
        if (montoDeVenta <= 800) {
            bonificacion = montoDeVenta * 0.02;
        } else if (montoDeVenta <= 1500) {
            bonificacion = montoDeVenta * 0.04;
        } else if (montoDeVenta <= 3000) {
            bonificacion = montoDeVenta * 0.06;
        } else {
            bonificacion = montoDeVenta * 0.08;
        }
        return bonificacion;
    }

    public double calcularSalarioFinal(){
        return (calcularSalarioBruto()-(calcularSalarioBruto()*0.0945))+calculcularBonificaciones();
    }
}


