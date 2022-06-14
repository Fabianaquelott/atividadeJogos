import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Aula {

    public static void main(String[]args) throws IOException {
            String[] todos;
            List<JogoDTO> list = new ArrayList<>();
            String aux = "";
            File arquivoCsv = new File("/Users/bi004812/Projetos - Seguro Integração/Aula - 1/src/JogosDesordenados.csv");
            try{
                String linhasDoArquivo = new String();
                Scanner leitor = new Scanner(arquivoCsv);

                while(leitor.hasNext()){
                    linhasDoArquivo = leitor.nextLine();
                    todos = linhasDoArquivo.split(",");
                        JogoDTO jogoDTO = new JogoDTO();
                        Arrays.sort(todos);
                    jogoDTO.avaliacao = todos[0];
                    jogoDTO.categoria = todos[1];
                    jogoDTO.jogo = todos[2];
                    list.add(jogoDTO);
                }

                for (int i = 0; i < list.size(); i++){
                    for(int j = 0; j < list.size(); j++){
                        

                    }
                }

            } catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
    }
}


