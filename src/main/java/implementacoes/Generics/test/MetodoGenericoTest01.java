package implementacoes.Generics.test;

import java.util.List;

import implementacoes.Generics.dominio.Barco;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoLista = criarVetorComUmObjeto(new Barco("Navio"));
        System.out.println(barcoLista);
    }

    private static <T> List<T> criarVetorComUmObjeto(T t){
        return List.of(t);
    }
}
