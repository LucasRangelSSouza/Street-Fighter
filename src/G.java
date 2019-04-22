public class G extends Personagem {

    public G(char PosicaoInicial){

        //Pontos Fixos
        setName("G");
        setPower(3);
        setHealth(3) ;
        setMobility(3);
        setTechniques(5);
        setRange(4);
        setDescription("Man of Mystery");

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
                System.out.println(getName()+"  Violence President ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  2 :
                System.out.println(getName()+"  Shining President ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  3 :
                System.out.println(getName()+"  Destroy President ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  4 :
                System.out.println(getName()+"  G Barrier  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  5 :
                System.out.println(getName()+"  Airborne G Barrier  ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  6 :
                System.out.println(getName()+"  Maximum President  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  7 :
                System.out.println(getName()+"  Dangerous President  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  8 :
                System.out.println(getName()+"  G Revenge  ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  9 :
                System.out.println(getName()+"  Wild President ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  10 :
                System.out.println(getName()+"  Strong President ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  11 :
                System.out.println(getName()+"  Crash President ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Flying President ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  13 :
                System.out.println(getName()+"  Message To The People ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  14 :
                System.out.println(getName()+"  G Smash Over  ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  15 :
                System.out.println(getName()+"  G Smash Under  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  16 :
                System.out.println(getName()+"  G Burst  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  17 :
                System.out.println(getName()+"  G Spin Kick  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  18 :
                System.out.println(getName()+"  G Impact  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  19 :
                System.out.println(getName()+"  G Charge ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  20 :
                System.out.println(getName()+"  G Charge (Cancel) ");
                Lista_Parametros[2] = (getRange()* 9 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  21 :
                System.out.println(getName()+"  G Explosion ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  22 :
                System.out.println(getName()+"  G Rage ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  23 :
                System.out.println(getName()+"  Pangaea Burst ");
                Lista_Parametros[2] = (getRange()* 26 );
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