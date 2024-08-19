package br.com.truedev.ecommerce.service.produto;

import br.com.truedev.ecommerce.dao.ProdutoDAO;
import br.com.truedev.ecommerce.model.Categoria;
import br.com.truedev.ecommerce.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoSeviceImpl implements IProdutoService{

    @Autowired
    private ProdutoDAO dao;

    @Override
    public Produto cadastrarNovo(Produto novo) {
        return dao.save(novo);
    }

    @Override
    public Produto alterarProduto(Produto produto) {
        return dao.save(produto);
    }

    @Override
    public List<Produto> recuperarTodos() {
        return dao.findByOrderByNomeAsc();
    }

    @Override
    public List<Produto> recuperarPorPalavreaChave(String palavraChave) {
        return dao.findByNomeContaining(palavraChave);
    }

    @Override
    public Produto buscarPeloID(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public List<Produto> buscarPorCategoria(Categoria categoria) {
        return dao.findByCategoriasContaining(categoria);
    }


}
