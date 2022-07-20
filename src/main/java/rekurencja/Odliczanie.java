package rekurencja;

public class Odliczanie {




    public static void main(String[] args) {
        int x = 789;
        odliczanie(x);



    }

    public static void odliczanie(int i){
        if (i < 0){
            return;
        }
        else {
            System.out.println(i);
            odliczanie(i - 1);
        }
    }


}


