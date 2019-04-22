public class Sagat extends Personagem {

    public Sagat(char PosicaoInicial){

        //Pontos Fixos
        setName("Sagat");
        setPower(4);
        setHealth(3) ;
        setMobility(2);
        setTechniques(4);
        setRange(5);
        setDescription("The King");

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
                System.out.println(getName()+"  Tiger Hang ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  2 :
                System.out.println(getName()+"  Tiger Swing ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  3 :
                System.out.println(getName()+"  Angry Charge ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  4 :
                System.out.println(getName()+"  Tiger Charge  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  5 :
                System.out.println(getName()+"  Tiger Assault  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  6 :
                System.out.println(getName()+"  Tiger Revenge  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  7 :
                System.out.println(getName()+"  Tiger Heavy Elbow ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  8 :
                System.out.println(getName()+"  Step High Kick ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  9 :
                System.out.println(getName()+"  Step Low Kick ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  10 :
                System.out.println(getName()+"  Tiger Shot  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  11 :
                System.out.println(getName()+"  Grand Tiger Shot  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  12 :
                System.out.println(getName()+"  Tiger Uppercut  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  13 :
                System.out.println(getName()+"  Tiger Knee Crush ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  14 :
                System.out.println(getName()+"  Tiger Cannon ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  15 :
                System.out.println(getName()+"  Tiger Spike ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  16 :
                System.out.println(getName()+"  Tiger Rush ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  17 :
                System.out.println(getName()+"  Tiger Rampage ");
                Lista_Parametros[2] = (getRange()* 15 );
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