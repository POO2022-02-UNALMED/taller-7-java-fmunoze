package comunicacion;

public class Alfabeto extends Pictograma{
    String[] letras;
    String interpretacion;
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    public String[] getLetras() {
        return letras;
    }
    public String interpretacion() {
        return interpretacion;
    }
    @Override
    public String toString() {
        String txt = "";
        for(String letra : letras){
                txt += letra + ", ";
        }
        txt = txt.substring(0, txt.length() - 2);
        return txt;
    }
    public int cantidadLetras(){
        return letras.length;
    }
}
