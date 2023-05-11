package olimpiadas;

public class Delegacion {
    String pais;
    int nroDeportistas;
    int medallasOro;
    int medallasPlata;
    int medallasBronce;

    //contructor


    public Delegacion(String pais, int nroDeportistas, int medallasOro, int medallasPlata, int medallasBronce) {
        this.pais = pais;
        this.nroDeportistas = nroDeportistas;
        this.medallasOro = medallasOro;
        this.medallasPlata = medallasPlata;
        this.medallasBronce = medallasBronce;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNroDeportistas() {
        return nroDeportistas;
    }

    public void setNroDeportistas(int nroDeportistas) {
        this.nroDeportistas = nroDeportistas;
    }

    public int getMedallasOro() {
        return medallasOro;
    }

    public void setMedallasOro(int medallasOro) {
        this.medallasOro = medallasOro;
    }

    public int getMedallasPlata() {
        return medallasPlata;
    }

    public void setMedallasPlata(int medallasPlata) {
        this.medallasPlata = medallasPlata;
    }

    public int getMedallasBronce() {
        return medallasBronce;
    }

    public void setMedallasBronce(int medallasBronce) {
        this.medallasBronce = medallasBronce;
    }

    public void mostrarDelegacion(){
        System.out.println("El pais es: " +pais);
        System.out.println("El numero de deportistas es: "+nroDeportistas);
        System.out.println("El numero de medallas de oro es: "+medallasOro);
        System.out.println("El numero de medallas de palta es: "+medallasPlata);
        System.out.println("El numero de medallas de bronce es:"+medallasBronce);

    }

    public int calcularCantidadDeMedallas(){
        return medallasOro+medallasPlata+medallasBronce;
    }
}
