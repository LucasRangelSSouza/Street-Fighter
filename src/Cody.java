public class Cody extends Personagem {

    public Cody(char PosicaoInicial){

        //Pontos Fixos
        setName("Cody");
        setPower(3);
        setHealth(3) ;
        setMobility(3);
        setTechniques(5);
        setRange(3);
        setDescription("Metro City`s New Mayor");

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
                System.out.println(getName()+"  Trash Out ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  2 :
                System.out.println(getName()+"  Crime Throw ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  3 :
                System.out.println(getName()+"  Secret Work ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  4 :
                System.out.println(getName()+"  Double Kick ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  5 :
                System.out.println(getName()+"  Side Arm  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  6 :
                System.out.println(getName()+"  Dirty Coach  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  7 :
                System.out.println(getName()+"  Prison Breaker  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  8 :
                System.out.println(getName()+"  Axel Knuckle ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  9 :
                System.out.println(getName()+"  Hammer Kick ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  10 :
                System.out.println(getName()+"  Bad Spray ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  11 :
                System.out.println(getName()+"  Slip Jab ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  12 :
                System.out.println(getName()+"  Crime Blow ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  13 :
                System.out.println(getName()+"  Final Combination ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  14 :
                System.out.println(getName()+"  Final Combo Throw ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  15 :
                System.out.println(getName()+"  Air Raid Punch ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  16 :
                System.out.println(getName()+"  Air Raid Kick ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  17 :
                System.out.println(getName()+"  Crack Combination ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  18 :
                System.out.println(getName()+"  Burst Shot ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  19 :
                System.out.println(getName()+"  Zonk Knuckle  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  20 :
                System.out.println(getName()+"  Tornado Sweep  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  21 :
                System.out.println(getName()+"  Ruffian Kick  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  22 :
                System.out.println(getName()+"  Snipe Shot ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  23 :
                System.out.println(getName()+"  Anti-Air Snipe Shot ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  24 :
                System.out.println(getName()+"  Reload ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  25 :
                System.out.println(getName()+"  Rapid Fire ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  26 :
                System.out.println(getName()+"  Gentle Swing ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  27 :
                System.out.println(getName()+"  Gentle Upper Swing ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  28 :
                System.out.println(getName()+"  Bean Ball ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  29 :
                System.out.println(getName()+"  Present Delivery ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  30 :
                System.out.println(getName()+"  Unluck Gift ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  31 :
                System.out.println(getName()+"  Toss & Smash ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  32 :
                System.out.println(getName()+"  Criminal Punisher ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 7 );
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