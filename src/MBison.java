public class MBison extends Personagem {
    public MBison(char  PosicaoInicial){

        //Pontos Fixos
        setName("M.Bison");
        setPower(5);
        setHealth(3) ;
        setMobility(4);
        setTechniques(4);
        setRange(3);
        setDescription("Emperor of Evil");

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
                System.out.println(getName()+"  Psycho Impact ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  2 :
                System.out.println(getName()+"  Psycho Fall ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  3 :
                System.out.println(getName()+"  Psycho Reflect* ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  4 :
                System.out.println(getName()+"  Psycho Punishment ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  5 :
                System.out.println(getName()+"  Psycho Power  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  6 :
                System.out.println(getName()+"  Psycho Nightmare  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  7 :
                System.out.println(getName()+"  Psycho Burst  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  8 :
                System.out.println(getName()+"  Hell Attack ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  9 :
                System.out.println(getName()+"  Psycho Axe ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  10 :
                System.out.println(getName()+"  Shadow Axe ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  11 :
                System.out.println(getName()+"  Psycho Blast  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  12 :
                System.out.println(getName()+"  Double Knee Press  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  13 :
                System.out.println(getName()+"  Head Press  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  14 :
                System.out.println(getName()+"  Somersault Skull Diver ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  15 :
                System.out.println(getName()+"  Devil Reverse  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  16 :
                System.out.println(getName()+"  Psycho Inferno  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  17 :
                System.out.println(getName()+"  Psycho Charge ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  18 :
                System.out.println(getName()+"  Psycho Judgement ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  19 :
                System.out.println(getName()+"  Psycho Crusher ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  20 :
                System.out.println(getName()+"  Ultimate Psycho Crusher ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            default:
                System.out.println(getName()+"Habilidade Inexistente");
                Lista_Parametros[2] = getRange();
                Lista_Parametros[3] = getDamage();
        }


        return Lista_Parametros;
    }

}