public class Blanka extends Personagem {

    public Blanka(char PosicaoInicial){

        //Pontos Fixos
        setName("Blanka");
        setPower(3);
        setHealth(3) ;
        setMobility(5);
        setTechniques(3);
        setRange(3);
        setDescription("Warrior of the Amazon");

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
                System.out.println(getName()+"  Wild Fang ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  2 :
                System.out.println(getName()+"  Jungle Wheel ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  3 :
                System.out.println(getName()+"  Coward Crouch ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  4 :
                System.out.println(getName()+"  Wild Lift ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  5 :
                System.out.println(getName()+"  Raid Jump ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  6 :
                System.out.println(getName()+"  Jungle Dynamo  ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  7 :
                System.out.println(getName()+"  Lightning Beast  ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  8 :
                System.out.println(getName()+"  Quick Rolling  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  9 :
                System.out.println(getName()+"  Rock Crusher ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  10 :
                System.out.println(getName()+"  Amazon River Run ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  11 :
                System.out.println(getName()+"  Raging Bash ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Surprise Forward ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Surprise Back ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  14 :
                System.out.println(getName()+"  Rolling Attack  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  15 :
                System.out.println(getName()+"  Back Step Rolling  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  16 :
                System.out.println(getName()+"  Vertical Rolling  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  17 :
                System.out.println(getName()+"  Wild Hunt  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  18 :
                System.out.println(getName()+"  Electric Thunder  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  19 :
                System.out.println(getName()+"  Ground Shave Rolling ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  20 :
                System.out.println(getName()+"  Rolling Cannon ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  21 :
                System.out.println(getName()+"  Dynamic Rolling ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 4 );
            default:
                System.out.println("Habilidade Inexistente");
                Lista_Parametros[2] = getRange();
                Lista_Parametros[3] = getDamage();
                break;
        }


        return Lista_Parametros;
    }
}