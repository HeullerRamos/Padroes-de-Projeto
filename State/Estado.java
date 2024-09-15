/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.heullerramos.poo2024.State;

/**
 *
 * @author heull
 */
public interface Estado {
    public Estado pegarCogumelo();
    
    public Estado pegarEstrela();
    
    public Estado colidirInimigo();
    
    public String retornarTipo();
    
    
}
