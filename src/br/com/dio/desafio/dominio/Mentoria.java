package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n\n" + "Mentoria " + getTitulo() +
                "\nDescrição = '" + getDescricao() + '\'' +
                "\nData = " + data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

    @Override
    public double calculaXp() {
        return XP_PADRAO * 20d;
    }
}
