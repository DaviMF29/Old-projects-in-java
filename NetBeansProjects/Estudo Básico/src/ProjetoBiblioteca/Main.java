/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoBiblioteca;

/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) {
        
        Livros livro1 = new Livros("teste", 123, "teste");
        Vendedor vendedor1 = new Vendedor(1212, "Marcos", 1345.76);
        System.out.println(livro1.preco);
        System.out.println(vendedor1.toString());
        System.out.println(vendedor1.acrescimoNoSalario(5));
        Gerente gerente1 = new Gerente(121,"Mauro",5667.87);
        System.out.println(gerente1.getNomeFuncionario());
        gerente1.setDepartamento("Vendas");
        System.out.println(gerente1.getDepartamento());
        Lista lista = new Lista();
        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereInicio(3);
        lista.insereFinal(4);
        System.out.println(lista.exibeLista());
        
        
    }
}
