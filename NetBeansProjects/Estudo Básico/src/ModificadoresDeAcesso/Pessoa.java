/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModificadoresDeAcesso;

/**
 *
 * @author Miguel
 */
public class Pessoa {

    private int idade = 21;
    private String nome = "";
    private String sobrenome = "";
    public int getIdade() {
        return idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome,String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }
    public String toString(){
        return "Nome:" + getNome() +"\nIdade:" + getIdade();
    }
    public String getNomeCompleto(){
        return getNome() + " "+getSobrenome();
    }
}
