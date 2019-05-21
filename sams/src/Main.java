import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static Scanner scanner=new Scanner(System.in);
    public static int size;
    public static int[] families;

    public static ArrayList<Integer> even=new ArrayList();
    public static ArrayList<String> count=new ArrayList();
    public static ArrayList<Integer> odd=new ArrayList();
    public static void getInput(){




        System.out.println("Enter the array element");
        //For reading the element
        for(int i=0;i<size;i++) {
            System.out.println("family :" + (i + 1) + ":");
            families[i] = scanner.nextInt();
        }  //For print the array element
    for(int i : families) {
        System.out.print(i + " ,");

    }

        for(int i=0;i<size;i++)
            if (families[i]%2==0){

                even.add(families[i]);

            }else if(families[i]%2!=0) {

                odd.add(families[i]);


        }

        System.out.println("even"+even);
        System.out.println("odd"+odd);
    }
     /*   int e;
        int o;
        int n;
        System.out.println("enter how many families you want");
        n=scanner.nextInt();
        System.out.println("enter family number\n");
        //ArrayList<Integer> families=new ArrayList<>();
       // while(families.size()<=10){
        int families[]=new int[n];
        for (int i=0;i<n;i++){

            System.out.println("family:"+(i+1)+"   :");
            families[i]=scanner.nextInt();}
    for (int i=0;i<families.length;i++){
       families[i];

    }System.out.println(families[i]);*/




    public static void main(String[] args){
        System.out.println("Enter the number of size of array");
        size = scanner.nextInt();
        families= new int[size];
        ArrayList<Integer> a=new ArrayList<>();
    getInput();
        try {int j=0;
            int i;
        /*for (i=0;i<even.size();j++) {
            for (j = i+1; j < odd.size()/*families.length; j++){
                //for (i=0;i<odd.size();i++){
                // if (even.get(i)>1 && odd.get(i)<51){

                if (even.get(i) > odd.get(i)) {
                    System.out.println(even.get(i) + "," + odd.get(i));
                }//}
            }
                // }
            }*/  for (i = 0; i < even.size(); i++){
                for (j=0; j < odd.size(); j++){
                    if (even.get(i) > odd.get(j)){
                    System.out.println(even.get(i) + "," + odd.get(j));

                    }

                    }
                for (int m=0; m < odd.size(); m++){
                    getCombin(i, m, odd, even);
                }
                //else if (even.get(i) > odd.get(i)&& even.get(i) > odd.get(i+1))
                }for (i = 0; i < odd.size(); i++){
                for (j=0; j < even.size(); j++){
                if(odd.get(j) > even.get(i)){
                    System.out.println(odd.get(j)+","+even.get(i));

                }

            }for (j=0; j < even.size(); j++){
                    getCombin(j, i, even, odd);

                }
            }


/*
            for (int b = 0; b < odd.size(); b++){
                if (odd.get(i) > even.get(i)){
                    System.out.println(odd.get(i) + "," + even.get(i));

                }
                else if(odd.get(i+1)>even.get(i)){
                    System.out.println(odd.get(i+1) + "," + even.get(i));
                    //
                }
                else if (even.get(i+1)>odd.get(i)&&even.get(i+1)>odd.get(i+1)){
                    System.out.println(odd.get(i) + "," + even.get(i)+","+even.get(i+1));
                }

                for (int d = i + 1; d < odd.size(); d++){

                    if (odd.get(i) > even.get(i)&& odd.get(i) > even.get(i+1)){

                        System.out.println(odd.get(i) + "," + even.get(i)+","+even.get(i+1));

                    }//else if (even.get(i) > odd.get(i)&& even.get(i) > odd.get(i+1))
                }
            }*/
    }catch (IndexOutOfBoundsException i){}
        int k;
        int p;

        for(int i=0; i<families.length; i++){
            k = 2;
            p = 1;
            while (k < families[i]) {
                if (families[i] % k == 0){
                    p = 0;
                    break;
                }
                k++;
            }
            if (p == 1 && families[i]!=1 ) {
                System.out.println(families[i]+ " are the prime numbers in the array ");
            } }



}

    public static void getCombin(int i, int m, ArrayList<Integer> odd, ArrayList<Integer> even) {
        for (int o = 0; o< odd.size(); o++){

            if(even.get(i)> odd.get(m)&& odd.get(m)> odd.get(o)){
                System.out.println(even.get(i)+","+ odd.get(m) +"," + odd.get(o));
            }}
    }
}
