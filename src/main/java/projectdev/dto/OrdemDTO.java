package projectdev.dto;

import java.util.Date;
import java.util.List;

public class OrdemDTO {

    private Double somaCompras;
    private Double somaVendas;
    private Double saldo;
    //implementar Enum

    public OrdemDTO(){}

    public OrdemDTO(Double somaCompras, Double somaVendas) {
        this.somaCompras = somaCompras;
        this.somaVendas = somaVendas;
    }

    public Double getSomaCompras() {
        return somaCompras;
    }

    public void setSomaCompras(Double somaCompras) {
        this.somaCompras = somaCompras;
    }

    public Double getSomaVendas() {
        return somaVendas;
    }

    public void setSomaVendas(Double somaVendas) {
        this.somaVendas = somaVendas;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = somaCompras - somaVendas;
    }
}
