/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModificadoresDeAcesso;

/**
 *
 * @author Miguel
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Davi","Miguel",18);
        p1.setIdade(20);
        System.out.println(p1.getIdade());
        System.out.println(p1.getNomeCompleto());
    }
}
