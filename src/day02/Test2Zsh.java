package day02;

public class Test2Zsh {
    public static void main(String[] args) {
        int i,j,sum = 0;
        for(i=1;i<=100;i++){
            for(j=1;j<=i/2;j++){
                if(j!=1&&i%j==0) {
                    break;
                }
                if(j==i/2){
                    sum = sum + i;
                }
            }
        }
        System.out.println("100以内的质数和为：" +sum);
    }


}
