/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoBiblioteca;

/**
 *
 * @author Miguel
 */
public class Vendedor extends Funcionarios{

    private int vendasMensal;

    public Vendedor(int id, String nomeFuncionario, double salario) {
        super(id, nomeFuncionario, salario);
        //, int vendasMensal
        //this.vendasMensal = vendasMensal;
    }

    public int getVendasMensal() {
        return vendasMensal;
    }

    public void setVendasMensal(int vendasMensal) {
        this.vendasMensal = vendasMensal;
    }
    
    public double acrescimoNoSalario(double vendas){
        return  getSalario() + ((getSalario() * (vendas/100)));
         
    }
    
    @Override
    public String toString() {
        return "Nome: " +getNomeFuncionario()+"\nId: " +getId()+ "\nSalário: " + getSalario()+
                "\nNúmero de vendas: "+ getVendasMensal();
                
    }
    
    
}
