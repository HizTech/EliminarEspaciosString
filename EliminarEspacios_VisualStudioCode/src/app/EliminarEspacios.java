package app;

public class EliminarEspacios {

    public String eliminarEspaciosMetodoIncial(String cadena){

        String newCadena="";

        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)!=' ' && cadena.charAt(i)!='\n'){
                newCadena=newCadena+cadena.charAt(i);
            }
        }

        return newCadena;
    }

    public String eliminarEspaciosMetodoSecundario(String cadena){

        StringBuilder newCadena = new StringBuilder(cadena);

        int i=0;
        while(i<newCadena.length()){
            if(cadena.charAt(i)==' ' || cadena.charAt(i)=='\n'){
                newCadena.deleteCharAt(i);
                i--;
            }
            i++;
        }
        
        return newCadena.toString();
    }


    public static void main(String[] args) throws Exception {

        EliminarEspacios principal = new EliminarEspacios();

        String cadena = " Hola Mundo \n 1";

        cadena = principal.eliminarEspaciosMetodoIncial(cadena);
        cadena = principal.eliminarEspaciosMetodoSecundario(cadena);

        System.out.println("Metodo Incial: "+cadena+ " longitud: "+cadena.length());
        System.out.println("Metodo Secundario: "+cadena+ " longitud: "+cadena.length());

        cadena = cadena.replaceAll("\\s+", "");

        System.out.println("Cadena: "+cadena+ " Longitud: "+cadena.length());


    }


}
