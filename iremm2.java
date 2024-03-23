package test;
import java.util.Random;

public class iremm2 {

	public static void main(String[] args) {
		Random rnd = new Random ();
		int [][] matris1=new int [2][2] ;
		int [][] matris2=new int [2][2] ;
		int [][] carpım=new int [2][2] ;
		int [][] toplam=new int [2][2] ;
		
		for(int i=0; i<2; i++)
		{
			for(int y=0; y<2; y++)
			{
				matris1[i][y]=rnd.nextInt(10);
			}
		}

		for(int i=0; i<2; i++)
		{
			for(int y=0; y<2; y++)
			{
				matris2[i][y]=rnd.nextInt(10);
			}
		}

		for(int i=0; i<2; i++)
		{
			for(int y=0; y<2; y++)
			{
				toplam[i][y]=matris1[i][y]+matris2[i][y];
			}
		}
		for(int i=0; i<2; i++)
		{
			for(int y=0; y<2; y++)
			{
				carpım[i][y]+=matris1[i][y]*matris2[i][y];
			}
		}
		System.out.println("Matrislerin Toplamı :");
		for(int i=0; i<2; i++)
		{
			for(int y=0; y<2; y++)
			{
				
				System.out.print(toplam [i][y]+" ");
				
				
			}
		}  
		System.out.println();
		System.out.println("Matrislerin Çarpımı :");
		for(int i=0; i<2; i++)
		{
			for(int y=0; y<2; y++)
			{
				
				System.out.print(carpım [i][y]+" ");
				
				
			}
		}  
		
		
		
		
		
	}

}