public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smarTv = new SmartTv();
        System.out.println("Volume Atual: " + smarTv.volume);
        System.out.println("Canal atual : " + smarTv.canal);
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        smarTv.mudarCanal(13);
        System.out.println("Tv Ligada? : " + smarTv.ligada);
        System.out.println("Canal atual : " + smarTv.canal);
        System.out.println("Volume Atual: " + smarTv.volume);



        smarTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? : " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? : " + smarTv.ligada);
    }
}
