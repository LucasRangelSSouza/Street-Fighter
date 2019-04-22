public class Alex extends Personagem {

    public Alex(char PosicaoInicial){

        //Pontos Fixos
        setName("Alex");
        setPower(3);
        setHealth(4) ;
        setMobility(2);
        setTechniques(3);
        setRange(2);
        setDescription("Awakened Talent");

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
                System.out.println(getName()+"  Face-Crush Chop ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  2 :
                System.out.println(getName()+"  Leg Tomahawk ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  3 :
                System.out.println(getName()+"  Overhaul ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  4 :
                System.out.println(getName()+"  Rage Shift  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  5 :
                System.out.println(getName()+"  Rage Boost  ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  6 :
                System.out.println(getName()+"  Big Boot  ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  7 :
                System.out.println(getName()+"  Chop ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  8 :
                System.out.println(getName()+"  Lariat ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  9 :
                System.out.println(getName()+"  Flying Cross Chop ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  10 :
                System.out.println(getName()+"  Flash Chop  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  11 :
                System.out.println(getName()+"  Slash Elbow  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  12 :
                System.out.println(getName()+"  Air Knee Smash  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  13 :
                System.out.println(getName()+"  Power Bomb  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  14 :
                System.out.println(getName()+"  Power Drop  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  15 :
                System.out.println(getName()+"  Air Stampede  ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  16 :
                System.out.println(getName()+"  Head Crush  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  17 :
                System.out.println(getName()+"  Sledge Hammer ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  18 :
                System.out.println(getName()+"  Flyng DDT ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  19 :
                System.out.println(getName()+"  Choke Sleeper ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  20 :
                System.out.println(getName()+"  Heavy Hammer ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 8 );
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