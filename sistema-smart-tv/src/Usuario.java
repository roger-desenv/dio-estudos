public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);



        System.out.println("TV Ligada :" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        }
       
    }
