package Domain;

public class Competion {

    private String data;
    private String  tipoCompeticao;

    private String adversario;

    private int golosNossos;

    private int golosAdversario;


    public Competion(String data, String tipoCompeticao, String adversario, int golosNossos, int golosAdversario) {
        this.data = data;
        this.tipoCompeticao = tipoCompeticao;
        this.adversario = adversario;
        this.golosNossos = golosNossos;
        this.golosAdversario = golosAdversario;
    }

    public String getData() {
        return data;
    }

    public String getTipoCompeticao() {
        return tipoCompeticao;
    }

    public String getAdversario() {
        return adversario;
    }

    public int getGolosNossos() {
        return golosNossos;
    }

    public int getGolosAdversario() {
        return golosAdversario;
    }

    @Override
    public String toString() {
        return "data : " + data + "\n : " + tipoCompeticao + "\n : " + adversario + "\n : " + golosNossos + "\n : " + golosAdversario;
    }



}
