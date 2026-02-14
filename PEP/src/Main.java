// //Enum
//
//public class Main {
//    enum Animals {
//        Dog, Cat, Tiger, Lion
//    }
//
//    public static void main(String[] args) {
//        Animals ani = Main.Animals.Tiger;
//        System.out.println(ani);
//    }
//}
//
//Enum outside class
//enum Engineering {
//    Mechinanical, Computer, Civil, Electronics
//};
//public class Main{
//    public static void main(){
//        For(Engineering eng:Engineering Values()){
//        }
//    }
//}

//Enum implementing a interface
//interface TimeOfDay {
//    void message();
//}
//
// enum InterEnum implements TimeOfDay {
//     MORNING {
//         @Override
//         public void message() {
//             System.out.println("Good Morning");
//         }
//     },
//     EVENING {
//         @Override
//         public void message() {
//             System.out.println("Good Evening");
//         }
//     }
// }
//public class Main {
//    public static void main(String[] args) {
//        InterEnum.MORNING.message();  // Outputs: Good Morning
//        InterEnum.EVENING.message();  // Outputs: Good Evening
//    }
//}

//Enum Mathoperation ,constants will be add,sub,multiply,divide having method in them

//enum Mathoperation{
//    Add{
//        public int operate(int a,int b){
//            return a+b;
//        }
//    },Sub{
//        public int operate(int a,int b){
//            return a-b;
//        }
//    },Mul {
//        public int operate ( int a, int b){
//            return a*b;
//        }
//    },Div
//        public int operate(int a, int b){
//            return a / b;
//        }
//    };
//    public abstract int operate(int a,int b);
//}
//
//public class Main {
//    public static void main(String[] args){
//        System.out.println(Mathoperation.Add.operate(4,3));
//        System.out.println(Mathoperation.Sub.operate(4,3));
//        System.out.println(Mathoperation.Mul.operate(4,3));
//        System.out.println(Mathoperation.Div.operate(4,3));
//    }
//}

// write num which implement two interface at same time which have three abstract methods,prime boolean,palindrome boolean

//interface E1{
//    boolean isPrime(int a);
//    boolean isPalindrome(int b);
//}
//interface E2{
//    int isEven(int b);
//}
//enum Answer implements E1,E2{
//    Check{
//        public boolean isPrime(int a){
//            if(a<=1)
//                return false;
//            for(int i=2;i*i<=a,i++){
//                if(a%i==0)
//                    return false;
//            }
//        }
//        return true;
//}


//interface E1 {
//    boolean isPrime(int a);
//    boolean isPalindrome(int b);
//}
//
//interface E2 {
//    int isEven(int b);
//}
//
//enum Answer implements E1, E2 {
//    Check {
//        public boolean isPrime(int a) {
//            if (a <= 1)
//                return false;
//            for (int i = 2; i * i <= a; i++) {
//                if (a % i == 0)
//                    return false;
//            }
//            return true;
//        }
//
//        public boolean isPalindrome(int b) {
//            int original = b, reverse = 0;
//            while (b > 0) {
//                reverse = reverse * 10 + b % 10;
//                b /= 10;
//            }
//            return original == reverse;
//        }
//
//        public int isEven(int b) {
//            return b % 2 == 0 ? 1 : 0;
//        }
//    };
//}

//Wrapper Class

//class WrapperDemo {
//    public static void main(String[] args) {
//        Integer a1 = 100;
//        Integer b1 = 100;
//
//        if (a1 == b1) {
//            System.out.println("yes");
//        } else {
//            System.out.println("No");
//        }
//
//        Integer a2 = 200;
//        Integer b2 = 200;
//
//        if (a2 == b2) {
//            System.out.println("yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}
//

//Optional Class

//write a java program to check that a given character a letter,digit,whitespace,or any special characters using wrapper class and its functions

//import java.util.Scanner;
//public class Main {
//    public static void isCheck(char ch) {
//        if (Character.isDigit(ch)) {
//            System.out.println("it is a digit");
//        }
//        if (Character.isLetter(ch)) {
//            System.out.println("it is a letter");
//        }
//        if (Character.isWhitespace(ch)) {
//            System.out.println("it is whitespace");
//        } else {
//            System.out.println("it is not a whitespace");
//        }
//    }
//    public static void main(String args[]) {
//        Scanner sc= new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        isCheck(ch);
//    }
//}

//write a java program to make the lowercase to uppercase character and return the final string

//public class Main{
//    public static void main(String args[]){
//        String input = "STring";
//        String result = convertToUpperCase(input);
//        System.out.println("Original String: " + input);
//        System.out.println("Converted String " + result);
//    }
//    public static String convertToUpperCase(String str){
//        return str.toUpperCase();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String input = "Hello, W@orld! ";
//        String result = input.replaceAll("[^a-zA-Z0-9\\s]", "");
//        System.out.println(result);
//    }
//}

//WAP to add elements which are integers and print all the elements of list

