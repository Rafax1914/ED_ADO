/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author marcos.vsalexandre
 */
public class Elemento {
    private Elemento esq, dir, r;
    private int n;
    
    public Elemento(int n){
        this.n=n;
    }

    public Elemento getEsq() {
        return esq;
    }

    public void setEsq(Elemento esq) {
        this.esq = esq;
    }

    public Elemento getDir() {
        return dir;
    }

    public void setDir(Elemento dir) {
        this.dir = dir;
    }

    public Elemento getR() {
        return r;
    }

    public void setR(Elemento r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
        
}
