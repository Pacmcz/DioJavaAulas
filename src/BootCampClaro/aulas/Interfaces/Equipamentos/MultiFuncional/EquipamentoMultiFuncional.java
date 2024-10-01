package BootCampClaro.aulas.Interfaces.Equipamentos.MultiFuncional;

import BootCampClaro.aulas.Interfaces.Equipamentos.Copiadoras.Copiadora;
import BootCampClaro.aulas.Interfaces.Equipamentos.Digitalizadoras.Digitlizadora;
import BootCampClaro.aulas.Interfaces.Equipamentos.Imporessoras.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitlizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("\nCopiando via equipamento multifuncional");
    }

    @Override
    public void Digitalizar() {
        System.out.println("\nDigitalizando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("\nImprimindo via equipamento multifuncional");
    }
}


