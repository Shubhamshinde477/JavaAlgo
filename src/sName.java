public class sName {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 8;
        String lastLine = "";
        String space = "";
        for(int i = 0;i<a; i++){
            for(int j = 0;j<13; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 0;i<b; i++){
            for(int j = 0;j<b; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 0;i<2; i++){
            for(int j = 0;j<13; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0; i<10; i++){
            space = space + " ";
        }
        for(int i = 0;i<3; i++){
            System.out.print(space);
            for(int j = 0;j<3; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0;i<2; i++){
            for(int j = 0;j<13; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
