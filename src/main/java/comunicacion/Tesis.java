package comunicacion;

public class Tesis extends Escrito{
    String idea;
    String[] argumentos;
    String conclusion;
    String referencias;
    String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
            String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }
    public void setIdea(String idea) {
        this.idea = idea;
    }
    public String getConclusion() {
        return conclusion;
    }
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }
    public String getReferencias() {
        return referencias;
    }
    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }
    public String interpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    @Override
    public String toString() {
        String txt = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.idea+"\n"+this.argumentos+"\n"+this.conclusion+"\n"+this.referencias;
        return txt;
    }
    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*5;
    }
}