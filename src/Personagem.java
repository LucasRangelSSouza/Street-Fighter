public class Personagem {


    //Pontos Fixos
    private String Name;
    private int Power;
    private int Health ;
    private int Mobility;
    private int Techniques;
    private int Range;
    private String Description;

    //Pontos Variados
    private double Life ;
    private double Damage ;
    private boolean Defesa = false;
    private int Speed;
    private boolean Vivo=true; //Quando os pontos de Life forem menores que 0 Vivo assume false (O personagem morreu)

    //Posiçao x y na arena
    private int x;
    private int y = 10;
    // y=10 é o nivel do chao


    //Pontos Fixos Gets and Sets
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {

        if(power<0 || power >5){
            power=3;
        } else{
            Power = power;
        }

    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getMobility() {
        return Mobility;
    }

    public void setMobility(int mobility) {
        Mobility = mobility;
    }

    public int getTechniques() {
        return Techniques;
    }

    public void setTechniques(int techniques) {
        Techniques = techniques;
    }

    public int getRange() {
        return Range;
    }

    public void setRange(int range) {
        Range = range;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    //Pontos Variados Get and sets


    public boolean getVivo() {
        return Vivo;
    }


    public void setLife(double life) {

        Life = life;
    }

    public double getLife() {
        return Life;
    }

    public void RecebeDano(double Dano) {
        if(this.Defesa == true){
            Life -= (Dano - ((Dano/100.0)*(10*Techniques)));
            System.out.println(Name+" (Defesa ON) Dano Recebido: " + (Dano - ((Dano/100.0)*(10*Techniques))));
            //se  a defesa estiver ativada o dano é reduzido o percentual de 10 vezes os pontos de tecnica do personagem
            // exemplo se o personagem tem 3 de tecnica o dano é reduziddo em (10*3)% ou 30%

        }else if(this.Defesa == false){
            Life -= Dano;
            System.out.println(Name+" (Defesa OFF) Dano Recebido: "+ Dano);
            //se a defesa nao estiver ativada recebe o dano completo
        }

        if(Life <=0){
            System.out.println(this.Name + " K.O");
            System.out.println(this.Name + " Derrotado");
            Vivo = false;
            //se apos receber um dano os pontos de life estiver menor ou igual a zero o personagem é derrotado

        }

    }

    public void setDamage() {

        Damage = ((Power/100.0)*80.0)+((Techniques/100.0)*20.0);
        //o dano base causado é 80% power e 20% tecnica
    }

    public double getDamage() {

         return Damage;
    }


    public boolean getDefesa() {
        return Defesa;
    }

    public void setDefesa(boolean defesa) {
        Defesa = defesa;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed() {
        Speed =(int) ((Mobility/100.0)*80.0)+((Techniques/100)*20);

        //A velocidade é 80% Mobility e 20% tecnica
        //avelocidade influencia no movimento no espaço, correr pular e andar pra direita e esquerda
    }



    //Movimento na Arena

    public Object[] getPosicao() {
        Object[] Posicao = new Object[2];
        Posicao[0]=x;
        Posicao[1]=y;

        return Posicao;
    }

    public void printPosicao() {
        System.out.println(Name+" Position = X=" + x +" Y="+ y);

    }



    public void setX(char PosicaoaoInicial) {

        //A variavel PosicaoInicial vai receber "E" ou "D" que determina se o
        // personagem começa no canto esquerdo ou direito da tela
        if(PosicaoaoInicial=='E'){
            this.x=10;
            // se começar na esquerda começa no ponto x=10
            // (O mapa foi pensando com 100 posiçoes no eixo x) começando da esquerda no x=0 e termina na direita no x=100
        }else if(PosicaoaoInicial=='D') {
            this.x =90;
            // se começar na Direita começa no ponto x=90
        }
    }



    public void Move(char Lado){

        if (Lado=='L'){

            if((x+Speed)< 0){
                System.out.println( Name + " Já esta no limite esquerdo do mapa");
            }else if((x+Speed)>= 0){
                x =(x-Speed);
                System.out.println(Name + " Move "+Speed +" Posiçoes Para Esquerda");
            }
        } else if (Lado=='R'){

            if((x+Speed)> 100){
                System.out.println( Name + " Já esta no limite direito do mapa");
            }else if((x+Speed)<= 100){
                x =(x+Speed);
                System.out.println(Name + " Move "+Speed +" Posiçoes Para Direita");
            }
        }
    }


    public void Jump(){
        System.out.println(this.Name + " Pula");
    }

    public void Lower(){
        System.out.println(this.Name + " Abaixa");
    }

    //Ataques
    public Object[] Kick(){
        System.out.println(this.Name + " Chuta");
        Object[] Lista_Parametros = new Object[4];
        Lista_Parametros[0]=x;
        Lista_Parametros[1]=y;
        Lista_Parametros[2]=Range;
        Lista_Parametros[3]=Damage;

        return Lista_Parametros;

    }
    public Object[] Punch(){
        System.out.println(this.Name + " Soca");
        Object[] Lista_Parametros = new Object[4];
        Lista_Parametros[0]=x;
        Lista_Parametros[1]=y;
        Lista_Parametros[2]=Range;
        Lista_Parametros[3]=((Damage/100)*95);

        return Lista_Parametros;
    }


    //Sofre ataques

    //Essa funçao é bem diferente de RecebeDamage
    // Essa funçao calcula se ataque do oponente esta no raio de açao do mesmo
    //se sim o dano é causado, se nao nao existe dano
    //tambem é verificado o range e o damage do ataque do oponente

    public void RecebeAtaque( Object[] Lista_Parametros){
        int XOponente= (int)Lista_Parametros[0];
        int YOponente= (int)Lista_Parametros[1];

        int RangeOponente =(int)Lista_Parametros[2];
        double DamageOponente = (double)Lista_Parametros[3];

        double DistanciaCartesiana = Math.sqrt(((Math.pow((this.x-XOponente), 2))+ (Math.pow((this.y-YOponente), 2))));
                                    //distancia entre 2 pontos  distancia=raizQuadrada((x1-x2)^2 + (y1-y2)^2)
        if(DistanciaCartesiana<=RangeOponente){
            RecebeDano(DamageOponente);
        }else if(DistanciaCartesiana>RangeOponente){
            System.out.println("Muito longe para causar Dano");
        }

    }





}
