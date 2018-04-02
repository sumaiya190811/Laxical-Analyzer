package check;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
	public static void main(String arg[]) throws FileNotFoundException {
		ArrayList<String> array = new ArrayList<>();
		String sta;
		String []token=new String[50];
		String []identi=new String[20];
		String []numeri=new String[30];
		String []others=new String[30];
		String []mo=new String[30];
		
		int a=0;
		File file=new File("text.txt");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(file);	
		while(sc.hasNextLine()) {
			sta=sc.nextLine();
			String [] str=sta.split(" ");
			for(String j: str) {
				array.add(j);
				a++;
			}
		}
		String string1[]=new String[a];
		for(String i : array) {
			System.out.println(i);
			array.toArray(string1);
		}
		int k=0,m=0,l=0,n=0,o=0;
		for(int j=0;j<string1.length;j++) {
			if(string1[j].equals("a") || string1[j].equals("b") || string1[j].equals("c")) {
				identi[k]=string1[j];
				k++;
			}
			else if(string1[j].equals("int") || string1[j].equals("String") || string1[j].equals("float") || string1[j].equals("if") || string1[j].equals("else")) {
				token[m]=string1[j];
				m++;
			}
			else if(string1[j].equals("0") || string1[j].equals("1") || string1[j].equals("2") || string1[j].equals("3") ||string1[j].equals("4")
					|| string1[j].equals("5") || string1[j].equals("6") || string1[j].equals("7")
				|| string1[j].equals("8") || string1[j].equals("9") || string1[j].equals("10")) {
				numeri[l]=string1[j];
				l++;
			}
			else if(string1[j].equals(";")||string1[j].equals("}")||string1[j].equals("{")||string1[j].equals("(")||string1[j].equals(")")) {
				others[n]=string1[j];
				n++;
			}
			else if(string1[j].equals("+")||string1[j].equals("-")||string1[j].equals("*")||string1[j].equals("/")||string1[j].equals("=")||string1[j].equals("<=")
					||string1[j].equals(">=")||string1[j].equals("==")||string1[j].equals("++")||string1[j].equals("--")||string1[j].equals("%")) {
				mo[o]=string1[j];
				o++;
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(identi[i]+" ");
		}
		System.out.println();
		for(int i=0;i<m;i++) {
			System.out.print(token[i]+" ");
		}
		System.out.println();
		for(int i=0;i<l;i++) {
			System.out.print(numeri[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(others[i]+" ");
		}
		System.out.println();
		for(int i=0;i<0;i++) {
			System.out.print(mo[i]+" ");
		}
		
	}

}
