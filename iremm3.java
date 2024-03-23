package test;
import java.util.Random;

public class iremm3 {

	public static void main(String[] args) {
		Random random=new Random();
		int a=random.nextInt(1,6);
		int b=random.nextInt(1,6);
		int c=random.nextInt(1,6);
		int d=random.nextInt(1,6);
		int [][] array1=new int [a] [b];
		int [][] array2=new int [c] [d];
		System.out.println("a(Sütun):"+a);
		System.out.println("b(Satır):"+b);
		
		
		for (int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				System.out.println(array1 [i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("c(Sütun):"+c);
		System.out.println("d(Satır):"+d);
		for (int i=0; i<c; i++)
		{
			for(int j=0; j<d; j++)
			{
				array2[i][j]=random.nextInt(1,11);
			}
		}
		for (int i=0; i<c; i++)
		{
			for(int j=0; j<d; j++)
			{
				System.out.println(array2 [i][j]+"  ");
			}
			System.out.println();
			
		}
		
		int toplam=0;
		int carpim=1;
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				toplam+=array1[i][j];
			}
		}
		
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<d; j++)
			{
				toplam+=array2[i][j];
			}
		}
		System.out.println("Toplam:"+toplam);
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				carpim*=array1[i][j];
			}
		}
		
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<d; j++)
			{
				carpim*=array2[i][j];
			}
		}
		System.out.println("Çarpım:"+carpim);
		