//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void ListPrint(String str) {
//        List<Integer> ls = new ArrayList<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                ls.add(Character.getNumericValue(str.charAt(i)));
//            }
//        }
//        for (int i = 0; i < ls.size(); i++) {
//            System.out.println(ls.get(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        ListPrint("abc123");
//    }
//}


//import java.util.ArrayList;
//
//WAP to print the elements of a list which are occurances of a target in a element in an array
//public class Main{
//public static void isoccurence(){
//    List<Integer>ls=new ArrayList<>();
//    for(int i= 0;i<arr.length;i++){
//        ls.add(i);
//    }
//}

//WAP to remove duplicate elements from a list
//I/P [2,4,5,3,6,7,6,5,4,1,9,5,8]
//O/P [2,4,3,6,7,8,9] use list.contains

//import java.lang.reflect.Array;
//import java.security.PublicKey;
//import java.util.HashMap;
//import java.util.Stack;
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 4, 6, 7, 4, 8, 9, 2, 3, 6));
//        List<Integer> unqiueList = new ArrayList<>();
//        for (Integer num : list) {
//            if (!unqiueList.contains(num)) {
//                unqiueList.add(num);
//            }
//        }
//        System.out.println(unqiueList);
//    }
//}

//Count the number of elements in a stack without manipilating it without uaing any inbulit functions of stack pop() peek() size()

//import java.util.HashMap;
//public class Main {
//    public static void main(String[] args){
//        int g1=22;
//        int g2=23;
//        int g3=24;
//        int g4=25;
//        HashMap<String,Integer>map=new HashMap<>();
//        map.put("student 1",g4);
//        map.put("student 2",g3);
//        map.put("student 3",g2);
//        map.put("student 4",g1);
//        System.out.println(map.get("student 3"));
//        System.out.println(map.containsKey("student 4"));
//        System.out.println(map.containsValue(5));
//        System.out.println(map.remove("student 2"));
//    }
//}

//import java.util.HashMap;
//
//public class Main {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("s1", 25);
//        map.put("s2", 24);
//        map.put("s3", 22);
//        map.put("s4", 27);
//
//        System.out.println(findKey(map, 24));
//    }
//
//    public static String findKey(HashMap<String, Integer> map, int value) {
//        for (String key : map.keySet()) {
//            if (map.get(key) == value)
//                return key;
//        }
//        return "Element not found";
//    }
//}

//import java.util.HashMap;
//import java.util.Map;
//public class Main{
//    public static void Traversal(HashMap<String,Integer> map){
//        for(Map.Entry<String,Integer>obj : map.entrySet()){
//            System.out.println(obj.getKey()+ " "+obj.getValue());
//
//        }}
//    public static void main(String[] args){
//        HashMap<String,Integer> map=new HashMap<>();
//        map.put("s1",25);
//        map.put("s2",26);
//        map.put("s3",27);
//        Traversal(map);
//    }
//}

//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("s1", 25);
//        map.put("s2", 26);
//        map.put("s1", 27);
//        for (Map.Entry<String, Integer> obj : map.entrySet()) {
//            System.out.println(obj.getKey() + " " + obj.getValue());
//        }
//
//        map.put("s1", 25);
//        map.put("s2", 26);
//        map.put("s1", 27);
//    }
//}

//import java.util.HashMap;
//
//public class Main {
//    public static void main(String[] args) {
//        String = "dog cat lion cat lion";
//        HashMap<String, Integer> map
//    }
//}

//import java.util.HashSet;
//public class Main
//{
//    public static void Traversal(HashSet<Integer> set){
//        for(int ele: set){
//            System.out.println(ele+" ");
//        }
//
//    }
//    public static void main(String[] args){
//        HashSet<Integer>set=new HashSet<>();
//        set.add(4);
//        set.add(5);
//        set.add(7);
//        Traversal(set);
//    }
//}

//import java.util.*;
//public class Main {
//    public static List<Integer> findDuplicates(int[] arr) {
//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//
//        for (int ele : arr) {
//            if (!set1.add(ele)) {
//                set2.add(ele);
//            }
//        }
//        return new ArrayList<>(set2);
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,3,5,4,2,3,8,4,7,8,7 };
//        System.out.println(findDuplicates(arr));
//    }
//}

//import java.util.HashMap;
//
//public class Main {
//    public static void main(String[] args) {
//        int arr[] = {2, 4, 3, 5, 3, 2, 9, 2, 3, 7, 4, 5, 8, 4};
//        System.out.println(mostFreq(arr));
//    }
//
//    public static int mostFreq(int[] arr) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int max = 0, mostFreqNum = 0;
//
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.get(num) > max) {
//                max = map.get(num);
//                mostFreqNum = num;
//            }
//        }
//        return mostFreqNum;
//    }
//}


import java.util.TreeSet;
public class Main
{
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>();
        set.add(7);
        set.add(12);
        set.add(9);
        set.add(10);
        System.out.println(set.lower(set.last()));
    }
}