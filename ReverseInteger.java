
public class ReverseInteger {

	public static void main(String[] args) {
		
		int a=33;
		
		boolean  isSigned=false;
		String sign=null;
		
		String str=Integer.toString(a);
		
		if(str.substring(0,1).equals("-") || str.substring(0,1).equals("+")){
			isSigned=true;
			sign=str.substring(0,1);
			str=str.substring(1);
		}
		
		char[] ch=str.toCharArray();
		
		StringBuffer stBuff=new StringBuffer();
		
		if (isSigned)
			stBuff.append(sign);
		
		for(int i=ch.length-1;i>=0;i--)
			stBuff.append(ch[i]);
		
		
		a=Integer.parseInt(stBuff.toString());
		
		
		System.out.println(" got a " + a);
	}

}
