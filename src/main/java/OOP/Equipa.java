package OOP;

import java.util.Objects;

public final class Equipa {
    private static int numeroDeEquipas;
    //Grupo,Equipa,Jogos,Vitorias,Empates,Derrotas,GolosMarcados,GolosSofridos
    private final char grupo;
    private final String nome;
    private final int jogos;
    private final int vitorias;
    private final int empates;
    private final int derrotas;
    private final int golosMarcados;
    private final int golosSofridos;
    private final int pontuacao;
    private int classificacao;

    public Equipa(char grupo, String nome, int jogos, int vitorias, int empates, int derrotas, int golosMarcados, int golosSofridos) {
        this.grupo = grupo;
        this.nome = nome;
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golosMarcados = golosMarcados;
        this.golosSofridos = golosSofridos;
        pontuacao = vitorias * 3 + empates;
    }

    public static void adicionarEquipa() {
        numeroDeEquipas++;
    }

    public static void removerEquipa() {
        numeroDeEquipas--;
    }

    public static int getNumeroDeEquipas() {
        return numeroDeEquipas;
    }

    public char getGrupo() {
        return grupo;
    }

    public String getNome() {
        return nome;
    }

    public int getJogos() {
        return jogos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getGolosMarcados() {
        return golosMarcados;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipa)) return false;
        Equipa equipa = (Equipa) o;
        return nome.equals(equipa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%d,%d,%d,%d,%d", grupo, nome, jogos, vitorias, empates, derrotas, golosMarcados, golosSofridos);
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setClassificacao(int pos) {
        classificacao = pos;
    }
}
