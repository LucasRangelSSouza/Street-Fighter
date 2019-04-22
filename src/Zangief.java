public class Zangief extends Personagem {

    public Zangief(char PosicaoInicial){

        //Pontos Fixos
        setName("Zangief");
        setPower(5);
        setHealth(5) ;
        setMobility(1);
        setTechniques(2);
        setRange(3);
        setDescription("Iron Cyclone");

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
                System.out.println(getName()+"  Atomic Drop ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  2 :
                System.out.println(getName()+"  Captured ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  3 :
                System.out.println(getName()+"  Horosho Chokeslam ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  4 :
                System.out.println(getName()+"  Iron Muscle  ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  5 :
                System.out.println(getName()+"  Cyclone Lariat  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  6 :
                System.out.println(getName()+"  Cossacck Muscle  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  7 :
                System.out.println(getName()+"  Muscle Explosion  ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  8 :
                System.out.println(getName()+"  Head Butt ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  9 :
                System.out.println(getName()+"  Knee Hammer ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  10 :
                System.out.println(getName()+"  Flying Body Press ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  11 :
                System.out.println(getName()+"  Flying Head Butt ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  12 :
                System.out.println(getName()+"  Screw Pile Driver  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  13 :
                System.out.println(getName()+"  Double Lariat  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  14 :
                System.out.println(getName()+"  Siberian Express  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  15 :
                System.out.println(getName()+"  Borscht Dynamite  ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  16 :
                System.out.println(getName()+"  Cyclone Lariat ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  17 :
                System.out.println(getName()+"  Tundra Storm ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  18 :
                System.out.println(getName()+"  Bolshoi Russian Suplex ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  19 :
                System.out.println(getName()+"   ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  20 :
                System.out.println(getName()+"  Atomic Drop ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  21 :
                System.out.println(getName()+"  Captured ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  22 :
                System.out.println(getName()+"  Horosho Chokeslam ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  23 :
                System.out.println(getName()+"  Iron Muscle  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  24 :
                System.out.println(getName()+"  Cyclone Lariat  ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  25 :
                System.out.println(getName()+"  Cossacck Muscle  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  26 :
                System.out.println(getName()+"  Muscle Explosion  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  27 :
                System.out.println(getName()+"  Head Butt ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  28 :
                System.out.println(getName()+"  Knee Hammer ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  29 :
                System.out.println(getName()+"  Flying Body Press ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  30 :
                System.out.println(getName()+"  Flying Head Butt ");
                Lista_Parametros[2] = (getRange()* 4 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  31 :
                System.out.println(getName()+"  Screw Pile Driver  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  32 :
                System.out.println(getName()+"  Double Lariat  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  33 :
                System.out.println(getName()+"  Siberian Express  ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  34 :
                System.out.println(getName()+"  Borscht Dynamite  ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  35 :
                System.out.println(getName()+"  Cyclone Lariat ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  36 :
                System.out.println(getName()+"  Tundra Storm ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  37 :
                System.out.println(getName()+"  Bolshoi Russian Suplex ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 5 );
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