
package io.github.heullerramos.poo2024.State;

/**
 *
 * @author heull
 */
public class MarioMorto implements Estado{

    @Override
    public Estado pegarCogumelo() {
        return this;
    }

    @Override
    public Estado pegarEstrela() {
        return this;
    }

    @Override
    public Estado colidirInimigo() {
        return this;
    }

    @Override
    public String retornarTipo() {
        return "Mario Morto";
    }
    
}
