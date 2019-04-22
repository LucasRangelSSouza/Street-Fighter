public class Zeku extends Personagem {

    public Zeku(char PosicaoInicial){

        //Pontos Fixos
        setName("Zeku");
        setPower(4);
        setHealth(3) ;
        setMobility(4);
        setTechniques(5);
        setRange(4);
        setDescription("Ever-Changing Ninja");
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
                System.out.println(getName()+"  Tsurigane Otoshi ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Mikoshi ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  3 :
                System.out.println(getName()+"  Fukuro ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  4 :
                System.out.println(getName()+"  Bushinryu Shingekiko  ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  5 :
                System.out.println(getName()+"  Karura Tenzan  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  6 :
                System.out.println(getName()+"  Toushi  ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  7 :
                System.out.println(getName()+"  Nouten Wari ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  8 :
                System.out.println(getName()+"  Bushin Gram - Koku  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  9 :
                System.out.println(getName()+"  Bushin Gram - Ban  ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  10 :
                System.out.println(getName()+"  Bushin Gram - Teki  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  11 :
                System.out.println(getName()+"  Bushin Jakura  ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Bushin Gekirinchu ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Bushin Kirinkyaku ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  14 :
                System.out.println(getName()+"  Bushin Tengen ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  15 :
                System.out.println(getName()+"  Shukumyo ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  16 :
                System.out.println(getName()+"  Idaten ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  17 :
                System.out.println(getName()+"  Bushin Bakujasho ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  18 :
                System.out.println(getName()+"  Batsuzan Gaisei ");
                Lista_Parametros[2] = (getRange()* 4 );
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