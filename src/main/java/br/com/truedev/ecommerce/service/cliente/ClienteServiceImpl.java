package br.com.truedev.ecommerce.service.cliente;

import br.com.truedev.ecommerce.dao.ClienteDAO;
import br.com.truedev.ecommerce.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private ClienteDAO clidao;

    @Override
    public Cliente cadastrarNovoCliente(Cliente novo) {
        return clidao.save(novo);
    }

    @Override
    public Cliente alterarCliente(Cliente cliente) {
        return clidao.save(cliente);
    }

    @Override
    public Cliente recuperarClientePeloId(Integer id) {
        return clidao.findById(id).orElse(null);
    }

    @Override
    public Cliente recuperarClientePeloTelefone(String telefone) {
        return clidao.findBytelefone(telefone);
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return (List<Cliente>) clidao.findAll();
    }
}
