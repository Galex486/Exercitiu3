public class Main {
    public static void main (String[] args) {

        float S = 0;
        float T = 0;
        for(int i = 1;i < 99;i++){
            S = (float) i /(i+2);
            T += (float) i /(i+2);
            int D = i + 2;
            System.out.print(i + "/" + D);
            ++i;

            System.out.println("; Divide = " + S);
        }

        System.out.println("SumTotal = " + T);
    }
}
