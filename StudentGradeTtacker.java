import java.util.Scanner;

public class StudentGradeTtacker{
    public static void main(String[] args) {
        double sum1 = 0,sum2 = 0,sum3 = 0,total = 0,no = 0;
          double[] test1 = new double[50]; 
          double[] test2 = new double[50];
          double[] exam = new double[50];
          double[] average = new double[50];
          Scanner sc = new Scanner(System.in);
          for(int i = 0;i <50;i++){
            System.out.println("Enter student: " + (i+1) +"grade ");
            double mark = sc.nextDouble();
            if(mark!= -1){
                test1[i] = mark;
                sum1+=test1[i];
                test2[i]=sc.nextDouble();
                sum2+=test2[i];
                exam[i]=sc.nextDouble();
                sum3+=exam[i];
                average[i]+=test1[i]*0.3+test2[i]*0.3+exam[i]*0.4;
                total+=average[i];
            }else{
                no=i;
                i=52;
            }
          }
          System.out.println("test1"+"\t"+"test2"+"\t"+"final"+"\t"+"average");
          for(int i =0;i<no;i++){
            System.out.println(test1[i]+"\t"+test2[i]+"\t"+exam[i]+"\t"+average[i]);
            System.out.println("total1"+"\t"+"total2"+"\t"+"total");
            System.out.println((double)sum1/no+"\t"+(double)sum2/no+"\t"+(double)sum3/no+"\t"+(double)total/no);
          }
    }
}