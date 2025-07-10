import java.util.Scanner;
public class mark_cal{
public static void main(String[] args){
    
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ur name to proceed :");
        String name=input.nextLine();
        System.out.println("ENter ut class of std to proceed:");
        int Stud_class=input.nextInt();
     
     finalCalc();  
    }

public static void finalCalc(){
    Scanner input=new Scanner(System.in);
    int[] marks=new int[5];
    int total=0;
    System.out.println("Enter 5 subject marks calculate total? -average? ");
    for(int i=0;i< marks.length;i++){
        System.out.println("subjects"+(i+1)+":");
        marks[i]=input.nextInt();
        total=total+marks[i];
    }
    double average=total / 5.0;
    System.out.println("total =>"+total);
    System.out.println("average =>"+average);
    
    if(average==100){
        System.out.println("You got centum,Great keep it upp !!!");
    }else if(average >=80 && average <100){
        System.out.println("Good marks ,keep going !");
    }else if(average >=60 && average <80){
        System.out.println("Good");
    }else if(average >=80 && average <100){
        System.out.println("just pass,try harder...");
    }else{
        System.out.println("you got fail in exam,try next time");
    }
}    
}


