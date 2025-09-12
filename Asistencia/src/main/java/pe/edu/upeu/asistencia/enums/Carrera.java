package pe.edu.upeu.asistencia.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter


public enum Carrera {
    SISTEMAS(FACULTAD.FIA),
    CIVIL(FACULTAD.FIA),
    AMBIENTRAL(FACULTAD.FIA),
    ADMINISTRATIVE(FACULTAD.FCE),
    NUTRICION(FACULTAD.FCS),
    EDUCACION(FACULTAD.FACIHED),
    GENERAL(FACULTAD.GENERAL),
    ;
     private FACULTAD facultad;

     Carrera(FACULTAD facultad) {
         this.facultad = facultad;
     }

     public FACULTAD getFACULTAD() {
         return facultad;

     }

}
