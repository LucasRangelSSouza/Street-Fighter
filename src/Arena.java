import java.util.Scanner;
public class Arena {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        ScriptBatalhas var_Batalhas = new ScriptBatalhas();
        System.out.println("Street Fighter - Tabajara industries Version");
        System.out.println("Ryu\\t \\t\tChunLi\\t \\tNash\\t \\tM.Bison\\t \\tCammy\\nBirdie\\t \\tKen\\t \\t\tNecalli\\t \\tVega\\t \\tRMika\\nRashid\\t \\tKarin\\t \\tZangief\\t \\tLaura\\t \\tSagat\\nDhalsim\\t \\tFANG\\t \\tAlex\\t \\tGuile\\t \\tIbuki\\nBalrog\\t \\tJuri\\t \\tUrien\\t \\tAkuma\\t \\tKolin\\nED\\t \\t\tAbigail\\t \\tMenat\\t \\tZeku\\t \\tSakura\\nBlanka\\t \\tFalke\\t \\tCody\\t \\tG\\t \\t");
        System.out.println("Digite o Nome do Player 1 (Escreva o nome de acordo com a lista acima)");
        String Player1 = sc.next();
        System.out.println("Digite o Nome do Player 2 (Tambem de acordo com a lista acima)");
        String Player2 = sc.next();

        System.out.println(Player1+" Vs "+Player2);


        var_Batalhas.Battles(Player1+" Vs "+Player2);

    }

}
