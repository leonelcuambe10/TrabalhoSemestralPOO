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
public class Familiar {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String contacto;
    private String bairro;
    private String grauparentesco;

    public Familiar(String nome, String contacto, String bairro, String grauparentesco) {
        this.nome = nome;
        this.contacto = contacto;
        this.bairro = bairro;
        this.grauparentesco = grauparentesco;
    }
    
    

    public String getGrauparentesco() {
        return grauparentesco;
    }

    public void setGrauparentesco(String grauparentesco) {
        this.grauparentesco = grauparentesco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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
         return "Familiar{" + "codigo=" + codigo + ", nome=" + nome +  ", contacto=" + contacto + ", bairro=" + bairro + ", grauparentesco=" + grauparentesco + '}';
    }
    
   
}
