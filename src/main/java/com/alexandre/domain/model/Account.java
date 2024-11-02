package com.alexandre.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id // Indica que este campo é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O valor do id será gerado automaticamente pelo banco de dados, usando a estratégia de identidade.
    private String id;

    @Column(unique = true) // O campo 'number' deve ser armazenado em uma coluna única, não permitindo duplicatas.
    private String number;

    private String agency; // Campo para armazenar o número da agência, sem restrições adicionais.

    @Column(scale = 13, precision = 2) // O campo 'balance' será armazenado com 13 dígitos no total, sendo 2 deles após a vírgula decimal.
    private BigDecimal balance;

    @Column(name = "additional_limit", scale = 2, precision = 13) // O campo 'limit' também terá 13 dígitos no total, com 2 após a vírgula decimal, representando um limite financeiro.
    private BigDecimal limit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
