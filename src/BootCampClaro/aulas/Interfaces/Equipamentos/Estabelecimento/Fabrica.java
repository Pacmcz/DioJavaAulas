package BootCampClaro.aulas.Interfaces.Equipamentos.Estabelecimento;

import BootCampClaro.aulas.Interfaces.Equipamentos.Copiadoras.Copiadora;
import BootCampClaro.aulas.Interfaces.Equipamentos.Digitalizadoras.Digitlizadora;
import BootCampClaro.aulas.Interfaces.Equipamentos.Digitalizadoras.Scanner;
import BootCampClaro.aulas.Interfaces.Equipamentos.Imporessoras.DeskJet;
import BootCampClaro.aulas.Interfaces.Equipamentos.Imporessoras.Impressora;
import BootCampClaro.aulas.Interfaces.Equipamentos.MultiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        DeskJet deskJet = new DeskJet();
        Scanner scanner = new Scanner();
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Digitlizadora Digitalizar = scanner;
        Impressora impressora = deskJet;
        Copiadora copiadora = em;

        copiadora.copiar();
        Digitalizar.Digitalizar();
        impressora.imprimir();


    }
}