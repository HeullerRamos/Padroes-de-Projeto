
package io.github.heullerramos.poo2024.Interpreter;

/**
 *
 * @author heull
 */
public class Program {
    public static void main(String[] args) {
        Operador somar = new Somar(new Numero(1), new Numero(4));
        System.out.println(somar.interpretar());
        
        Operador subtrair = new Subtrair(somar,new Numero(2));
        System.out.println(subtrair.interpretar());
        
        Operador mult = new Multiplicar(subtrair,somar);
        System.out.println(mult.interpretar());
        
        Operador div = new Dividir(new Numero(30),mult);
        System.out.println(div.interpretar());
        
    }
}
