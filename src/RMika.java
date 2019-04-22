public class RMika extends Personagem {

    public RMika(char PosicaoInicial){

        //Pontos Fixos
        setName("R. Mika");
        setPower(3);
        setHealth(3) ;
        setMobility(2);
        setTechniques(4);
        setRange(1);
        setDescription("7 Colored Bomber");

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
                System.out.println(getName()+"  Daydream Headlock ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  2 :
                System.out.println(getName()+"  Sell Down ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  3 :
                System.out.println(getName()+"  Dream Driver ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  4 :
                System.out.println(getName()+"  Mic Performance ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  5 :
                System.out.println(getName()+"  Nadeshiko (above)  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  6 :
                System.out.println(getName()+"  Nadeshiko (front)  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  7 :
                System.out.println(getName()+"  Nadeshiko (behind)  ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  8 :
                System.out.println(getName()+"  Steel Chair  ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  9 :
                System.out.println(getName()+"  Fightin Dirty  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  10 :
                System.out.println(getName()+"  Peach Gator  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  11 :
                System.out.println(getName()+"  Stomp Chop ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Dive Bomb ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Lady Mika ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  14 :
                System.out.println(getName()+"  Passion Press ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  15 :
                System.out.println(getName()+"  Passion Rope Throw (forward) ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  16 :
                System.out.println(getName()+"  Passion Rope Throw (backward) ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  17 :
                System.out.println(getName()+"  Shooting Star Combo ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  18 :
                System.out.println(getName()+"  Shooting Peach  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  19 :
                System.out.println(getName()+"  Wingless Airplane  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  20 :
                System.out.println(getName()+"  Rainbow Typhoon  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  21 :
                System.out.println(getName()+"  Brimstone  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  22 :
                System.out.println(getName()+"  Steel Chair ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  23 :
                System.out.println(getName()+"  Fightin Dirty ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  24 :
                System.out.println(getName()+"  Peach Assault ");
                Lista_Parametros[2] = (getRange()* 25 );
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