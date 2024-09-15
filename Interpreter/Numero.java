
package io.github.heullerramos.poo2024.Interpreter;

/**
 *
 * @author heull
 */
public class Numero implements Operador{
    
    private int Numero;

    public Numero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public int interpretar() {
        return this.Numero;
    }

    
    
    
    
}
