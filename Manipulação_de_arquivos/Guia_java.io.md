Java io
local do arquivo fica entre aspas 

File arquivo(nome da variavel) = new File(local do arquivo) 

.getAbsolutePath()//mostra o diretorio atual

.delete 
FileWriter novo_arquivo(nome da variavel) = new FileWriter(local do arquivo&tipo(txt/md/etc));

novo_arquivo.write("não é virus man");//add este texto ao arquivo

close();//fecha o arquivo e salva sua informações sem ele o arquivo fica vazio

P/craiação do arquico é necessario:

try{ //criação do arquivo
}catch (IOException e) {//isto é necessario para que realmente funcione
            e.printStackTrace();//sem o catch nn vai funcionar a craição do arquivo
        }
