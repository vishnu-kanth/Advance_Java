public class Method {
    public int add (int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
        public static void main(String [] args){
            Method obj=new Method();
            int r1 = obj.add(7,6);
            System.out.println(r1);
    }
}
