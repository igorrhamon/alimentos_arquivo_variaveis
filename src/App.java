import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.Alimento;
import model.Desperdicio;
import service.AddAlimento;
import service.LerArquivo;
import service.VisualizaAlimento;

public class App {
    public static void main(String[] args) throws Exception {
        


        List<Alimento> alimentos = new ArrayList<Alimento>();
        LerArquivo lerArquivo = new LerArquivo("variaveis.txt", "UTF-8");
        List<String> lines = lerArquivo.lerArquivo();
        AddAlimento addAlimento = new AddAlimento(alimentos);
        addAlimento.addAlimento(lines);
        
        VisualizaAlimento visualizaAlimento = new VisualizaAlimento(alimentos);
        visualizaAlimento.visualizaAlimento();

        
        
        

        

    }
}
