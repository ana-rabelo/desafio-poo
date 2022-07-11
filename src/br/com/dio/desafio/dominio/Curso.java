package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int carga) {
        super(titulo, descricao);
        cargaHoraria = carga;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return  "\n\n" + "Curso " + getTitulo() +
                "\nDescrição = '" + getDescricao() + '\'' +
                "\nCarga Horária = " + cargaHoraria +
                " horas";
    }


    @Override
    public double calculaXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
