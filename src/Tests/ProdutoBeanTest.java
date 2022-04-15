package Tests;

import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoBeanTest {
    ProdutoBean prod1 = new ProdutoBean("1", "Prod 1", " Produto 1", 12.99, "Novo");
    ProdutoBean prod2 = new ProdutoBean("2", "Prod 2", " Produto 2", 112.99, "Novo");
    ProdutoBean prod3 = new ProdutoBean("3", "Prod 3", " Produto 3", 12.99, "Novo");

    @Test
    void compareToTest(){
        assertEquals(-1, prod1.compareTo(prod2));
        assertEquals(1, prod2.compareTo(prod1));
        assertEquals(0, prod1.compareTo(prod3));
    }
}
