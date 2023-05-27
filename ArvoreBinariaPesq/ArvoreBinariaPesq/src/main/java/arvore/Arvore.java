package arvore;

/**
 *
 * @author marcos.vsalexandre
 */
public class Arvore {

    private Elemento raiz, atual;

    public Elemento getRaiz() {
        return raiz;
    }

    public void inserir(int n) {
        if (raiz == null) {
            raiz = new Elemento(n);

        } else {
            atual = new Elemento(n);
            inserir(atual, raiz);
        }
    }

    public void inserir(Elemento atual, Elemento e) {
        if (atual.getN() >= e.getN()) {
            if (e.getDir() == null) {
                e.setDir(atual);
                atual.setR(e);
            } else {
                inserir(atual, e.getDir());
            }
        } else {
            if (e.getEsq() == null) {
                e.setEsq(atual);
                atual.setR(e);
            } else {
                inserir(atual, e.getEsq());
            }
        }
    }

    public void ordem(Elemento e) {
        if (e != null) {
            ordem(e.getEsq());
            System.out.println(e.getN());
            ordem(e.getDir());
        }
    }

    public void posOrdem(Elemento e) {
        if (e != null) {
            posOrdem(e.getEsq());
            posOrdem(e.getDir());
            System.out.println(e.getN());
        }
    }

    public void preOrdem(Elemento e) {
        if (e != null) {
            System.out.println(e.getN());
            preOrdem(e.getEsq());
            preOrdem(e.getDir());
        }

    }

    public Elemento pesquisar(Elemento e, int n) {
        if (e != null) {
            if (n == e.getN()) {
                return e;
            } else if (n >= e.getN()) {
                return pesquisar(e.getDir(), n);
            } else {
                return pesquisar(e.getEsq(), n);
            }
        }
        return null;
    }

    public Elemento getMaior(Elemento e) {
        if (e.getDir() != null) {
            return getMaior(e.getDir());
        }
        return e;
    }

    public int grau(Elemento e, int n) {
        Elemento pesq = pesquisar(e, n);

        if (pesq != null) {
            if (pesq.getDir() == null && pesq.getEsq() == null) {
                return 0;

            }

            if (pesq.getDir() != null && pesq.getEsq()!= null) {
                return 2;
            } else {
                return 1;
            }
        }
        return -1;
    }
   
    
    public void remover(Elemento e, int n) {
        Elemento pesq = pesquisar(e, n);
        if (pesq != null) {
            if (grau(e, n) == 0) {
                if (pesq.getR().getDir() == pesq) {
                    pesq.getR().setDir(null);
                    pesq.setR(null);
                } else {
                    pesq.getR().setEsq(null);
                    pesq.setR(null);
                }
            } else if (grau(e, n) == 1) {
                if (pesq.getDir() != null) {
                    pesq.setN(pesq.getDir().getN());
                    remover(pesq.getDir(), pesq.getDir().getN());
                } else {
                    pesq.setN(pesq.getEsq().getN());
                    remover(pesq.getEsq(), pesq.getEsq().getN());
                }
            }

        } else {
            Elemento maior = getMaior(pesq.getEsq());
            pesq.setN(maior.getN());
            remover(pesq.getEsq(), maior.getN());
        }
    }
}
