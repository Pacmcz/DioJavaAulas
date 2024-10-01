package BootCampClaro.aulas.Interfaces.Equipamentos.Imporessoras;

public class DeskJet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("\nImprimindo via DeskJet");
    }
}
