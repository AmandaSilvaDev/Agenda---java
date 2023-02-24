package agenda;


public class Evento {

    //atrimutos*/
    public String nomeEvento;
    public String categoria;
    public int quantPessoas;
    public String assunto;
    public int id;
    //agendamento*/
    private String dataInicio;
    private String horaInicio;
    private String horaEncerramento;
    private String local;
    
    

    public Evento(String nomeEvento1, String categoria1, int quantPessoas1, String assunto1, String dataInicio1, String horaInicio1, String horaEncerramento1, String local1, int id1) {
        System.out.println("Criando evento: "  + nomeEvento1 + "\nid: "+ id1);
        this.nomeEvento = nomeEvento1;
        this.categoria = categoria1;
        this.quantPessoas = quantPessoas1;
        this.assunto = assunto1;
        this.dataInicio = dataInicio1;
        this.horaInicio = horaInicio1;
        this.horaEncerramento = horaEncerramento1;
        this.local = local1;
        this.id = id1;
     
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public String getNomeEvento() {
        return this.nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraEncerramento() {
        return horaEncerramento;
    }

    public void setHoraEncerramento(String horaEncerramento) {
        this.horaEncerramento = horaEncerramento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
   
    
    @Override
    public String toString() {
        return "Nome do evento:" + this.getNomeEvento()
                + "\nCategoria do evento:" + this.getCategoria()
                + "\nQuantidade de Pessoas:" + this.getQuantPessoas()
                + "\nAssunto:" + this.getAssunto()
                + "\nDataInicio:" + this.getDataInicio()
                + "\nHoraInicio:" + this.getHoraInicio()
                + "\nHoraEncerramento:" + this.getHoraEncerramento()
                + "\nLocal:" + this.getLocal();
    }
  
}