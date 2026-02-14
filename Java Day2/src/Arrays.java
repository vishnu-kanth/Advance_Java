public class Arrays {
    public static void main(String args[]){
        int num [] ={2,4,6,7,10};
        int max = num[0];
        for(int i =1;i<num.length;i++) {
            if (max > num[i]) {
                num[i] = max;
            }
        }
        System.out.println(max);
    }
}
