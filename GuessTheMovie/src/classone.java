import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random; 
public class classone {
	void method(){
	try {
	File myobject = new File("List.txt");
	Scanner myReader = new Scanner(myobject);
	
	ArrayList<String> movie = new ArrayList<String>();
	int ctr=0;
	while(myReader.hasNextLine())
	{    
	      
		String data = myReader.nextLine();
		movie.add(data);
		ctr=ctr+1;
		
	}
	
	//System.out.println("Total Number of Movies  "+ ctr);
	//System.out.println(movie);
	Random objR = new Random();
	int rand = objR.nextInt(25);
	//System.out.println("Random Integers: "+rand); 
	//System.out.println(movie.get(rand));
	char[] item = new char[(movie.get(rand)).length()];
	//System.out.println((movie.get(rand)).length());
	for(int i=0; i<(movie.get(rand)).length();i++)
	{
		
		//System.out.print(item[i]);	
		if (movie.get(rand).charAt(i)==' ')
		{
			item[i]=' ';
		}
		else {
			item[i]='-';
		}
		System.out.print(item[i]);	
	}
	   
	int life=5;
	Scanner sc = new Scanner(System.in);
	ArrayList<Character> m = new ArrayList<Character>();
	while(life>0)
	{
		char o = sc.next().charAt(0);
		//first if
		if(m.contains(o))
		{
			System.out.println("Already Entered");
			
		}
		m.add(o);
		//second
		if(movie.get(rand).contains(o+""))
		{
			for(int y =0; y<movie.get(rand).length();y++)
			{
				if((movie.get(rand)).charAt(y)==o)
				{
					item[y]=o;
				}
			}
			
		}
		else {
			life --;
		}
		//third
		if ((movie.get(rand)).equals(String.valueOf(item)))
				{
			System.out.println("You Won "+movie.get(rand));
			break;
				}
		System.out.println(item);
		System.out.println("Life remaining "+life);
		
		if(life==0)
		{
			System.out.println("You Lose Correct Answer Is  "+movie.get(rand));
		}
		
	}
	sc.close();
	myReader.close();
	
	
	


	}
	catch(FileNotFoundException e)
	{
		System.out.println("An error occured");
		
	}
}
	
}
