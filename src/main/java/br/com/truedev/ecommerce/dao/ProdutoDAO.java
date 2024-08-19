package br.com.truedev.ecommerce.dao;

import br.com.truedev.ecommerce.model.Categoria;
import br.com.truedev.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoDAO extends JpaRepository<Produto, Integer> {

    public List<Produto> findByNomeContaining(String palavra);
    public List<Produto> findByOrderByNomeAsc();
    public List<Produto> findByCategoriasContaining(Categoria categoria);
}
