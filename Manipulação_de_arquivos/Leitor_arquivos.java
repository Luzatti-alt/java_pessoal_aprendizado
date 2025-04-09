import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Leitor_arquivos {
    public static void main(String[]args){
        try{
            FileReader leitor = new FileReader("Download/file.txt");
            int data = leitor.read();//le o primeiro char do arquivo
            //se der -1 não há mais nada a ler
            while(data!=-1){
                System.out.print((char)data);//le char por char
                data =leitor.read();//leu so que leu por linha
            }
            leitor.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
