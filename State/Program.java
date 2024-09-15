/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.heullerramos.poo2024.State;

/**
 *
 * @author heull
 */
public class Program {
    public static void main(String[] args) {
        
        Estado mario = new Mario();
        
        mario = mario.pegarCogumelo();
        //mario = mario.pegarCogumelo();
        mario = mario.colidirInimigo();
        
        mario = mario.pegarEstrela();
        mario = mario.colidirInimigo();
        mario = mario.colidirInimigo();
        
    }
}
