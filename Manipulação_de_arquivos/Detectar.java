import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Detectar {
    public static void main(String[]args){
        int i=0;
        File arquivo = new File("Download/file.txt");
        //def o diretorio do arquivo
        // nao encontrou msm estando no mesmo diretorio
        // testar se eu colocar o diretorio se ele vai achar
        //problema era sobre o diretorio nao especificado
        //nn precisa especificar a parte do path /storage/emulated/0 so a parte dps desta
        System.out.println("LOCAL: "+arquivo.getAbsolutePath());
        if(arquivo.exists()){
            System.out.println("arquivo existente");
            arquivo.delete();
            System.out.println("deletando arquivo...");
        }else{System.out.println("arquivo inexistente ou não foi encontrado");
            try{
                FileWriter novo_arquivo = new FileWriter("Download/file.txt");
                //cria o arquuvo
                novo_arquivo.write("não é virus man");
                novo_arquivo.close();//metodo de fechar o arquivo e salvar 
                //é necessario sair do arquivo para q o conteudo esteja nele
            }catch (IOException e) {
            e.printStackTrace();//sem o catch nn vai funcionar a craição do arquivo
        }
            System.out.println("arquivo criado...");
        }}}