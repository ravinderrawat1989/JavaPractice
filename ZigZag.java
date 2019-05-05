import java.util.BitSet;

public class ZigZag {

	public static void main(String[] args) {

		int row=3;
		String str="PAYPALISHIRING";
		char[] ch=str.toCharArray();
		BitSet bt=new BitSet(ch.length);
		
		StringBuffer stBuff=new StringBuffer();
		int columns=ch.length;
		
		for(int i=0;i<row;i++){
					
			for(int j=0;j<columns;j++){
				int random=(int)(Math.random() * ch.length );
				
				if(!bt.get(random)){
					bt.set(random);
					
					System.out.print(ch[random]);
					stBuff.append(ch[random]);
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
		System.out.println(stBuff.toString());
		
	}

}
