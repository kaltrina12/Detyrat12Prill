
public class Detyra2 {
	public String removeDuplicateLetters(String s)
	{
		String answer="";
		for(int i=0;i<s.length();i++)
		{
			if(notFoundin(answer,s.charAt(i)))
			{
				answer=answer+s.charAt(i);
			}
		}
		return answer;
	}
	private boolean notFoundin(String a,char c)
	{
		boolean notFound=true;
		for(int j=0;j!=a.length();j++)
		{
			notFound=notFound&&(c!=a.charAt(j));
		}
		return notFound;
	}
	public static void main(String[]args)
	{
		Detyra2 k=new Detyra2();
		System.out.println(k.removeDuplicateLetters("butterflyes"));
	}
	

}
