public class FuncoesAuxiliares {
    //Funçoes auxiliares

    public int getDistancia(Object[]Lutador1,Object[]Lutador2){

        int x1=(int)Lutador1[0];
        int x2=(int)Lutador2[0];
        int y1=(int)Lutador1[1];
        int y2=(int)Lutador2[1];

        return (int) Math.sqrt(((Math.pow((x1-x2), 2))+ (Math.pow((y1-y2), 2))));
        //distancia entre 2 pontos  distancia=raizQuadrada((x1-x2)^2 + (y1-y2)^2)

    }

}
