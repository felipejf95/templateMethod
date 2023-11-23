import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipeBaseTest {

    @Test
    void deveRetornarEquipeTreinando(){
        EquipeBase equipe = new EquipeBase();
        assertEquals("Equipe da base treinando", equipe.treinarEquipe());
    }

    @Test
    void deveRetornarInfo(){
        EquipeBase equipe = new EquipeBase();
        equipe.setTreinador("Marcos");
        equipe.setEquipe("Brasil");
        assertEquals("Brasil{Treinador: Marcos Equipe da base", equipe.getInfo());
    }

}