import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipeProfissionalTest {

    @Test
    void deveRetornarEquipeTreinando(){
        EquipeProfissional equipe = new EquipeProfissional();
        assertEquals("Equipe profissional treinando", equipe.treinarEquipe());
    }

    @Test
    void deveRetornarInfo(){
        EquipeProfissional equipe = new EquipeProfissional();
        equipe.setTreinador("Marcos");
        equipe.setEquipe("Brasil");
        assertEquals("Brasil{Treinador: Marcos Equipe profissional", equipe.getInfo());
    }

}