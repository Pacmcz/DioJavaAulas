package BootCampClaro.aulas.AulaEnum;

public enum EstadoBrasileiro {

        SAO_PAULO ("SP", "SÃO PAULO", 11),
        RIO_DE_JANEIRO ("RJ", "RIO DE JANEIRO", 21),
        ALAGOAS ("AL", "ALAGOAS", 82),
        RIO_GRANDE_DO_NORTE ("RN", "RIO GRANDE DO NORTE", 84);

        private String nome;
        private String sigla;
        private int ibge;

        private EstadoBrasileiro(String sigla, String nome, int ibge) {
            this.sigla = sigla;
            this.nome = nome;
            this.ibge = ibge;
        }

        public int getIbge() {
        return ibge;
        }

        public String getSigla() {
            return sigla;
        }

        public String nome() {
            return nome;
        }

}


