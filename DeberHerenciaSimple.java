/*
Disene e implemente un algoritmo; de tal manera ,que le permita crear una
superclase llamada Friccion  con sus atributos coeficiente_rozamiento de tipo
double, normal de tipo double, además implemente una función para Mostrar las
Caracteristicas de la fuerza de rozamiento.
Además implemente 2 clases derivadas llamadas Rozamiento_estatico y Rozamiento_dinamico,
utilice  la palabra clave extends para crear las clases derivadas,demostrando de esta
manera el concepto de herencia, además declare el atributo llamado tipo de tipo String.
Posteriormente declare una función que le permita calcular la fuerza de rozamiento
e imprima resultados obtenidos.

 */
package deberherenciasimple;
class Friccion{
    double coeficiente_rozamiento;
    double normal;

    void MostrarCaracteristicasFuerza_rozamiento(){
        System.out.println("El valor del coeficiente de rozamiento del sólido es :"
        +coeficiente_rozamiento+
        "\nEl valor de la normal es igual al peso y tiene un valor de " +normal+ " N");

    }
}
//Herencia simple:Una subclase de Friccion es Rozamiento_estatico
class Rozamiento_estatico extends Friccion{
    String tipo;
    double CalcularFuerza_rozamiento(){
        return coeficiente_rozamiento*normal;
    }
    void MostrarTipo(){
        System.out.println("El tipo de Fuerza aplicadoa es :"+tipo);
    }
}
//Herencia simple:Una subclase de Friccion es Rozamiento_dinamico
class Rozamiento_dinamico extends Friccion{
    String tipo;
    double CalcularFuerza_rozamiento(){
        return coeficiente_rozamiento*normal;
    }
    void MostrarTipo(){
        System.out.println("El tipo de Fuerza aplicada es :"+tipo);
    }
}
public class DeberHerenciaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rozamiento_estatico rozamiento_estatico1=new Rozamiento_estatico();
        Rozamiento_dinamico rozamiento_dinamico1=new Rozamiento_dinamico();

        rozamiento_estatico1.coeficiente_rozamiento=0.3;
        rozamiento_estatico1.normal=350.0;
        rozamiento_estatico1.tipo="Fuerza Estática" ;

        rozamiento_dinamico1.coeficiente_rozamiento=0.2;
        rozamiento_dinamico1.normal=150.0;
        rozamiento_dinamico1.tipo="Fuerza Dinámica" ;

        System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("DOCENTE: ING.GUERRA LUIS");
        System.out.println("NRC: 7450");
        System.out.println("NOMBRE:");
        System.out.println(" LENIN IÑACAZA");

        System.out.println("Información para el Rozamiento Estático : ");
        rozamiento_estatico1.MostrarTipo();
        rozamiento_estatico1.MostrarCaracteristicasFuerza_rozamiento();
        System.out.println("El valor de la Fuerza de Rozamiento es : "+rozamiento_estatico1.CalcularFuerza_rozamiento()+" N");
        System.out.println();

        System.out.println("Información para el Rozamiento Dinámico : ");
        rozamiento_dinamico1.MostrarTipo();
        rozamiento_dinamico1.MostrarCaracteristicasFuerza_rozamiento();
        System.out.println("El valor de la Fuerza de Rozamiento es : "+rozamiento_dinamico1.CalcularFuerza_rozamiento()+" N");
        System.out.println();

    }

}
