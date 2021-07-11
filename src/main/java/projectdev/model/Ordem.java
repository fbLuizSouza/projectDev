package projectdev.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Ordem {

    private final String compra = "Compra";
    private final String venda = "Venda";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "codigo_ativo")
    private String codAtivo;

    private int tipo;

    private int quantidade;

    private double valor;

    private LocalDate data;

    public Ordem(){}

    public Ordem(String codAtivo, int tipo, int quantidade, double valor, LocalDate data) {
        this.codAtivo = codAtivo;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.valor = valor;
        this.data = data;
    }

    public String getCodAtivo() {
        return codAtivo;
    }

    public void setCodAtivo(String codAtivo) {
        this.codAtivo = codAtivo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String tipo = "";
        if(this.tipo == 1){
            tipo = "Compra";
        }
        return tipo + " " + quantidade + "unid."
                + this.codAtivo + " R$: " + this.valor;
    }
}
