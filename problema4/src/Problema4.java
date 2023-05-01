public class Problema4 {

    public static void main(String[] args) {
        Celular cel= new Celular("Android",4.5,325,10,"115aep205","gdt2005j4d");
        cel.calcularivaCostoFinal();
        System.out.println(cel);
    }
}
class Celular{
    private String sistemOperativo;
    private double tipoPantalla;
    private double precioInicial;
    private double ivaPorcentaje;
    private double ivaCostoFin;
    private String direccionMac;
    private String informacionIMEI;
    public Celular(String sistemOperativo, double tipoPantalla, double precioInicial,double ivaPorcentaje,String direccionMac, String informacionIMEI){
        this.sistemOperativo=sistemOperativo;
        this.tipoPantalla=tipoPantalla;
        this.precioInicial=precioInicial;
        this.ivaPorcentaje=ivaPorcentaje;
        this.direccionMac=direccionMac;
        this.informacionIMEI=informacionIMEI;
    }

    public void calcularivaCostoFinal(){this.ivaCostoFin=(this.precioInicial*(this.ivaPorcentaje/100))+this.precioInicial;}
    public void setSistemOperativo(String sistemOperativo){
        this.sistemOperativo=sistemOperativo;
    }
    public void settipoPantalla(double tipoPantalla){
        this.tipoPantalla=tipoPantalla;
    }
    public void setprecioInicial(double precioInicial){
        this.precioInicial=precioInicial;
    }
    public void setIvaPorcentaje(double ivaPorcentaje){
        this.ivaPorcentaje=ivaPorcentaje;
    }
    public void setIvaCostoFinal(double costoFinal){
        this.ivaCostoFin=ivaCostoFin;
    }
    public void setDireccionMac(String direccionMac){
        this.direccionMac=direccionMac;
    }
    public void setInformacionIMEI(String informacionIMEI){
        this.informacionIMEI=informacionIMEI;
    }

    public String getSistemaOperativo(){
        return this.sistemOperativo;
    }
    public double getTamanioPantalla(){
        return this.tipoPantalla;
    }
    public double getprecioInicial(){
        return this.precioInicial;
    }
    public double getIvaPorcentaje(){
        return this.ivaPorcentaje;
    }
    public double getIvaCostoFin(){
        return this.ivaCostoFin;
    }
    public String getDireccionMac(){
        return this.direccionMac;
    }
    public String getInfoIMEI(){
        return this.informacionIMEI;
    }
    public String toString(){
        String mensaje= String.format("DISPOSITIVOS ELECTRONICOS"+
                        "\nSistema Operativo: %s"+
                        "\nTamanio Pantalla: %.2f"+
                        "\nCosto Inicial: %.2f"+
                        "\nIva en Porcentaje:%.2f" +
                        "\nIva Costo Final: %.2f" +
                        "\nDireccion MAC: %s" +
                        "\nInfo IMEI: %s",
                this.getSistemaOperativo(),this.getTamanioPantalla(),this.precioInicial, this.ivaPorcentaje, this.ivaCostoFin,
                this.direccionMac, this.getInfoIMEI());

        return mensaje;
    }
}