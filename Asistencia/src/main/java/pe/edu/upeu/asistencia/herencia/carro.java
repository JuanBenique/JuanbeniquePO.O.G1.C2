package pe.edu.upeu.asistencia.herencia;

public class carro extends vehiculo {
    String modelo="mustang";
    String color="red";
    String placa="fe 1283";

    void caracteristicas(){
        System.out.println("caracteristicas del carro son");
        System.out.println("modelo: "+modelo);
        System.out.println("color: "+color);
        System.out.println("placa: "+placa);
        System.out.println("marca: "+marca);
    }

    public static void main(String[] args) {
        carro carro =new carro();
        carro.caracteristicas();
        carro.sonido();

    }

}
