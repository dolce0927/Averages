import javax.swing.*;
public class AverageOfQuizzes
{
	public static void main(String[] args)
	{
		int[] scores = new int[3];
		int score = 0;
		int count = 0;
		int total = 0;
		final int QUIT = 999;
		final int MAX = 3;
		String message1 = "The scores entered were: ";
		String message2 = "The average is: ";
		String message3 = "No scores were entered. ";
		String message4 = "";
		String message5 = "";

		score = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quiz score or " + QUIT + " to quit "));

		while(score !=QUIT)
		{
			scores[count] = score;
			total += scores[count];
			++count;
			if(count == MAX)
				score = QUIT;
			else
			{
			 score = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter next quiz score or " + QUIT + " to quit "));
			}
		}		
	
		for(int x = 0; x < count; ++x)
			message4 = (message1 += "\n" + scores[x]);
			message5 = (message2 + (float)(total * 1.0 / count));


		JOptionPane.showMessageDialog(null, message4 + "\n" + message5);	
	}
}