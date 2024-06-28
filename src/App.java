import controller.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import models.Pessoa;

public class App {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private String walterJr = "";


    public void LeitorPessoas(){
        String line = "";
        // String message = "";
            try (BufferedReader reader = new BufferedReader(new FileReader("Pessoas.csv"))) {
                while((line = reader.readLine()) !=null ){
                    // message += "Reading Line!";
                    // System.out.println(line);
                    String[] arei = line.split(";");
                    int id; id = Integer.parseInt(arei[0]);
                    String nome = arei[1];
                    Pessoa pessoa = new Pessoa(id, nome);
                    getPessoas().add(pessoa);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    };



    public void LeitorEnderecos(){
        String line = "";
        // String message = "";



// EU VOUME MATAR NA SUA FRENTE( importante lembra do (id - 1) para puxar o array corretamente )



            try (BufferedReader reader = new BufferedReader(new FileReader("Endereços.csv"))) {
                while((line = reader.readLine()) !=null ){
                    // message += "Reading Line!";
                    // System.out.println(line);
                    String[] arei = line.split(";");
                    int id; id = Integer.parseInt(arei[0]);
                    String rua = arei[1];
                    String cidade = arei[2];
                    getPessoas().get(id - 1).setRua(rua);
                    getPessoas().get(id - 1).setCidade(cidade);
                    // walterJr += getPessoas().get(id).toCSV();
                    setWalterJr(getPessoas().get(id - 1).toCSV());
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    };


    public void Walter(){
            try (BufferedWriter walter = new BufferedWriter(new FileWriter("Pinkman.csv"))) {
                walter.write(getWalterJr());
            }
            catch (IOException e) {
                // e.printStackTrace(o);
            }
    }

    public App(){};

//-----------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) throws Exception {
        App app = new App();
        Controle chamar = new Controle();
        chamar.teste2();
        app.LeitorPessoas();
        app.LeitorEnderecos();
        app.Walter();
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }



    public String getWalterJr() {
        return walterJr;
    }

    public void setWalterJr(String walterJr) {
        this.walterJr += walterJr;
    }
}
