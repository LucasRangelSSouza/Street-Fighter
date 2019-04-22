public class Abigail extends Personagem {

    public Abigail(char PosicaoInicial){

        //Pontos Fixos
        setName("Abigail");
        setPower(5);
        setHealth(5) ;
        setMobility(1);
        setTechniques(4);
        setRange(5);
        setDescription("Superhuman Hot-Rodder");

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
                System.out.println(getName()+"  Red Leaf ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  2 :
                System.out.println(getName()+"  Hit&Run ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  3 :
                System.out.println(getName()+"  Hungabee High ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  4 :
                System.out.println(getName()+"  Hungabee Low ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  5 :
                System.out.println(getName()+"  Max Power  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  6 :
                System.out.println(getName()+"  Hybrid Charge  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  7 :
                System.out.println(getName()+"  Ontario Drop  ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  8 :
                System.out.println(getName()+"  Abi Hammer ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  9 :
                System.out.println(getName()+"  Abi Lift  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  10 :
                System.out.println(getName()+"  Abi Blaster  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  11 :
                System.out.println(getName()+"  Vroom Vroom ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  12 :
                System.out.println(getName()+"  Bang Bang ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  13 :
                System.out.println(getName()+"  Abi Twist  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  14 :
                System.out.println(getName()+"  Abigail Punch  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  15 :
                System.out.println(getName()+"  Giant Flip  ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  16 :
                System.out.println(getName()+"  Abigail Smash  ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  17 :
                System.out.println(getName()+"  Nitro Charge  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  18 :
                System.out.println(getName()+"  Drop Back ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  19 :
                System.out.println(getName()+"  Dynamite Punch ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  20 :
                System.out.println(getName()+"  Avalanche Press ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  21 :
                System.out.println(getName()+"  Bay Area Sunrise ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  22 :
                System.out.println(getName()+"  Nitro Hungabee High ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  23 :
                System.out.println(getName()+"  Nitro Hungabee Low ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  24 :
                System.out.println(getName()+"  Metro Crash ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  25 :
                System.out.println(getName()+"  Abigail Special ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 4 );
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