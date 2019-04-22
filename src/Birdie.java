public class Birdie extends Personagem {

    public Birdie(char PosicaoInicial){

        //Pontos Fixos
        setName("Birdie");
        setPower(4);
        setHealth(4) ;
        setMobility(1);
        setTechniques(3);
        setRange(4);
        setDescription("Headbutt Happy Glutton");

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
                System.out.println(getName()+"  Bad Skull ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  2 :
                System.out.println(getName()+"  Bad Chain ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  3 :
                System.out.println(getName()+"  Break Time  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  4 :
                System.out.println(getName()+"  Banana Time ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  5 :
                System.out.println(getName()+"  Drink Time ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  6 :
                System.out.println(getName()+"  Enjoy Time  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  7 :
                System.out.println(getName()+"  Birdie Time  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  8 :
                System.out.println(getName()+"  Pepper Pot  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  9 :
                System.out.println(getName()+"  Bull Drop ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  10 :
                System.out.println(getName()+"  Bull Charge ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  11 :
                System.out.println(getName()+"  Bull Slider ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  12 :
                System.out.println(getName()+"  Bad Hammer ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  13 :
                System.out.println(getName()+"  Bull Head  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  14 :
                System.out.println(getName()+"  Bull Horn  ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  15 :
                System.out.println(getName()+"  Hanging Chain  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  16 :
                System.out.println(getName()+"  Killing Head  ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  17 :
                System.out.println(getName()+"  Bull Revenger  ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  18 :
                System.out.println(getName()+"  Bull Swing ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  19 :
                System.out.println(getName()+"  Bull Capture ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  20 :
                System.out.println(getName()+"  Skip To My Chain ");
                Lista_Parametros[2] = (getRange()* 25 );
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