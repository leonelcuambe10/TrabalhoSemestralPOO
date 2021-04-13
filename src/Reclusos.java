
import java.util.Date;
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
public class Reclusos {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String datadenascimento;
    private String sexo;
    private String estadocivil;
    private String bairro;
    private String tipodecrime;

    public Reclusos(String nome, String datadenascimento, String sexo, String estadocivil, String bairro, String tipodecrime) {
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.bairro = bairro;
        this.tipodecrime = tipodecrime;
    }
    
    

    public String getTipodecrime() {
        return tipodecrime;
    }

    public void setTipodecrime(String tipodecrime) {
        this.tipodecrime = tipodecrime;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
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
        return "Reclusos{" + "codigo=" + codigo + ", nome=" + nome +  ", datadenascimento=" + datadenascimento + ", sexo=" 
                + sexo + ", estadocivil=" + estadocivil + ",bairro=" + bairro + ", tipodecrime=" + tipodecrime + '}';
    }
    
    
    
}
