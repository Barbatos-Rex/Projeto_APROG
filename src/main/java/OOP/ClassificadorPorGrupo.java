package OOP;

public class ClassificadorPorGrupo implements Classificador {
    @Override
    public void classificar(Equipa[] equipasAClassificar) {
        //Usando Insertion Sort que é geralmente mais rápido que Bubble Sort apesar de terem a mesma efeciencia:
        //Importa que esta seja a pior equipa
        Equipa melhorEquipa = new Equipa('z', "ZZZZZZZZZZZZZZZZZZZZZZZZZZZ", -1, -1, -1, -1, -1, -1);
        int indice = 0;
        for (int i = 0; i < equipasAClassificar.length; i++) {
            for (int j = i; j < equipasAClassificar.length; j++) {
                if (criterioDeClassificacao(melhorEquipa, equipasAClassificar[j])) {
                    melhorEquipa = equipasAClassificar[j];
                    indice = j;
                }
            }
            Equipa tmp = equipasAClassificar[i];
            equipasAClassificar[i] = melhorEquipa;
            equipasAClassificar[indice] = tmp;
        }
    }

    private boolean criterioDeClassificacao(Equipa melhorEquipa, Equipa equipa) {
        if (equipa.getPontuacao() == melhorEquipa.getPontuacao()) {

            if (equipa.getGolosMarcados() == melhorEquipa.getGolosMarcados()) {

                if (equipa.getGolosSofridos() == melhorEquipa.getGolosSofridos()) {

                    if (equipa.getNome().compareToIgnoreCase(melhorEquipa.getNome()) < 0) {
                        return true;
                    }
                }
                if (equipa.getGolosSofridos() < melhorEquipa.getGolosSofridos()) {
                    return true;
                }
            }
            if (equipa.getGolosMarcados() > melhorEquipa.getGolosMarcados()) {
                return true;
            }
        }

        return equipa.getPontuacao() > melhorEquipa.getPontuacao();
    }
}
