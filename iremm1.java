package test;

public class irem1 {

	public static void main(String[] args) {
		int[] dizi1= {1,2};
		int[] dizi2= {1,2};
		
		
		int[]carpım=new int [2];
		int[]toplam=new int [2];
		for (int i=0; i<2; i++)
		{
			carpım[i]=(dizi1[i]*dizi2[i]);
			toplam[i]=(dizi1[i]+dizi2[i]);
			
		}
		
        System.out.println("Çarpım:"+carpım[0]+"," +carpım[1]);
        System.out.println("Toplam: " +   + toplam[0] + ", " + toplam[1]);
        
	}

}

