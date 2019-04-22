public class Vega extends Personagem {

    public Vega(char PosicaoInicial){

        //Pontos Fixos
        setName("Vega");
        setPower(3);
        setHealth(2) ;
        setMobility(5);
        setTechniques(3);
        setRange(3);
        setDescription("The Sweet Whisper of Death");

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
                System.out.println(getName()+"  Rainbow Suplex ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  2 :
                System.out.println(getName()+"  Crescent Line ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  3 :
                System.out.println(getName()+"  Stardust Shot ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  4 :
                System.out.println(getName()+"  Matador Turn ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  5 :
                System.out.println(getName()+"  Bloody Kiss - Torero  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  6 :
                System.out.println(getName()+"  Bloody Kiss - Rojo  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  7 :
                System.out.println(getName()+"  Bloody Kiss - Azul  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  8 :
                System.out.println(getName()+"  Alegrias  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  9 :
                System.out.println(getName()+"  Backslash  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  10 :
                System.out.println(getName()+"  Short Backlash  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  11 :
                System.out.println(getName()+"  Mercury Shard ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  12 :
                System.out.println(getName()+"  Buster Claw ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  13 :
                System.out.println(getName()+"  Matador Flash ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  14 :
                System.out.println(getName()+"  Matador Blitz ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  15 :
                System.out.println(getName()+"  Wall Jump ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  16 :
                System.out.println(getName()+"  Flying Barcelona Attack  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  17 :
                System.out.println(getName()+"  Izuna Drop  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  18 :
                System.out.println(getName()+"  Grand Izuna Drop  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  19 :
                System.out.println(getName()+"  Crimson Terror  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  20 :
                System.out.println(getName()+"  Aurora Spin Edge  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  21 :
                System.out.println(getName()+"  Switch Claw ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  22 :
                System.out.println(getName()+"  Bloody Garden  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  23 :
                System.out.println(getName()+"  Bloody Garden Attack ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  24 :
                System.out.println(getName()+"  Bloody Garden Drop ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  25 :
                System.out.println(getName()+"  Flash Arch - Rossa ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  26 :
                System.out.println(getName()+"  Flash Arch - Granate ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  27 :
                System.out.println(getName()+"  Bloody Rain ");
                Lista_Parametros[2] = (getRange()* 6 );
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