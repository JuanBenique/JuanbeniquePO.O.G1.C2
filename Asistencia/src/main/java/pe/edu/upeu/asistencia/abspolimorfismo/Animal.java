package pe.edu.upeu.asistencia.abspolimorfismo;

public abstract class Animal {
    protected String tipo="xxx";
    public abstract void emitirsonido() ;

    public void dormir() {
        System.out.println("Dormiendo");
    }



}
