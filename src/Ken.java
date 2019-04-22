public class Ken extends Personagem {

    public Ken(char PosicaoInicial){

        //Pontos Fixos
        setName("Ken");
        setPower(3);
        setHealth(3) ;
        setMobility(4);
        setTechniques(2);
        setRange(3);
        setDescription("The Fire-Breathinf Fist");

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
                System.out.println(getName()+"  Knee Bash ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  2 :
                System.out.println(getName()+"  Hell Wheel ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  3 :
                System.out.println(getName()+"  Quick Step ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  4 :
                System.out.println(getName()+"  Heat Rush  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  5 :
                System.out.println(getName()+"  Shinryuken  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  6 :
                System.out.println(getName()+"  Senpu Nataotoshi  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  7 :
                System.out.println(getName()+"  Thunder Kick ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  8 :
                System.out.println(getName()+"  Thunder Kick (feint) ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  9 :
                System.out.println(getName()+"  Inazuma Kick ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  10 :
                System.out.println(getName()+"  Chin Buster ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  11 :
                System.out.println(getName()+"  Chin Buster 2nd ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  12 :
                System.out.println(getName()+"  Lion Breaker ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  13 :
                System.out.println(getName()+"  Hadoken  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  14 :
                System.out.println(getName()+"  Shoryuken  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  15 :
                System.out.println(getName()+"  Tatsumaki Senpukyaku  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  16 :
                System.out.println(getName()+"  Airborne Tatsumaki Senpukyaku  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  17 :
                System.out.println(getName()+"  Shinryuken ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  18 :
                System.out.println(getName()+"  Guren Enjinkyaku ");
                Lista_Parametros[2] = (getRange()* 23 );
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