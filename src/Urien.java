public class Urien extends Personagem {

    public Urien(char PosicaoInicial){

        //Pontos Fixos
        setName("Urien");
        setPower(4);
        setHealth(4) ;
        setMobility(4);
        setTechniques(3);
        setRange(3);
        setDescription("Dominating Light");

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
                System.out.println(getName()+"  Spartan Bomb ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  2 :
                System.out.println(getName()+"  Metallic Aura ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  3 :
                System.out.println(getName()+"  Aegis Reflector  ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  4 :
                System.out.println(getName()+"  Tyrant Pressure  ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  5 :
                System.out.println(getName()+"  Anger Snap Fist  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  6 :
                System.out.println(getName()+"  Quarrel Punch ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  7 :
                System.out.println(getName()+"  Quarrel Kick ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  8 :
                System.out.println(getName()+"  Terrible Smash ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  9 :
                System.out.println(getName()+"  Killer Straight ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  10 :
                System.out.println(getName()+"  Break Rush ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  11 :
                System.out.println(getName()+"  Chariot Tackle  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  12 :
                System.out.println(getName()+"  Violence Knee Drop  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  13 :
                System.out.println(getName()+"  Dangerous Headbutt  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  14 :
                System.out.println(getName()+"  Metallic Sphere  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  15 :
                System.out.println(getName()+"  Aegis Reflector ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  16 :
                System.out.println(getName()+"  Tyrant Blaze ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  17 :
                System.out.println(getName()+"  Dominant Crush ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 10 );
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