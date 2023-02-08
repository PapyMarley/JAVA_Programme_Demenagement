public class Main {

    public static void main(String[] args) {
        int totalBox = 34;
        int chargedBox = 0;

        while (totalBox > 0){
            if (totalBox > 9){
                chargedBox = 9;
                totalBox -= chargedBox;
                System.out.println("Un voyage de " + chargedBox);
                if (totalBox < 9) {
                    chargedBox = totalBox;
                    totalBox -= totalBox;
                    System.out.println("Un voyage de " + chargedBox);
                }
            }
        }
    }
}