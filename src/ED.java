public class ED extends Personagem {

    public ED(char PosicaoInicial){

        //Pontos Fixos
        setName("ED");
        setPower(3);
        setHealth(3) ;
        setMobility(4);
        setTechniques(3);
        setRange(3);
        setDescription("Young Commander");

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
                System.out.println(getName()+"  Psycho Blow ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Cheat & Smash ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  3 :
                System.out.println(getName()+"  Psycho Snatcher - Ground ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  4 :
                System.out.println(getName()+"  Psycho Snatcher - Air ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  5 :
                System.out.println(getName()+"  Psycho Cannon  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  6 :
                System.out.println(getName()+"  Enhanced Snatcher  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  7 :
                System.out.println(getName()+"  Kill Step  ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  8 :
                System.out.println(getName()+"  Psycho Spark ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  9 :
                System.out.println(getName()+"  Psycho Shot  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  10 :
                System.out.println(getName()+"  Psycho Knuckle ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  11 :
                System.out.println(getName()+"  Psycho Upper  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Psycho Flicker ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  13 :
                System.out.println(getName()+"  Psycho Rising ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  14 :
                System.out.println(getName()+"  Psycho Splash  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  15 :
                System.out.println(getName()+"  Ultra Snatcher - Ground ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  16 :
                System.out.println(getName()+"  Ultra Snatcher - Air ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  17 :
                System.out.println(getName()+"  Psycho Barrage ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 3 );
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