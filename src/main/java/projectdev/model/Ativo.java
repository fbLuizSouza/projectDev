package projectdev.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Ativo {

    @Column(nullable = false, length = 100)
    @Id
    @NotEmpty(message = "Campo não pode ser vazio, campo obrigatório!")
    private String codigo;
    private Double preco;

    public Ativo(){}

    public Ativo(String codigo, Double preco) {

        this.codigo = codigo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
