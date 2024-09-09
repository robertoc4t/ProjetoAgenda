import java.io.*;
import java.util.HashMap;

public class GravadorDeDados {

    private static final String ARQUIVOCONTATOS = "contatos.dat";


    public HashMap<String, Contato> recuperarContat()throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVOCONTATOS))) {
            return (HashMap<String, Contato>) in.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Arquivo .dat não encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void salvarContatos(HashMap<String, Contato> contatos) throws IOException{
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVOCONTATOS))){
            out.writeObject(contatos);
        } catch(IOException e){
            throw new IOException(e);
        }

     }


}

