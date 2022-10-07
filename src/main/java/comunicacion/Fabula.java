package comunicacion;

public class Fabula extends Escrito{
    String ensenanza;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
    
    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }
    public String interpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    @Override
    public String toString() {
        String txt = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.ensenanza;
        return txt;
    }
    @Override
    public
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*1;
    }
}
