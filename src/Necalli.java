public class Necalli extends Personagem {

    public Necalli(char PosicaoInicial){

        //Pontos Fixos
        setName("Necalli");
        setPower(5);
        setHealth(4) ;
        setMobility(4);
        setTechniques(2);
        setRange(3);
        setDescription("Soul Consuming Darkness");

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
                System.out.println(getName()+"  Soul Sealer ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  2 :
                System.out.println(getName()+"  Soul Discriminator ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  3 :
                System.out.println(getName()+"  Culminated Power   ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  4 :
                System.out.println(getName()+"  Torrent of Power  ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  5 :
                System.out.println(getName()+"  Eruption Of Power  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  6 :
                System.out.println(getName()+"  The Calling  ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  7 :
                System.out.println(getName()+"  Opening Dagger   ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  8 :
                System.out.println(getName()+"  Road of the Sun ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  9 :
                System.out.println(getName()+"  Sacrificial Altar   ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  10 :
                System.out.println(getName()+"  The Disc Guidance    ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  11 :
                System.out.println(getName()+"  Raging Light    ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Mask of Tlalli    ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  13 :
                System.out.println(getName()+"  Valiant Rebellion    ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  14 :
                System.out.println(getName()+"  Clouded Mirror ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  15 :
                System.out.println(getName()+"  Heart Of Gold ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  16 :
                System.out.println(getName()+"  Ceremony of Honor ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  17 :
                System.out.println(getName()+"  Soul Offering ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 9 );
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