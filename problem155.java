public class problem155 {
//    Program 136 - Print K Shaped Alphabet Pattern
public static void main(String[] args) {
    int letter =65;
    for(int i=5;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print((char) (letter+j)+" ");
        }
        System.out.println();
    }
    for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char) (letter+j)+" ");
        }
        System.out.println();
    }
}
}
