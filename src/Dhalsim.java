public class Dhalsim extends Personagem {

    public Dhalsim(char PosicaoInicial){

        //Pontos Fixos
        setName("Dhalsim");
        setPower(3);
        setHealth(2) ;
        setMobility(1);
        setTechniques(3);
        setRange(5);
        setDescription("Flame that Lights the Way");

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
                System.out.println(getName()+"  Yoga Rocket ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Yoga Hoop ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  3 :
                System.out.println(getName()+"  Yoga Float ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  4 :
                System.out.println(getName()+"  Yoga Float (airborne) ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  5 :
                System.out.println(getName()+"  Yoga Burner  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  6 :
                System.out.println(getName()+"  Yoga Sansara  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  7 :
                System.out.println(getName()+"  Yoga Mala  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  8 :
                System.out.println(getName()+"  Drill Kick ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  9 :
                System.out.println(getName()+"  Yoga Anvil ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  10 :
                System.out.println(getName()+"  Yoga Upper ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  11 :
                System.out.println(getName()+"  Divine Kick ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  12 :
                System.out.println(getName()+"  Thrust Kick ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Yoga Fire  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  14 :
                System.out.println(getName()+"  Yoga Flame  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  15 :
                System.out.println(getName()+"  Yoga Gale  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  16 :
                System.out.println(getName()+"  Yoga Teleport ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  17 :
                System.out.println(getName()+"  Yoga Sansara ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  18 :
                System.out.println(getName()+"  Yoga Sunburst ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  19 :
                System.out.println(getName()+"   ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  20 :
                System.out.println(getName()+"  Yoga Rocket ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  21 :
                System.out.println(getName()+"  Yoga Hoop ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  22 :
                System.out.println(getName()+"  Yoga Float ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  23 :
                System.out.println(getName()+"  Yoga Float (airborne) ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  24 :
                System.out.println(getName()+"  Yoga Burner  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  25 :
                System.out.println(getName()+"  Yoga Sansara  ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  26 :
                System.out.println(getName()+"  Yoga Mala  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  27 :
                System.out.println(getName()+"  Drill Kick ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  28 :
                System.out.println(getName()+"  Yoga Anvil ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  29 :
                System.out.println(getName()+"  Yoga Upper ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  30 :
                System.out.println(getName()+"  Divine Kick ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  31 :
                System.out.println(getName()+"  Thrust Kick ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  32 :
                System.out.println(getName()+"  Yoga Fire  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  33 :
                System.out.println(getName()+"  Yoga Flame  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  34 :
                System.out.println(getName()+"  Yoga Gale  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  35 :
                System.out.println(getName()+"  Yoga Teleport ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  36 :
                System.out.println(getName()+"  Yoga Sansara ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  37 :
                System.out.println(getName()+"  Yoga Sunburst ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 2 );
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