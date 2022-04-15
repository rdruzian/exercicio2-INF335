package Tests;

import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnuncioBeanTest {
<<<<<<< HEAD
=======

>>>>>>> 8abb450 (Término do desenvolvimento)
    ProdutoBean prod1 = new ProdutoBean("1", "Prod 1", " Produto 1", 12.99, "Novo");
    ArrayList<String> url = new ArrayList<>();
    url.add("www.google.com.br");
    url.add("g1.com.br");
    AnuncioBean anun1 = new AnuncioBean(prod1, url, 0.1);
    @Test
    void getValorTest(){
        assertEquals(10.8, anun1.getValor());
    }
}
