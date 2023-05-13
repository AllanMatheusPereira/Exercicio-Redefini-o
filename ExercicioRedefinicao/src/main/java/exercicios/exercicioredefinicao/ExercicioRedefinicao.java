/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.exercicioredefinicao;

/**
 *
 * @author allan
 * Crie uma classe chamada Animal com um método público chamado fazerBarulho(), que imprime "O animal está fazendo barulho".
 * 
 * Crie duas subclasses dessa classe chamadas Cachorro e Gato, que redefinem o método fazerBarulho() para imprimir "O cachorro está latindo" e 
 * " O gato está miando", respectivamente.
 * 
 * Em seguida, crie um objeto de cada uma das classes e chame o método fazerBarulho() em cada objeto
 * 
 * 
 * 
 */
public class ExercicioRedefinicao {

    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerBarulho();
        animal = new Gato();
        animal.fazerBarulho();
    }
}
