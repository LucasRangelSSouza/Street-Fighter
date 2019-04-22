public class FANG extends Personagem {

    public FANG(char PosicaoInicial){

        //Pontos Fixos
        setName("F.A.N.G");
        setPower(2);
        setHealth(3) ;
        setMobility(3);
        setTechniques(3);
        setRange(5);
        setDescription("Cunning Trickster");

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
                System.out.println(getName()+"  Shimonshu ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Kyoshitsugeki ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  3 :
                System.out.println(getName()+"  Nishodoku  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  4 :
                System.out.println(getName()+"  Dokunomu  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  5 :
                System.out.println(getName()+"  Koryo Dokuda  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  6 :
                System.out.println(getName()+"  Nikaiho  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  7 :
                System.out.println(getName()+"  Senpukuga ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  8 :
                System.out.println(getName()+"  Nirenko ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  9 :
                System.out.println(getName()+"  Nishikyu  ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  10 :
                System.out.println(getName()+"  Sotoja  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  11 :
                System.out.println(getName()+"  Ryobenda  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Nikankyaku  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  13 :
                System.out.println(getName()+"  Shishiruirui ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 11 );
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