public class Cammy extends Personagem {

    public Cammy(char PosicaoInicial){

        //Pontos Fixos
        setName("Cammy");
        setPower(3);
        setHealth(2) ;
        setMobility(5);
        setTechniques(2);
        setRange(3);
        setDescription("Techniques of Incomparable Precision");

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
                System.out.println(getName()+"  Gyro Clipper ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  2 :
                System.out.println(getName()+"  Delta Through ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  3 :
                System.out.println(getName()+"  Neck Spiral ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  4 :
                System.out.println(getName()+"  Axel Spin Knuckle ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  5 :
                System.out.println(getName()+"  Delta Drive  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  6 :
                System.out.println(getName()+"  Delta Ambush  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  7 :
                System.out.println(getName()+"  Delta Step  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  8 :
                System.out.println(getName()+"  Strike Back  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  9 :
                System.out.println(getName()+"  Knee Bullet ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  10 :
                System.out.println(getName()+"  Lift Upper ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  11 :
                System.out.println(getName()+"  Lift Combination ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  12 :
                System.out.println(getName()+"  Spiral Arrow  ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  13 :
                System.out.println(getName()+"  Cannon Spike  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  14 :
                System.out.println(getName()+"  Cannon Strike  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  15 :
                System.out.println(getName()+"  Hooligan Combination  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  16 :
                System.out.println(getName()+"  Lazer Edge Slicer ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  17 :
                System.out.println(getName()+"  Fatal Leg Twister ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  18 :
                System.out.println(getName()+"  Cross Scissors Pressure ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  19 :
                System.out.println(getName()+"  Cannon Strike  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  20 :
                System.out.println(getName()+"  Delta Ambush ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  21 :
                System.out.println(getName()+"  Delta Twist ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  22 :
                System.out.println(getName()+"  Reverse Edge ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  23 :
                System.out.println(getName()+"  Delta Step ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  24 :
                System.out.println(getName()+"  Cross Stinger Assault ");
                Lista_Parametros[2] = (getRange()* 19 );
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