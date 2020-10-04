package OOP;

public class Grupo {
    private final Equipa[] grupo;
    private int equipasNoGrupo;

    public Grupo() {
        grupo = new Equipa[4];
        equipasNoGrupo = 0;
    }

    public boolean adicionarEquipa(Equipa e) {
        if (equipasNoGrupo < 4) {
            grupo[equipasNoGrupo] = e;
            equipasNoGrupo++;
            return true;
        } else {
            return false;
        }
    }

    public void atribuirClassificacao() {

    }
}
