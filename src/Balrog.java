public class Balrog extends Personagem {

    public Balrog(char PosicaoInicial){

        //Pontos Fixos
        setName("Balrog");
        setPower(4);
        setHealth(4) ;
        setMobility(3);
        setTechniques(3);
        setRange(2);
        setDescription("Destroyer of Rules");

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
                System.out.println(getName()+"  Dirty Bomber ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  2 :
                System.out.println(getName()+"  Dirty Shot ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  3 :
                System.out.println(getName()+"  KKB ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  4 :
                System.out.println(getName()+"  Buffalo Swing ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  5 :
                System.out.println(getName()+"  Buffalo Pressure ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  6 :
                System.out.println(getName()+"  Crazy Rush  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  7 :
                System.out.println(getName()+"  No Mercy  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  8 :
                System.out.println(getName()+"  Buffalo Headbutt  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  9 :
                System.out.println(getName()+"  Hard Smasher ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  10 :
                System.out.println(getName()+"  Hard Pressure ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  11 :
                System.out.println(getName()+"  Under Impact ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  12 :
                System.out.println(getName()+"  Stomping Combo ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  13 :
                System.out.println(getName()+"  Dash Straight  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  14 :
                System.out.println(getName()+"  Dash Grand Blow  ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  15 :
                System.out.println(getName()+"  Screw Smash  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  16 :
                System.out.println(getName()+"  Turn Punch ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  17 :
                System.out.println(getName()+"  Charging Buffalo  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  18 :
                System.out.println(getName()+"  Bursting Buffalo  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  19 :
                System.out.println(getName()+"  Turn Punch ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  20 :
                System.out.println(getName()+"  B3 ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  21 :
                System.out.println(getName()+"  Gigaton Blow ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  22 :
                System.out.println(getName()+"   ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  23 :
                System.out.println(getName()+"  Dirty Bomber ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  24 :
                System.out.println(getName()+"  Dirty Shot ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  25 :
                System.out.println(getName()+"  KKB ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  26 :
                System.out.println(getName()+"  Buffalo Swing ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  27 :
                System.out.println(getName()+"  Buffalo Pressure ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  28 :
                System.out.println(getName()+"  Crazy Rush  ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  29 :
                System.out.println(getName()+"  No Mercy  ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  30 :
                System.out.println(getName()+"  Buffalo Headbutt  ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  31 :
                System.out.println(getName()+"  Hard Smasher ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  32 :
                System.out.println(getName()+"  Hard Pressure ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  33 :
                System.out.println(getName()+"  Under Impact ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  34 :
                System.out.println(getName()+"  Stomping Combo ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  35 :
                System.out.println(getName()+"  Dash Straight  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  36 :
                System.out.println(getName()+"  Dash Grand Blow  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  37 :
                System.out.println(getName()+"  Screw Smash  ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  38 :
                System.out.println(getName()+"  Turn Punch ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  39 :
                System.out.println(getName()+"  Charging Buffalo  ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  40 :
                System.out.println(getName()+"  Bursting Buffalo  ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  41 :
                System.out.println(getName()+"  Turn Punch ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  42 :
                System.out.println(getName()+"  B3 ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  43 :
                System.out.println(getName()+"  Gigaton Blow ");
                Lista_Parametros[2] = (getRange()* 3 );
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