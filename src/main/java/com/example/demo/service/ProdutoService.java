package com.example.demo.service;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto criar(Produto p) {
        return repository.save(p);
    }

    // --- NOVO MÉTODO ADICIONADO AQUI ---
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}