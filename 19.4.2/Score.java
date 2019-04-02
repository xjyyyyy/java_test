package xjy;
import java.util.Scanner;
public class Score {
	 public static void main(String[] args) {
		 Score sc=new Score();
		 System.out.println("总成绩："+sc.totalS());
		 System.out.println("平均成绩："+sc.averageS());
	 }
	 
	private double javaS;
	private double CS;
	private double DBS;
	
	public Score() {
		input();
	}
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入Java分数：");
		javaS=sc.nextDouble();
		System.out.println("输入C#分数：");
		CS=sc.nextDouble();
		System.out.println("输入DB分数：");
		DBS=sc.nextDouble();
	}

	public double totalS() {
		return javaS+CS+DBS;
	}
	public double averageS() {
		return (javaS+CS+DBS)/3;
	}
}
