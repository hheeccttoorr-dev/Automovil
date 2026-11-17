import javax.swing.plaf.basic.BasicGraphicsUtils;

public class TestAutomovil {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Opel", "Astra", 2008);
        automovil.mostrarInformacion();
        System.out.println("---------");
        System.out.println(automovil);

        try{
            automovil.setMarca("");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            automovil.setModelo(null);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            automovil.setAnio(12);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(Automovil.ANIO_PRIMER_AUTOMOVIL);

        try{
            Automovil cocheMal = new Automovil("Peugeot", "73", 12);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
