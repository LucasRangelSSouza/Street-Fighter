public class ScriptBatalhas {

    public void Battles(String Luta){
        FuncoesAuxiliares Auxiliares = new FuncoesAuxiliares() ;
        switch (Luta){
            case "Ryu Vs M.Bison":
                MBison var_MBison = new MBison('D');
                Ryu var_Ryu = new Ryu('E');

                System.out.println("---------------- M.Bison ----------------");
                System.out.println("M. Bison Power :" + var_MBison.getPower());
                System.out.println("M. Bison Health :" + var_MBison.getHealth());
                System.out.println("M. Bison Mobility :" + var_MBison.getMobility());
                System.out.println("M. Bison Techniques :" + var_MBison.getTechniques());
                System.out.println("M. Bison Range :" + var_MBison.getRange());
                System.out.println("M. Bison Descriçao :" + var_MBison.getDescription());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                System.out.println("M. Bison base Damage :" + var_MBison.getDamage());
                System.out.println("M. Bison Speed: "+var_MBison.getSpeed());

                System.out.println("---------------- Ryu ----------------");
                System.out.println("Ryu Power :" + var_Ryu.getPower());
                System.out.println("Ryu Health :" + var_Ryu.getHealth());
                System.out.println("Ryu Mobility :" + var_Ryu.getMobility());
                System.out.println("Ryu Techniques :" + var_Ryu.getTechniques());
                System.out.println("Ryu Range :" + var_Ryu.getRange());
                System.out.println("Ryu Descriçao :" + var_Ryu.getDescription());
                System.out.println("Ryu Life Bar :" + var_Ryu.getLife());
                System.out.println("Ryu base Damage :" + var_Ryu.getDamage());
                System.out.println("Ryu Speed: "+var_Ryu.getSpeed());



                System.out.println("-------------- Ryu ataca M. Bison com Soco (Fora de Alcance)--------------");
                var_MBison.RecebeAtaque(var_Ryu.Punch());
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                System.out.println("-------------- Ryu ataca M. Bison com Chute (Fora de Alcance)--------------");
                var_MBison.RecebeAtaque(var_Ryu.Kick());
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());


                System.out.println("-------------- M. Bison ataca Ryu Com Soco (Fora de Alcance) --------------");
                var_Ryu.RecebeAtaque(var_MBison.Punch());
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());


                System.out.println("-------------- M. Bison ataca Ryu Com Chute (Fora de Alcance) --------------");
                var_Ryu.RecebeAtaque(var_MBison.Kick());
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());


                System.out.println("-------------- Ryu ataca M. Bison com Soco (Fora de Alcance) (Que se defende)--------------");
                var_MBison.setDefesa(true);
                var_MBison.RecebeAtaque(var_Ryu.Punch());
                var_MBison.setDefesa(false);
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                System.out.println("-------------- Ryu ataca M. Bison com Chute (Fora de Alcance) (Que se defende)--------------");
                var_MBison.setDefesa(true);
                var_MBison.RecebeAtaque(var_Ryu.Kick());
                var_MBison.setDefesa(false);
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());


                System.out.println("-------------- M. Bison ataca Ryu Com Soco (Fora de Alcance) (Que se defende) --------------");
                var_Ryu.setDefesa(true);
                var_Ryu.RecebeAtaque(var_MBison.Punch());
                var_Ryu.setDefesa(false);
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());


                System.out.println("-------------- M. Bison ataca Ryu Com Chute (Fora de Alcance) (Que se defende) --------------");
                var_Ryu.setDefesa(true);
                var_Ryu.RecebeAtaque(var_MBison.Kick());
                var_Ryu.setDefesa(false);
                System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                System.out.println("M. Bison Life Bar :" + var_MBison.getLife());


                System.out.println("-------------- M. Bison e Ryu se movem ate ficarem proximos o suficiente para ataques basicos  --------------");

                while ((Auxiliares.getDistancia(var_Ryu.getPosicao(),var_MBison.getPosicao()))>=4){


                    var_MBison.printPosicao();
                    var_MBison.Move('L');
                    var_Ryu.printPosicao();
                    var_Ryu.Move('R');
                    System.out.println("--------------------------------------------------------------------");


                }
                System.out.println("Estao a "+Auxiliares.getDistancia(var_Ryu.getPosicao(),var_MBison.getPosicao())+" Unidades de distancia");
                var_Ryu.printPosicao();
                var_MBison.printPosicao();

                while ((var_MBison.getVivo()) || (var_Ryu.getVivo())){
                    System.out.println("-------------- Ryu ataca M. Bison com Soco --------------");
                    var_MBison.RecebeAtaque(var_Ryu.Punch());
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Chute --------------");
                    var_MBison.RecebeAtaque(var_Ryu.Kick());
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- M. Bison ataca Ryu Com Soco  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.Punch());
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- M. Bison ataca Ryu Com Chute  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.Kick());
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Soco  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.Punch());
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Chute  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais(18));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- M. Bison ataca Ryu Com Soco  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.Punch());
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- M. Bison ataca Ryu Com Chute  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.Kick());
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- M. Bison ataca Ryu Com Especial  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais(1));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());

                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Impact  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 1 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Shoulder Throw  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 1 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Impact  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 1 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Shoulder Throw  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 1 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Fall  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 2 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Somersault Throw  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 2 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Fall  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 2 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Somersault Throw  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 2 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Reflect*  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 3 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Minds Eye  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 3 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Reflect*  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 3 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Minds Eye  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 3 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Punishment  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 4 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Denjin Renki   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 4 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Punishment  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 4 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Denjin Renki   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 4 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Power   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 5 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Kakko Fubatsu   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 5 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Power   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 5 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Kakko Fubatsu   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 5 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Nightmare   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 6 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Hashogeki   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 6 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Nightmare   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 6 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Hashogeki   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 6 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Burst   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 7 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Collarbone Breaker   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 7 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Burst   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 7 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Collarbone Breaker   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 7 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Hell Attack  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 8 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Solar Plexus Strike   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 8 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Hell Attack  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 8 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Solar Plexus Strike   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 8 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Axe  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 9 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Axe Kick  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 9 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Axe  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 9 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Axe Kick  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 9 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Shadow Axe  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 10 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Jodan Nirengeki  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 10 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Shadow Axe  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 10 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Jodan Nirengeki  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 10 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Blast   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 11 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Jodan Sanrengeki   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 11 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Blast   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 11 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Jodan Sanrengeki   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 11 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Double Knee Press   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 12 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Hadoken   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 12 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Double Knee Press   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 12 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Hadoken   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 12 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Head Press   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 13 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Shoryuken   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 13 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Head Press   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 13 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Shoryuken   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 13 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Somersault Skull Diver  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 14 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Tatsumaki Senpukyaku   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 14 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Somersault Skull Diver  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 14 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Tatsumaki Senpukyaku   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 14 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Devil Reverse   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 15 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Airborne Tatsumaki Senpukyaku  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 15 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Devil Reverse   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 15 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Airborne Tatsumaki Senpukyaku  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 15 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Inferno   --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 16 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Jodan Sokutou Geri   --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 16 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Inferno   (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 16 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Jodan Sokutou Geri   (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 16 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Charge  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 17 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Isshin  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 17 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Charge  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 17 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Isshin  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 17 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Judgement  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 18 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Shinku Hadoken  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 18 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Judgement  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 18 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Shinku Hadoken  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 18 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com Especial  Psycho Crusher  --------------");
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 19 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com Especial  Denjin Hadoken  --------------");
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 18 ));
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- MBison ataca Ryu Com especial  Psycho Crusher  (Que se defende) --------------");
                    var_Ryu.setDefesa(true);
                    var_Ryu.RecebeAtaque(var_MBison.AtaquesEspeciais( 19 ));
                    var_Ryu.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                    System.out.println("-------------- Ryu ataca M. Bison com especial  Denjin Hadoken  (Que se defende)--------------");
                    var_MBison.setDefesa(true);
                    var_MBison.RecebeAtaque(var_Ryu.AtaquesEspeciais( 18 ));
                    var_MBison.setDefesa(false);
                    System.out.println("Ryu Life Bar: " + var_Ryu.getLife());
                    System.out.println("M. Bison Life Bar :" + var_MBison.getLife());
                    if(!(var_MBison.getVivo()) || !(var_Ryu.getVivo())) {  break;  }

                }

                break;
            default:
                System.out.println("Deu ruim");
                break;
        }

    }
}
