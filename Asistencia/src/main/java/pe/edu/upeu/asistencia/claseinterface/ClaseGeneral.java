package pe.edu.upeu.asistencia.claseinterface;

public class ClaseGeneral {
    public static void main(String[]args){
        Animal a, b;
        a=new loro();
        a.emitirsonido();
        a.dormir();

        b=new perro();
        b.emitirsonido();
        b.dormir();

    }
}
