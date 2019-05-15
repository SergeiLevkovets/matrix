import java.util.Random;

public class Matrix {
    public static void main(String[] args) throws InterruptedException {
        int[] m=new int[]{77,65,84,82,73,88,32};
        int[] order=new int[50];
        Random r=new Random();
        for(int i=0; i<50;) {
            System.out.print((char)(m[order[i++]=6]));
            System.out.print((char)32);
        }
        for(int j=300;;Thread.sleep(60+(j/=1.1) )) {
            System.out.print((char)10);
            for (int i=-1; ++i<50; System.out.print((char)32)) {
                if(++order[i]>5){
                    order[i]=r.nextInt(100)<7?0:6;
                    System.out.print((char)(m[order[i]]+(r.nextInt(100)>1?0:32)));
                }else {
                    System.out.print((char)(m[order[i]]+(r.nextInt(100)<50?0:32)));
                }
            }
        }
    }
}
