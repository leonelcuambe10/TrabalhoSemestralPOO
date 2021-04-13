import javax.swing.JOptionPane;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
@Entity
public class Esquadra {
    @Id
    private int codigo;
    private String nome;
    private String bairro;

    public Esquadra(String nome, String bairro) {
        this.nome = nome;
        this.bairro = bairro;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Esquadra{" + "codigo=" + codigo + ", nome=" + nome +  ", bairro=" + bairro + '}';
    }
    
    
    
}
