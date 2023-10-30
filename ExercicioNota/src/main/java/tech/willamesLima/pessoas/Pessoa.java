package tech.willamesLima.pessoas;

import tech.willamesLima.funcionarios.Cargo;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private Collection<Telefone> telsContato;

    public Pessoa(String nome, Date dataNascimento, Endereco endereco, Collection<Telefone> telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Date getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }

    public Collection<Telefone> getTelsContato() {

        return telsContato;
    }

    public void setTelsContato(Collection<Telefone> telsContato) {

        this.telsContato = telsContato;
    }
}