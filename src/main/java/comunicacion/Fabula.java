package comunicacion;

public class Fabula extends Escrito{
    String enseñanza;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }
    
    public String getEnseñanza() {
        return enseñanza;
    }
    public void setEnseñanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }
    public String interpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    @Override
    public String toString() {
        String txt = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.enseñanza;
        return txt;
    }
    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*1;
    }
}
