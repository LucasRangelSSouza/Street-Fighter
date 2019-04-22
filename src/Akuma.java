public class Akuma extends Personagem {

    public Akuma(char PosicaoInicial){

        //Pontos Fixos
        setName("Akuma");
        setPower(5);
        setHealth(3) ;
        setMobility(4);
        setTechniques(5);
        setRange(3);
        setDescription("Master of the Fist");

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
                System.out.println(getName()+"  Goshoha ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  2 :
                System.out.println(getName()+"  Shuretsuzan ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  3 :
                System.out.println(getName()+"  Rakan ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  4 :
                System.out.println(getName()+"  Rakan Gosho ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  5 :
                System.out.println(getName()+"  Rakan Gokyaku ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  6 :
                System.out.println(getName()+"  Dohatsu Shoten  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  7 :
                System.out.println(getName()+"  Shiretsu Hasshi  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  8 :
                System.out.println(getName()+"  Gosenkyaku  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  9 :
                System.out.println(getName()+"  Tenmakujinkyaku ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  10 :
                System.out.println(getName()+"  Zugaihasatsu ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  11 :
                System.out.println(getName()+"  Tenha ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  12 :
                System.out.println(getName()+"  Sekiseiken ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Kongoken ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  14 :
                System.out.println(getName()+"  Kikokurenzan ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  15 :
                System.out.println(getName()+"  Gohadoken    ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  16 :
                System.out.println(getName()+"  Sekia Goshoha  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  17 :
                System.out.println(getName()+"  Zanku Hadoken  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  18 :
                System.out.println(getName()+"  Goshoryuken    ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  19 :
                System.out.println(getName()+"  Tatsumaki Zankukyaku  ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  20 :
                System.out.println(getName()+"  Airborne Tatsumaki Zankukyaku  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  21 :
                System.out.println(getName()+"  Ashura Senku ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  22 :
                System.out.println(getName()+"  Hyakkishu  ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  23 :
                System.out.println(getName()+"  Hyakki Gozan ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  24 :
                System.out.println(getName()+"  Hyakki Gosho ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  25 :
                System.out.println(getName()+"  Hyakki Gojin ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  26 :
                System.out.println(getName()+"  Hyakki Gosai ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  27 :
                System.out.println(getName()+"  Hyakki Gozanku ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  28 :
                System.out.println(getName()+"  Hyakki Gorasen  ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  29 :
                System.out.println(getName()+"  Sekia Kuretsuha ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  30 :
                System.out.println(getName()+"  Shun Goku Satsu ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            default:
                System.out.println("Habilidade Inexistente");
                Lista_Parametros[2] = getRange();
                Lista_Parametros[3] = getDamage();
                break;
        }


        return Lista_Parametros;
    }
}