/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cliente;

import arvore.Arvore;

/**
 *
 * @author marcos.vsalexandre
 */
public class ArvoreBinariaPesq {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        arvore.inserir(61);
        arvore.inserir(26);
        arvore.inserir(21);
        arvore.inserir(37);
        arvore.inserir(53);
        arvore.inserir(60);
        arvore.inserir(47);
        arvore.inserir(90);
        arvore.inserir(89);
        arvore.inserir(74);
        arvore.inserir(86);
        
        
        if(arvore.pesquisar(arvore.getRaiz(), 91)){
            System.out.println("Achou");
        }else{
            System.out.println("Nao achou");
        }
            
        arvore.ordem(arvore.getRaiz());
        
        System.out.println("------//-------//-------");
        
        arvore.posOrdem(arvore.getRaiz());
        
        System.out.println("------//-------//-------");
        
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("----//------//--------");
         
        arvore.pesquisar(arvore.getRaiz(), 90);
        
        System.out.println(arvore.getMaior(arvore.getRaiz()));
        System.out.println(arvore.getMenor(arvore.getRaiz()));
    }
}
