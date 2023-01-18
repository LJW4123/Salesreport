package Sales;

import java.util.Arrays;
import java.util.Scanner;

public class SalesReport {
	public static Scanner scan = new Scanner(System.in);
	private int number;
	private  Salesman [] team; 
	private double highestSales;
	private double averageSales;
	
	public SalesReport(int number) {
		this.number = number;
		team = new Salesman[number];
		for(int i=1; i<=number; i++) {
			System.out.println(i+"번째 팀원 정보 입력");
			String NAME=null;
			Double SALES = 0.0;
			Salesman salesman = new Salesman(NAME, SALES);
			salesman.readInput();
			team[i-1] = salesman;
			
		}
		
	}
	
	public SalesReport() {
				
	}
	
	public void computeStats() {//최고와 평균을 계산해 주는 함수 출력되는 건 없음
		double Average=0;
		double max = 0;
		for (int j =0; j<number; j++) {
			Average+=team[j].getSales();
		}
		Average= (Average/number);
		this.averageSales = Average;
		
		for(int i=0; i<number; i++) {
			if((i!=number-1)&&(team[i].getSales()>team[i+1].getSales())) {
				max = team[i].getSales();
			}
			else if (team[number-1].getSales()>max){
				max = team[number-1].getSales();
			}
		}
		this.highestSales=max;
	}
	
	public Salesman getBestClerk() {
		for(int i=0; i<number; i++) {
	if (this.team[i].getSales() == highestSales) {
		return team[i];
		}
	}
		return null;	
	}
	@Override
	public String toString() {
		String str = "총 팀원수: "+this.number+"\n";
		str+="최고판매액: "+this.highestSales+"\n";
		str+="평균판매액: "+this.averageSales+"\n";
		str+="------------------------"+"\n";
		for(int i=0; i<number; i++) {
		str+="이름: "+ team[i].getName()+" / "+"실적: "+team[i].getSales()+"\n";
		}
		return str;
	}
}
