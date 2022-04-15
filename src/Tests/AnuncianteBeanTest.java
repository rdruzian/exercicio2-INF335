package Tests;


<<<<<<< HEAD
import org.junit.jupiter.api.Test;

public class AnuncianteBeanTest {
    @Test
    void removeAnuncioTest(){}

    @Test
    void addAnuncioTest(){}

    @Test
    void valorMedioAnuncioTest(){}
=======
import br.unicamp.ic.inf335.beans.AnuncianteBean;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnuncianteBeanTest {
    ArrayList<AnuncioBean> anuncios = new ArrayList<>();

    ProdutoBean prod1 = new ProdutoBean("1", "Prod 1", " Produto 1", 12.99, "Novo");
    ArrayList<String> url = new ArrayList<>();
    url.add("www.google.com.br");
    url.add("g1.com.br");
    ProdutoBean prod2 = new ProdutoBean("2", "Prod 2", " Produto 2", 112.99, "Novo");
    ProdutoBean prod3 = new ProdutoBean("3", "Prod 3", " Produto 3", 12.99, "Novo");
    AnuncioBean anun = new AnuncioBean(prod1, url, 0.1);
    anuncios.add(anun);
    anun = new AnuncioBean(prod2, url, 0.1);
    anuncios.add(anun);
    anun = new AnuncioBean(prod3, url, 0.1);
    anuncios.add(anun);

    AnuncianteBean anunciante = new AnuncianteBean("Renato", "12345678911", anuncios);

    @Test
    void valorMedioAnuncioTest(){
        assertEquals(123.29, anunciante.valorMedioAnuncios());
    }
>>>>>>> 8abb450 (Término do desenvolvimento)
}
