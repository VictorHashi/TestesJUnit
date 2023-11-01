package sqlGenerator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteGerador {

    @Test
    void colunasNomeTipo() {
        Gerador gerador = new Gerador("Nome", "String", false, false);
        assertEquals("Nome String,", gerador.gerar());
    }

    @Test
    void colunasNomeTipoNotnull() {
        Gerador gerador = new Gerador("Nome", "String", true, false);
        assertEquals("Nome String NOT NULL,", gerador.gerar());
    }

    @Test
    void colunasNomeTipoAutoincrement() {
        Gerador gerador = new Gerador("Nome", "String", false, true);
        assertEquals("Nome String AUTO INCREMENT,", gerador.gerar());
    }

    @Test
    void colunasNomeTipoNotnullAutoincrement() {
        Gerador gerador = new Gerador("Nome", "String", true, true);
        assertEquals("Nome String NOT NULL AUTO INCREMENT,", gerador.gerar());
    }

}