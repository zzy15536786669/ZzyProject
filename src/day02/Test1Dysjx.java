package day02;

public class Test1Dysjx {

    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<6;i++){
            for(k=0;k<6-i;k++){
                System.out.print(" ");
            }
            for(j=8-i;j<=8+i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
