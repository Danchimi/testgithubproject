package mehrdimensionaleArray;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anzZeilen = 10;
		int anzSpalten = 10;
		
		int [][] einmaleins = new int[anzZeilen][anzSpalten];
		
	
		for(int i=0; i< einmaleins.length;i++)
		{
			for(int j=0; j<einmaleins[i].length; j++)
			{
				einmaleins[i][j] = (i+1)*(j+1);
			}
		}
		for(int i=0; i<einmaleins.length;i++)
		{
			for(int j=0; j<einmaleins[i].length;j++)
			{
				System.out.printf("%4d" , einmaleins[i][j]);
			}
			System.out.println();
		}
	}

}
