
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");

        String file = scanner.nextLine();

        System.out.println("Team:");

        String team = scanner.nextLine();

        ArrayList<String> teams = new ArrayList<>();
        ArrayList<Integer> win = new ArrayList<>();
        ArrayList<Integer> loss = new ArrayList<>();

        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String string = scanner1.nextLine();

                String[] pieces = string.split(",");

                String team1 = pieces[0];
                String team2 = pieces[1];
                int points1 = Integer.parseInt(pieces[2]);
                int points2 = Integer.parseInt(pieces[3]);

                int pos1 = teams.indexOf(team1);
                if(pos1 == -1){
                    teams.add(team1);
                    win.add(0);
                    loss.add(0);
                    pos1 = teams.indexOf(team1);
                }
                int pos2 = teams.indexOf(team2);
                if(pos2 == -1){
                    teams.add(team2);
                    win.add(0);
                    loss.add(0);
                    pos2 = teams.indexOf(team2);
                }

                if(points1 > points2){
                    win.set(pos1, win.get(pos1) + 1);
                    loss.set(pos2, loss.get(pos2) + 1);
                }

                else{
                    win.set(pos2, win.get(pos2) + 1);
                    loss.set(pos1, loss.get(pos1) + 1);
                }
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        int pos = teams.indexOf(team);

        if(pos!=-1)
        {
            System.out.println("Games: "+ (win.get(pos)+loss.get(pos)));
            System.out.println("Wins: "+win.get(pos));
            System.out.println("Losses: "+loss.get(pos));
        }
        else {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }

    }

}
