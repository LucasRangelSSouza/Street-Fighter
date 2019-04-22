public class Karin extends Personagem {

    public Karin(char PosicaoInicial){

        //Pontos Fixos
        setName("Karin");
        setPower(3);
        setHealth(2) ;
        setMobility(4);
        setTechniques(5);
        setRange(2);
        setDescription("Perfect Victor");

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
                System.out.println(getName()+"  Hajotsui ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  2 :
                System.out.println(getName()+"  Arakuma Inashi ");
                Lista_Parametros[2] = (getRange()* 10 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  3 :
                System.out.println(getName()+"  Meioken ");
                Lista_Parametros[2] = (getRange()* 5 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  4 :
                System.out.println(getName()+"  Kanzuki-Ryu Guren No Kata  ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  5 :
                System.out.println(getName()+"  Tenha No Kata  ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  6 :
                System.out.println(getName()+"  Ressencho  ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  7 :
                System.out.println(getName()+"  Tsumujigari ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  8 :
                System.out.println(getName()+"  Ku-Renge ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  9 :
                System.out.println(getName()+"  Kanzuki-Ryu Hokojutsu Seppo  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  10 :
                System.out.println(getName()+"  Tenko  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  11 :
                System.out.println(getName()+"  Orochi  ");
                Lista_Parametros[2] = (getRange()* 6 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  12 :
                System.out.println(getName()+"  Mujinkyaku  ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  13 :
                System.out.println(getName()+"  Ressenha  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  14 :
                System.out.println(getName()+"  Senha Kusabi ");
                Lista_Parametros[2] = (getRange()* 16 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  15 :
                System.out.println(getName()+"  Senha Resshu ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  16 :
                System.out.println(getName()+"  Guren Ken ");
                Lista_Parametros[2] = (getRange()* 27 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  17 :
                System.out.println(getName()+"  Guren Hosho ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  18 :
                System.out.println(getName()+"  Guren Senha ");
                Lista_Parametros[2] = (getRange()* 23 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  19 :
                System.out.println(getName()+"  Guren Chochu ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  20 :
                System.out.println(getName()+"  Guren Hochu ");
                Lista_Parametros[2] = (getRange()* 28 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  21 :
                System.out.println(getName()+"  Guren Resshu ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  22 :
                System.out.println(getName()+"  Guren Kusabi ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  23 :
                System.out.println(getName()+"  Guren Kyoho ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  24 :
                System.out.println(getName()+"  Yasha Gaeshi Tenchi ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  25 :
                System.out.println(getName()+"  Kanzuki-Ryu Hadorokushiki Hasha No Kata ");
                Lista_Parametros[2] = (getRange()* 18 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  26 :
                System.out.println(getName()+"   ");
                Lista_Parametros[2] = (getRange()* 21 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  27 :
                System.out.println(getName()+"  Hajotsui ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  28 :
                System.out.println(getName()+"  Arakuma Inashi ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  29 :
                System.out.println(getName()+"  Meioken ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  30 :
                System.out.println(getName()+"  Kanzuki-Ryu Guren No Kata  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  31 :
                System.out.println(getName()+"  Tenha No Kata  ");
                Lista_Parametros[2] = (getRange()* 26 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  32 :
                System.out.println(getName()+"  Ressencho  ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  33 :
                System.out.println(getName()+"  Tsumujigari ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  34 :
                System.out.println(getName()+"  Ku-Renge ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 7 );
                break;
            case  35 :
                System.out.println(getName()+"  Kanzuki-Ryu Hokojutsu Seppo  ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 2 );
                break;
            case  36 :
                System.out.println(getName()+"  Tenko  ");
                Lista_Parametros[2] = (getRange()* 2 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  37 :
                System.out.println(getName()+"  Orochi  ");
                Lista_Parametros[2] = (getRange()* 29 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  38 :
                System.out.println(getName()+"  Mujinkyaku  ");
                Lista_Parametros[2] = (getRange()* 7 );
                Lista_Parametros[3] = (getDamage()* 3 );
                break;
            case  39 :
                System.out.println(getName()+"  Ressenha  ");
                Lista_Parametros[2] = (getRange()* 19 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  40 :
                System.out.println(getName()+"  Senha Kusabi ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  41 :
                System.out.println(getName()+"  Senha Resshu ");
                Lista_Parametros[2] = (getRange()* 25 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  42 :
                System.out.println(getName()+"  Guren Ken ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  43 :
                System.out.println(getName()+"  Guren Hosho ");
                Lista_Parametros[2] = (getRange()* 20 );
                Lista_Parametros[3] = (getDamage()* 10 );
                break;
            case  44 :
                System.out.println(getName()+"  Guren Senha ");
                Lista_Parametros[2] = (getRange()* 22 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  45 :
                System.out.println(getName()+"  Guren Chochu ");
                Lista_Parametros[2] = (getRange()* 24 );
                Lista_Parametros[3] = (getDamage()* 9 );
                break;
            case  46 :
                System.out.println(getName()+"  Guren Hochu ");
                Lista_Parametros[2] = (getRange()* 3 );
                Lista_Parametros[3] = (getDamage()* 6 );
                break;
            case  47 :
                System.out.println(getName()+"  Guren Resshu ");
                Lista_Parametros[2] = (getRange()* 8 );
                Lista_Parametros[3] = (getDamage()* 8 );
                break;
            case  48 :
                System.out.println(getName()+"  Guren Kusabi ");
                Lista_Parametros[2] = (getRange()* 11 );
                Lista_Parametros[3] = (getDamage()* 4 );
                break;
            case  49 :
                System.out.println(getName()+"  Guren Kyoho ");
                Lista_Parametros[2] = (getRange()* 14 );
                Lista_Parametros[3] = (getDamage()* 5 );
                break;
            case  50 :
                System.out.println(getName()+"  Yasha Gaeshi Tenchi ");
                Lista_Parametros[2] = (getRange()* 15 );
                Lista_Parametros[3] = (getDamage()* 11 );
                break;
            case  51 :
                System.out.println(getName()+"  Kanzuki-Ryu Hadorokushiki Hasha No Kata ");
                Lista_Parametros[2] = (getRange()* 28 );
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