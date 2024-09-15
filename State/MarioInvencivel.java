/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.heullerramos.poo2024.State;

/**
 *
 * @author heull
 */
public class MarioInvencivel implements Estado{

    @Override
    public Estado pegarCogumelo() {
        System.out.println("Comue Cogumelo : Continua invencivel");
        return this;
    }

    @Override
    public Estado pegarEstrela() {
        System.out.println("Pegou Estrela, Continua invencivel");
        return this;
    }

    @Override
    public Estado colidirInimigo() {
        System.out.println("Colidiu com o inimigo : inimigo eliminado");
        return this;
    }

    @Override
    public String retornarTipo() {
        return "mario invencivel";
    }
    
    
}
