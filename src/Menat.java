public class Menat extends Personagem {

    public Menat(char PosicaoInicial){

        //Pontos Fixos
        setName("Menat");
        setPower(3);
        setHealth(2) ;
        setMobility(2);
        setTechniques(3);
        setRange(5);
        setDescription("Eyes of the future");

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
                System.out.println(getName()+"  Overflowing Nile ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  2 :
                System.out.println(getName()+"  Pyramid Hopscotch ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  3 :
                System.out.println(getName()+"  Soul Reflect: Kamal ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  4 :
                System.out.println(getName()+"  Soull Reflect: Stella ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  5 :
                System.out.println(getName()+"  Wisdom Of Thoth  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  6 :
                System.out.println(getName()+"  Prophecy Of Thoth  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  7 :
                System.out.println(getName()+"  Left Eye Of The Lion  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  8 :
                System.out.println(getName()+"  Judgement Of Anubis ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  9 :
                System.out.println(getName()+"  Divine Retribution ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  10 :
                System.out.println(getName()+"  Khamun Kick ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  11 :
                System.out.println(getName()+"  Soul Sphere  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  12 :
                System.out.println(getName()+"  Soul Sphere: Ankh ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  13 :
                System.out.println(getName()+"  Soul Spark ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  14 :
                System.out.println(getName()+"  Guardian of The Sun  ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  15 :
                System.out.println(getName()+"  Judgement Of Thoth ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  16 :
                System.out.println(getName()+"  Prophecy Of Thoth ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  17 :
                System.out.println(getName()+"  The Nefertem ");
                Lista_Parametros[2] = (getRange()* 21 );
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
