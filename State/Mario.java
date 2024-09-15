/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.heullerramos.poo2024.State;

/**
 *
 * @author heull
 */
public class Mario implements Estado{

    @Override
    public Estado pegarCogumelo() {
        System.out.println("Pegou cogumelo : Se  tornou SuperMario");
        return new SuperMario();
    }

    @Override
    public Estado pegarEstrela() {
        System.out.println("Pegou uma estrela : Se tornou invencivel");
        return new MarioInvencivel();
    }


    @Override
    public Estado colidirInimigo() {
        System.out.println("colidiu com o inimigo : Mario Morreu");
        return new MarioMorto();
    }

    @Override
    public String retornarTipo() {
        return "Mario Comum";
    }
    
    
    
}
