public class Ibuki extends Personagem {

    public Ibuki(char PosicaoInicial){

        //Pontos Fixos
        setName("Ibuki");
        setPower(2);
        setHealth(2) ;
        setMobility(4);
        setTechniques(3);
        setRange(2);
        setDescription("Shinobi of the Summer Breeze");

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
                System.out.println(getName()+"  Yamikazura ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  2 :
                System.out.println(getName()+"  Kubiori ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  3 :
                System.out.println(getName()+"  Tobizaru ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  4 :
                System.out.println(getName()+"  Tenrai ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  5 :
                System.out.println(getName()+"  Rokushaku Horokudama (Akebono) ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  6 :
                System.out.println(getName()+"  Rokushaku Horokudama (Hizakari) ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  7 :
                System.out.println(getName()+"  Rokushaku Horokudama (Tasogare) ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  8 :
                System.out.println(getName()+"  Fuma Shuriken (Haku)  ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  9 :
                System.out.println(getName()+"  Fuma Shuriken (Kokufu)  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  10 :
                System.out.println(getName()+"  Hanagasumi  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  11 :
                System.out.println(getName()+"  Agemen ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  12 :
                System.out.println(getName()+"  Kobekudaki ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  13 :
                System.out.println(getName()+"  Sazan ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  14 :
                System.out.println(getName()+"  Bonshogeri ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  15 :
                System.out.println(getName()+"  Nobusuma ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  16 :
                System.out.println(getName()+"  Shinten ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  17 :
                System.out.println(getName()+"  Yagurakuzushi ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  18 :
                System.out.println(getName()+"  Gogasha ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  19 :
                System.out.println(getName()+"  Shakunage ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  20 :
                System.out.println(getName()+"  Sansanaki ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  21 :
                System.out.println(getName()+"  Tobikura ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  22 :
                System.out.println(getName()+"  Aoji ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  23 :
                System.out.println(getName()+"  Kasumigake ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  24 :
                System.out.println(getName()+"  Kazekiri  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  25 :
                System.out.println(getName()+"  Raida  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  26 :
                System.out.println(getName()+"  Kunai  ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  27 :
                System.out.println(getName()+"  Airborne Kunai  ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  28 :
                System.out.println(getName()+"  Kunai Ikkinage ");
                Lista_Parametros[2] = (getRange()* 17 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  29 :
                System.out.println(getName()+"  Airborne Kunai Ikkinage ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  30 :
                System.out.println(getName()+"  Kunai Hoju  ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  31 :
                System.out.println(getName()+"  Rokushaku Horokudama (Akebono) ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  32 :
                System.out.println(getName()+"  Rokushaku Horokudama (Hizakari) ");
                Lista_Parametros[2] = (getRange()* 12 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  33 :
                System.out.println(getName()+"  Rokushaku Horokudama (Tasogare) ");
                Lista_Parametros[2] = (getRange()* 13 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  34 :
                System.out.println(getName()+"  Kachofugetsu ");
                Lista_Parametros[2] = (getRange()* 23 );
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