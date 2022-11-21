package historico;

public class Historico {

    private String historico;
    private int count;

    public Historico(int count, String historico) {
        this.count = count;
        this.historico = historico;
    }
    public void setHistorico(String historico){
        this.historico = historico;
    }
    public String getString() {
        return historico;
    }

    public void setCount(int count){
        this.count = count;
    }
    public int counting() {
        return count;
    }


    public String toString() {
        String results;

        results = String.format("Resultado (%d): %s", count, historico);
        return(results);
    }

}