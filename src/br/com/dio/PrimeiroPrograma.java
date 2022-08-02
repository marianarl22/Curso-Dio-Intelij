package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);


        livro livro1 = new livro(nome: "O problema dos 3 corpos", numPaginas: 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello word! " + (a+b));*/
}
class livro {
    private String nome;
    private String numPaginas;

     public livro {
         this.nome = nome;
         this.numPaginas = numPaginas;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}