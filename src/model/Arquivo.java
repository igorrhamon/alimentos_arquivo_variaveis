package model;
import java.nio.charset.Charset;

public class Arquivo {
    private String arquivoNome;
    private Charset charSet;


    public Arquivo(String arquivoNome, String charSet) {
        this.arquivoNome = arquivoNome;
        this.charSet =  Charset.forName(charSet);
    }


    public String getArquivoNome() {
        return arquivoNome;
    }


    public Charset getCharSet() {
        return charSet;
    }
}
