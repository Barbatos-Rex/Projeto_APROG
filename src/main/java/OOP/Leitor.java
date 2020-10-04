package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitor {
    private final String caminhoDoFicheiro;

    public Leitor(String caminhoDoFicheiro) {
        this.caminhoDoFicheiro = caminhoDoFicheiro;
    }

    public Equipa[] lerEquipas() throws FileNotFoundException {
        Equipa[] equipas = new Equipa[32];
        Scanner sc = new Scanner(new File(caminhoDoFicheiro));
        int pos = 0;
        //Assumindo que o ficheiro não terá erros nem equipas repetidas nem que excedo o número de equipas que um campeonáto tradicional teria:
        while (sc.hasNext()) {
            String linha = sc.next();
            String[] conteudo = linha.split(",");
            equipas[pos] = new Equipa(conteudo[0].charAt(0), conteudo[1], Integer.parseInt(conteudo[2]), Integer.parseInt(conteudo[3]), Integer.parseInt(conteudo[4]), Integer.parseInt(conteudo[5]), Integer.parseInt(conteudo[6]), Integer.parseInt(conteudo[7]));
            Equipa.adicionarEquipa();
            pos++;
        }
        sc.close();
        return equipas;
    }

    public Equipa consolaParaEquipa(String linha) {
        //Acreditando que será introduzido informação correta:
        String[] conteudo = linha.split(",");
        return new Equipa(conteudo[0].charAt(0), conteudo[1], Integer.parseInt(conteudo[2]), Integer.parseInt(conteudo[3]), Integer.parseInt(conteudo[4]), Integer.parseInt(conteudo[5]), Integer.parseInt(conteudo[6]), Integer.parseInt(conteudo[7]));
        //Caso não seja:
//        try{
//            String[] conteudo = linha.split(",");
//            return new Equipa(conteudo[0].charAt(0),conteudo[1],Integer.parseInt(conteudo[2]),Integer.parseInt(conteudo[3]),Integer.parseInt(conteudo[4]),Integer.parseInt(conteudo[5]),Integer.parseInt(conteudo[6]),Integer.parseInt(conteudo[7]));
//        }catch (Exception e){
//            return null;
//        }
    }
}
