public class Ryu extends Personagem {

    public Ryu(char PosicaoInicial){

        //Pontos Fixos
        setName("Ryu");
        setPower(3);
        setHealth(3) ;
        setMobility(3);
        setTechniques(2);
        setRange(4);
        setDescription("Eternal Wanderer");

        //Pontos Variados
        setLife(1000*(getHealth()));
        setDamage();
        setX(PosicaoInicial);
        setDefesa(false);
        setSpeed();
    }
    public Object[] AtaquesEspeciais(int Especial){

        Object[] Lista_Parametros = new Object[4];

        Lista_Parametros[0] = (int)getPosicao()[0];
        Lista_Parametros[1] = (int)getPosicao()[1];

        int Range;
        double Damage;

        switch (Especial){
            case  1 :
                System.out.println(getName()+"  Shoulder Throw ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  2 :
                System.out.println(getName()+"  Somersault Throw ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  3 :
                System.out.println(getName()+"  Minds Eye ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  4 :
                System.out.println(getName()+"  Denjin Renki  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  5 :
                System.out.println(getName()+"  Kakko Fubatsu  ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  6 :
                System.out.println(getName()+"  Hashogeki  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  7 :
                System.out.println(getName()+"  Collarbone Breaker  ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  8 :
                System.out.println(getName()+"  Solar Plexus Strike  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  9 :
                System.out.println(getName()+"  Axe Kick ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  10 :
                System.out.println(getName()+"  Jodan Nirengeki ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  11 :
                System.out.println(getName()+"  Jodan Sanrengeki  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  12 :
                System.out.println(getName()+"  Hadoken  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  13 :
                System.out.println(getName()+"  Shoryuken  ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  14 :
                System.out.println(getName()+"  Tatsumaki Senpukyaku  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  15 :
                System.out.println(getName()+"  Airborne Tatsumaki Senpukyaku ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  16 :
                System.out.println(getName()+"  Jodan Sokutou Geri  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  17 :
                System.out.println(getName()+"  Isshin ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  18 :
                System.out.println(getName()+"  Shinku Hadoken ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  19 :
                System.out.println(getName()+"  Denjin Hadoken ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            default:
                System.out.println(getName()+"Habilidade Inexistente");
                Lista_Parametros[2] = getRange();
                Lista_Parametros[3] = getDamage();
                break;
        }


        return Lista_Parametros;
    }
}
