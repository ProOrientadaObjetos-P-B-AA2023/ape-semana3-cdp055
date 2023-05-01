import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora ev = new EquivalenteHora(2);
        ev.calcularDias();
        ev.calcularMinutos();
        ev.calcularSegundos();
        System.out.println(ev);
    }
}

class EquivalenteHora {
    private int hr;
    private int min;
    private int segn;
    private float dias;

    public EquivalenteHora(int hr) {
        this.hr=hr;
    }


    public void calcularMinutos(){
        this.min = this.hr * 60;
    }
    public void calcularSegundos(){
        this.segn = this.hr * 3600;
    }
    public void calcularDias(){
        this.dias = (float) (this.hr / 24.0);
    }


    public void setHoras(int hr){
        this.hr=hr;
    }
    public void setMinutos(int min){
        this.min=min;
    }
    public void setSegundos(int segn){
        this.segn=segn;
    }
    public void setDias(float dias){
        this.dias=dias;
    }



    public int getHoras() {
        return this.hr;
    }

    public int getMinutos() {
        return this.min;
    }

    public int getSegundos() {
        return this.segn;
    }

    public float getDias() {
        return this.dias;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Conversor: " +
                        "\nDias: %.2f" +
                        "\nHoras: %d" +
                        "\nMinutos: %d" +
                        "\nSegundos: %d",
                getDias(), getHoras(), getMinutos(), getSegundos());

        return mensaje;
    }
}
