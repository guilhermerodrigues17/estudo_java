package content.infoCaminhoArquivo;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String strPath = "c:\\temp\\in.txt";

        File file = new File(strPath);

        System.out.println("Nome: " + file.getName());
        System.out.println("Caminho sem nome: " + file.getParent());
        System.out.println("Caminho completo: " + file.getPath());
    }
}
