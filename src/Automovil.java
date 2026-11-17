public class Automovil {

    private String marca, modelo;
    private int anio;

    public Automovil(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public static final int ANIO_PRIMER_AUTOMOVIL = 1886;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca==null||marca.trim().isEmpty()){
            throw new IllegalArgumentException("Marca no puede estar vacio");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo==null||modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo no puede estar vacio");
        }
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio<ANIO_PRIMER_AUTOMOVIL) {
            throw new IllegalArgumentException("Año no puede estar vacio");
        }
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
