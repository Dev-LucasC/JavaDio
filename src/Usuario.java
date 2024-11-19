public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Canal Atual ? " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status - Tv Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status - Tv Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual ? " + smartTv.volume);


    }
}