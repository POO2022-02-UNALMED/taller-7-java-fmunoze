package comunicacion;

public class Periodico extends Escrito{
    String fecha;
    String primicia;
    String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
            String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getPrimicia() {
        return primicia;
    }
    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }
    public String interpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    @Override
    public String toString() {
        String txt = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.fecha+"\n"+this.primicia;
        return txt;
    }
    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*10;
    }
}
