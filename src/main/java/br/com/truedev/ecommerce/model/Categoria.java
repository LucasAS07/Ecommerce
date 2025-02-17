package br.com.truedev.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_categoria")
public class Categoria {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_categoria", length = 50, nullable = false)
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
