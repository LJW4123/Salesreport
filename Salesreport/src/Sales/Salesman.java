package Sales;

import java.util.Scanner;

public class Salesman {
	public static  Scanner scan = new Scanner(System.in);
	
	private String name;
	private double sales;
	
	public Salesman(String Name, double Sales) {
		this.name = Name;
		this.sales = Sales;
	}

	public Salesman() {
		
	}
	
	public void readInput() { //이름과 세일즈를 입력받아 저장
		
		System.out.print("이름 : ");
	    String Name = scan.next();
	    this.name=Name;
		System.out.print("실적 : ");
		Double Sales = scan.nextDouble();
		this.sales = Sales;
		System.out.println("입력완료");
		}
	
	@Override
	public  String toString() {
		return "이름: "+name+" / "+"실적: "+sales;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSales() {
		// TODO Auto-generated method stub
		return sales;
	}

	public String getName() {
		return name;
	}
	
}
