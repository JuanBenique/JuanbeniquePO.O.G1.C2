package pe.edu.upeu.asistencia.abspolimorfismo;

public class Loro extends Animal {

    private String tipo="ave";

    @Override
    public void emitirsonido() {
        System.out.println("no te duermas");

    }
    @Override
    public void dormir() {
        super.dormir();
        System.out.println(super.tipo);
        System.out.println(this.tipo);
        System.out.println("Dormiendozzzzz");
    }
}
