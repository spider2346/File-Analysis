import java.io.*;
import java.util.*;
public class Analysis
{
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		try{
		FileWriter out = new FileWriter("file_stats.txt");	
		PrintWriter cr = new PrintWriter(out);
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Please pick a file to process: ");
		String input = console.next();
		
		File one = new File(input);
        Scanner in = new Scanner(one);
	
		
		ArrayList<String> uniqueWord = new ArrayList<>();
		
			int words = 0;
			int lines = 0;
			int chars = 0;
			int count = 0;
			
			while (in.hasNextLine()) {
                String s = in.nextLine();
                lines++;
                chars += s.length();
                String a [] = s.split(" ");
				
				
			for(int i = 0; i < s.length();i++)
			{
			if(s.charAt(i) != ' ')
			count ++;
		
			}				
            for (int i = 0; i < a.length; i++)
			{
			if(a[i].length() > 0)
			words++;
            
				if(!uniqueWord.contains(a[i]))
				uniqueWord.add(a[i]);
			}
        }
		
		cr.println("Statistics for: " + input);
		cr.println("Number of chars with spaces: " + chars);
		cr.println("Number of chars without spaces: " + count);
		cr.println("Number of words: " + words);
		cr.println("Number of lines: " + lines);
		cr.println("Number of unique words: " + uniqueWord.size());
		
		cr.close();
		}catch (Exception e){
			System.out.println("That file does not exist!");
	
	}
}
}