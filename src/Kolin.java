public class Kolin extends Personagem {

    public Kolin(char PosicaoInicial){

        //Pontos Fixos
        setName("Kolin");
        setPower(4);
        setHealth(2) ;
        setMobility(5);
        setTechniques(2);
        setRange(3);
        setDescription("Phantasm of Snow and Ice");

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
                System.out.println(getName()+"  Pressure Ridge ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  2 :
                System.out.println(getName()+"  Sublimation ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  3 :
                System.out.println(getName()+"  Avalanche Lock ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  4 :
                System.out.println(getName()+"  Inside Slash  ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  5 :
                System.out.println(getName()+"  Diamond Dust  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  6 :
                System.out.println(getName()+"  Absolute Zero  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  7 :
                System.out.println(getName()+"  Third Eye  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  8 :
                System.out.println(getName()+"  Blizzard Heel ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  9 :
                System.out.println(getName()+"  Icicle Stamp ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  10 :
                System.out.println(getName()+"  Sniping Kick ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  11 :
                System.out.println(getName()+"  Frost Spike  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  12 :
                System.out.println(getName()+"  White Out  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Cold Low ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  14 :
                System.out.println(getName()+"  Brinicle  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  15 :
                System.out.println(getName()+"  Snow Grain  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  16 :
                System.out.println(getName()+"  White Spear ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  17 :
                System.out.println(getName()+"  Frost Touch (LOW)  ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  18 :
                System.out.println(getName()+"  Frost Touch (MIDDLE)  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  19 :
                System.out.println(getName()+"  Frost Touch (HIGH)  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  20 :
                System.out.println(getName()+"  Parabellum  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  21 :
                System.out.println(getName()+"  Vanity Step  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  22 :
                System.out.println(getName()+"  Silver Edge  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  23 :
                System.out.println(getName()+"  Hailstorm  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  24 :
                System.out.println(getName()+"  Diamond Dust ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  25 :
                System.out.println(getName()+"  Frost Edge ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  26 :
                System.out.println(getName()+"  Reverse Javelin ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  27 :
                System.out.println(getName()+"  Frost Tower ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 9 );
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