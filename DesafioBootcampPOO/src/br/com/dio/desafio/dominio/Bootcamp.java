package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void exibirDev() {
        System.out.println("Lista Dev inscritos no Bootcamp: " + getNome());
        devsInscritos.forEach(dev -> System.out.println("Dev: " + dev.getNome()));
    }

    public void cancelarInscricao(Dev dev) {
        devsInscritos.removeIf(d -> d.equals(dev));
        System.out.println("Olá " + dev.getNome() + "! Sua matrícula no Bootcamp " + getNome() + " foi cancelada.");
    }

    public void rankingXP() {
        Set<Dev> devsOrdenadosPorXP = new TreeSet<>(devsInscritos);

        if (!devsInscritos.isEmpty()) {
            for (Dev dev : devsOrdenadosPorXP) {
                System.out.println("Dev: " + dev.getNome() + " --- XP : " + dev.getPontuacao());
            }
        } else {
            throw new RuntimeException("O Ranking ainda não há pontuações!");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
