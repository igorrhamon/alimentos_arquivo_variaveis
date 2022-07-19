package service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Arquivo;

/**
 * LerArquivo
 */
public class LerArquivo {

    Arquivo arquivo;

    public LerArquivo(String arquivoNome, String charSet) {
        this.arquivo = new Arquivo(arquivoNome, charSet);
    }

    public List<String> lerArquivo() {

        
        Path file = Paths.get(arquivo.getArquivoNome());


        try (Stream<String> lines = (Files.newBufferedReader(file, arquivo.getCharSet()).lines())) {
            
            return lines.collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Erro ao ler arquivo" + e);
        }
        return null;
    }
}