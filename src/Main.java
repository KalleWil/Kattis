import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String B = scan.next();
        int sum = 0;
        HashMap<String, Integer> dominant = new HashMap<String, Integer>();
        HashMap<String, Integer> notDominant = new HashMap<String, Integer>();

        dominant.put("A",11);
        dominant.put("K",4);
        dominant.put("Q",3);
        dominant.put("J",20);
        dominant.put("T",10);
        dominant.put("9",14);
        dominant.put("8",0);
        dominant.put("7",0);

        notDominant.put("A",11);
        notDominant.put("K",4);
        notDominant.put("Q",3);
        notDominant.put("J",2);
        notDominant.put("T",10);
        notDominant.put("9",0);
        notDominant.put("8",0);
        notDominant.put("7",0);


        for(int i=0; i<n*4; i++){
            String input = scan.next();
            if(input.substring(1,2).equals(B)){
                sum += dominant.get(input.substring(0,1));
            }
            else{
                sum += notDominant.get(input.substring(0,1));
            }
        }
        System.out.println(sum);
    }
}