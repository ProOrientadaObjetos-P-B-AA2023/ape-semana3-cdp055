public class Problema3 {
    public static void main(String[] args) {
        InstitucionEducativa educativa= new InstitucionEducativa("Bernardo","Fiscal", 3000,60,5,1700);
        educativa.calcularPresupuesto();
        System.out.println(educativa);
    }
}
class InstitucionEducativa {
    private String nom;
    private String Institucion;
    private int numAlumno;
    private int numDocentes;
    private int numSedes;
    private double gastosProyectados;
    private double presupuesto;

    public InstitucionEducativa(){}
    public InstitucionEducativa(String nom, String Institucion, int numAlumno, int numDocentes, int numSedes, double gastosProyectados) {
        this.nom = nom;
        this.Institucion = Institucion;
        this.numAlumno = numAlumno;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosProyectados = gastosProyectados;
    }

    public void calcularPresupuesto(){
        this.presupuesto= numAlumno * gastosProyectados;
    }

    public void setNombre(String nombre){
        this.nom=nombre;
    }
    public void setTipoInstitucion(String tipoInstitucion){
        this.Institucion=tipoInstitucion;
    }
    public void setNumeroAlumnos(int numeroAlum){
        this.numAlumno=numeroAlum;
    }
    public void setNumeroDocentes(int numeroDocentes){
        this.numDocentes=numeroDocentes;
    }
    public void setNumeroSedes(int numeroSedes){
        this.numSedes=numeroSedes;
    }
    public void serPresup(double presupuesto){
        this.presupuesto=presupuesto;
    }
    public String getNombre() {
        return this.nom;
    }

    public String getTipoInstitucion() {
        return this.Institucion;
    }

    public int getNumeroAlumnos() {
        return this.numAlumno;
    }

    public int getNumeroDocentes() {
        return this.numDocentes;
    }

    public int getNumeroSedes() {
        return this.numSedes;
    }

    public double getGastosProyectados() {
        return this.gastosProyectados;
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    @Override
    public String toString() {
        String mensaje = String.format("INSTITUCION EDUCATIVA" +
                        "\nNombre: %s" +
                        "\nTipo: %s" +
                        "\nNumero Alumnos: %d" +
                        "\nNumero Docentes: %d" +
                        "\nNumero Sedes: %d" +
                        "\nGastos Proyectados: %.2f" +
                        "\nPresupuesto: %.2f", this.getNombre(), this.getTipoInstitucion(), this.getNumeroAlumnos(), this.getNumeroDocentes(), this.getNumeroSedes(),
                this.getGastosProyectados(), this.getPresupuesto());
        return mensaje;
    }
}