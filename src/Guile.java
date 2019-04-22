public class Guile extends Personagem {

    public Guile(char PosicaoInicial){

        //Pontos Fixos
        setName("Guile");
        setPower(4);
        setHealth(3) ;
        setMobility(3);
        setTechniques(2);
        setRange(4);
        setDescription("Air Slasher");

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
                System.out.println(getName()+"  Dragon Suplex ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Judo Throw ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  3 :
                System.out.println(getName()+"  Flying Mare ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  4 :
                System.out.println(getName()+"  Flying Buster Chop ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  5 :
                System.out.println(getName()+"  Sonic Blade ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  6 :
                System.out.println(getName()+"  Solid Puncher  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  7 :
                System.out.println(getName()+"  Knife Edge  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  8 :
                System.out.println(getName()+"  Reverse Back Knuckle  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  9 :
                System.out.println(getName()+"  Guile High Kick ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  10 :
                System.out.println(getName()+"  Knee Bazooka ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  11 :
                System.out.println(getName()+"  Rolling Sobat ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  12 :
                System.out.println(getName()+"  Spinning Back Knuckle ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Reverse Spin Kick ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  14 :
                System.out.println(getName()+"  Burn Straight ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  15 :
                System.out.println(getName()+"  Full Bullet Magnum ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  16 :
                System.out.println(getName()+"  Tall Edge ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  17 :
                System.out.println(getName()+"  Bullet Revolver ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  18 :
                System.out.println(getName()+"  Swing Out ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  19 :
                System.out.println(getName()+"  Drake Fang ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  20 :
                System.out.println(getName()+"  Taurus Combination ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  21 :
                System.out.println(getName()+"  Faultless Move ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  22 :
                System.out.println(getName()+"  Sonic Boom  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  23 :
                System.out.println(getName()+"  Somersault Kick  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  24 :
                System.out.println(getName()+"  Sonic Cross  ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  25 :
                System.out.println(getName()+"  Sonic Break ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  26 :
                System.out.println(getName()+"  Sonic Hurricane ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  27 :
                System.out.println(getName()+"  Sonic Tempest ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 6 );
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