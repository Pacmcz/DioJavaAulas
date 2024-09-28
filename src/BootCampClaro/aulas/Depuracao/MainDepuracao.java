package BootCampClaro.aulas.Depuracao;

public class MainDepuracao {
    public static void main(String[] args) {
        System.out.println("Iniciou o porgrama no método main");
        a();
        System.out.println("Finalizou o programa no método main");

}

static void a() {
        System.out.println("Iniciando o programa no método a");
        b();
    System.out.println("Finalizando o método a");
}

static void b() {
        System.out.println("Iniciando o programa no método b");
        for(int i = 0; i <=4 ; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método B");
}

static void c() {
        System.out.println("Iniciando o programa c");
        d();
        System.out.println("Finalizou o método C");
}

static void d() {
        System.out.println("Iniciando o programa D://");
        //Thread.dumpStack();
        System.out.println("Finalizou D://");
}
}

