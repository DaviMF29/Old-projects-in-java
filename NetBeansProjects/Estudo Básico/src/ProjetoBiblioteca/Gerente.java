/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoBiblioteca;

/**
 *
 * @author Miguel
 */
public class Gerente extends Funcionarios{

    private String departamento;
    
    public Gerente(int id, String nomeFuncionario, double salario) {
        super(id, nomeFuncionario, salario);
        //this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void adcionarDepartamento(String departamento){
        setDepartamento(departamento);   
    }
    public String saberDepartamento(){
       return getDepartamento();
    }

    @Override
    public String toString() {
        return "Gerente" + getNomeFuncionario() + "departamento=" + departamento;
    }
    
}
