public class Sakura extends Personagem {

    public Sakura(char PosicaoInicial){

        //Pontos Fixos
        setName("Sakura");
        setPower(3);
        setHealth(2) ;
        setMobility(3);
        setTechniques(4);
        setRange(3);
        setDescription("The Exuberant Youth");

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
                System.out.println(getName()+"  Hanakaze ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Sakura Shoulder Throw ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  3 :
                System.out.println(getName()+"  Sailor Hop ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  4 :
                System.out.println(getName()+"  Haru Kaze ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  5 :
                System.out.println(getName()+"  Sakura Otoshi ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  6 :
                System.out.println(getName()+"  Oukakyaku ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  7 :
                System.out.println(getName()+"  Kashinfu ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  8 :
                System.out.println(getName()+"  Haru Arashi  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  9 :
                System.out.println(getName()+"  Sakura Senpu  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  10 :
                System.out.println(getName()+"  Floral Spin  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  11 :
                System.out.println(getName()+"  Floral Kick ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  12 :
                System.out.println(getName()+"  Furiko Upper ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  13 :
                System.out.println(getName()+"  Chin Buster Kick ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  14 :
                System.out.println(getName()+"  Hadoken  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  15 :
                System.out.println(getName()+"  Tengyo Hadoken  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  16 :
                System.out.println(getName()+"  Shouoken  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  17 :
                System.out.println(getName()+"  Shunpukyaku  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  18 :
                System.out.println(getName()+"  Airborne Shunpukyaku  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  19 :
                System.out.println(getName()+"  Hogasho ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  20 :
                System.out.println(getName()+"  Sakura Rain ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 5 );
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