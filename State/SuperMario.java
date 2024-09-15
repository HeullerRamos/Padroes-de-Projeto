/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.heullerramos.poo2024.State;

/**
 *
 * @author heull
 */
public class SuperMario implements Estado{

    @Override
    public Estado pegarCogumelo() {
        System.out.println("Pegou cogumelo : Ganhou 1000 pontos");
        return this;
    }

    @Override
    public Estado pegarEstrela() {
        System.out.println("Pegou uma estrela : Se tornou invencivel");
        return new MarioInvencivel();
    }

    @Override
    public Estado colidirInimigo() {
        System.out.println("Colidiu com o inimigo : Se tornou Mario");
        return new Mario();
    }

    @Override
    public String retornarTipo() {
        return "Super Mario";
    }
    
    
    
}
