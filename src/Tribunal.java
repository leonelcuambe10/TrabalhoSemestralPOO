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
public class Tribunal {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String bairro;
    private String provincia;

    public Tribunal(String nome, String bairro, String provincia) {
        this.nome = nome;
        this.bairro = bairro;
        this.provincia = provincia;
    }
    

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
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
        return "Tribunal{" + "codigo=" + codigo + ", nome=" + nome +  ", bairro=" + bairro + ", provincia=" + provincia + '}';
    }
    
           

}
