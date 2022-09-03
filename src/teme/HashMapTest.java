package teme;

import java.util.*;

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner (){
        Iterator <String> it = players.keySet().iterator();
        int max = 0;
        String win = "";
        while(it.hasNext()){
            String key = it.next();
            if (players.get(key) > max) {
                max = players.get(key);
                win = key;
            }
        }
        System.out.println(win);

    }
}

public class HashMapTest {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
