public class ChunLi extends Personagem {

    public ChunLi(char PosicaoInicial){

        //Pontos Fixos
        setName("Chun-Li");
        setPower(2);
        setHealth(2) ;
        setMobility(4);
        setTechniques(4);
        setRange(3);
        setDescription("Blue Jade");

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
                System.out.println(getName()+"  Koshuto ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Tenshin Shushu ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  3 :
                System.out.println(getName()+"  Ryuseiraku ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  4 :
                System.out.println(getName()+"  Rankyaku  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  5 :
                System.out.println(getName()+"  Renkiko  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  6 :
                System.out.println(getName()+"  Kikosho  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  7 :
                System.out.println(getName()+"  Sohakkei  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  8 :
                System.out.println(getName()+"  Tsuitotsuken  ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  9 :
                System.out.println(getName()+"  Hakkei  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  10 :
                System.out.println(getName()+"  Senenshu  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  11 :
                System.out.println(getName()+"  Tenkukyaku  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  12 :
                System.out.println(getName()+"  Yokusenkyaku  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  13 :
                System.out.println(getName()+"  Kakurakukyaku  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  14 :
                System.out.println(getName()+"  Yosokyaku  ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  15 :
                System.out.println(getName()+"  Wall Jump ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  16 :
                System.out.println(getName()+"  Kikoken  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  17 :
                System.out.println(getName()+"  Hyakuretsukyaku  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  18 :
                System.out.println(getName()+"  Airborne Hyakuretsukyaku  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  19 :
                System.out.println(getName()+"  Spinning Bird Kick  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  20 :
                System.out.println(getName()+"  Kikosho ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 7 );
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
