
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {

  @Test
  public void shouldTestGettersAndConstrutor() {

    var veiculo = new Veiculo("Preto", 1234);

    Assertions.assertEquals("Preto", veiculo.getCor());
    Assertions.assertEquals(1234, veiculo.getRenavam());
  }

  @Test
  public void shouldTestSetters() {

    var veiculo = new Veiculo("Preto", 1234);

    veiculo.setCor("Red");
    veiculo.setRenavam(4321);

    Assertions.assertEquals("Red", veiculo.getCor());
    Assertions.assertEquals(4321, veiculo.getRenavam());
  }

}