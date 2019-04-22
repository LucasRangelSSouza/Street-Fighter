public class Falke extends Personagem {

    public Falke(char PosicaoInicial){

        //Pontos Fixos
        setName("Falke");
        setPower(3);
        setHealth(2) ;
        setMobility(2);
        setTechniques(4);
        setRange(4);
        setDescription("The Guardian Hawk");

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
                System.out.println(getName()+"  Wirbel Wind ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  2 :
                System.out.println(getName()+"  Luftstrom ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  3 :
                System.out.println(getName()+"  Windstoss ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  4 :
                System.out.println(getName()+"  Psycho Trombe ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  5 :
                System.out.println(getName()+"  Staerken  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  6 :
                System.out.println(getName()+"  Psycho Angriff  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  7 :
                System.out.println(getName()+"  Psycho Impulse  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  8 :
                System.out.println(getName()+"  Psycho Spitze ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  9 :
                System.out.println(getName()+"  Blaukraehe ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  10 :
                System.out.println(getName()+"  Luftjagd ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  11 :
                System.out.println(getName()+"  Psycho Kugel ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  12 :
                System.out.println(getName()+"  Psycho Kanonen ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  13 :
                System.out.println(getName()+"  Psycho Feder ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  14 :
                System.out.println(getName()+"  Psycho Schneide  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  15 :
                System.out.println(getName()+"  Katapult  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  16 :
                System.out.println(getName()+"  Psycho Schrot ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  17 :
                System.out.println(getName()+"  Psycho Panzer ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  18 :
                System.out.println(getName()+"  Psycho Jaeger ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  19 :
                System.out.println(getName()+"  Psycho Sturm ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  20 :
                System.out.println(getName()+"  Psycho Klinge ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  21 :
                System.out.println(getName()+"  Psycho Fluegel ");
                Lista_Parametros[2] = (getRange()* 29 );
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