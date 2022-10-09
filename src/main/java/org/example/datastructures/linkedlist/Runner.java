package org.example.datastructures.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Runner class to call methods from LinkedList class
public class Runner 
{
		public static void main(String[] args) throws NumberFormatException, IOException 
		{
			int option;
			BufferedReader userinp=new BufferedReader(new InputStreamReader(System.in));
			LinkedList list=new LinkedList();
			
			while(true)
			{
				System.out.println("=====================================================");
				System.out.println("1. Insert");
				System.out.println("2. Insert At some Position");
				System.out.println("3. Insert At First");
				System.out.println("4. Delete"); 
				System.out.println("5. Delete At some Position"); 
				System.out.println("6. Delete At Last");
				System.out.println("7. isFound");
				System.out.println("8. Show");
				System.out.println("9. Length");
				System.out.println("10. Exit");
				System.out.println("-----------------------------------------------------");
				System.out.println("Your Option : ");
				option=Integer.parseInt(userinp.readLine());
				System.out.println("=====================================================");
				switch(option) 
				{
				case 1:
					int data;
					System.out.println("Enter the Data : ");
					data=Integer.parseInt(userinp.readLine());
					list.insert(data);
					break;
				case 2:
					int index,dataAtindex;
					System.out.println("Enter the Position : ");
					index=Integer.parseInt(userinp.readLine());
					System.out.println("Enter the Data : ");
					dataAtindex=Integer.parseInt(userinp.readLine());
					list.insertAt(index,dataAtindex);
					break;
				case 3:
					int dataAtFirst;
					System.out.println("Enter the Data : ");
					dataAtFirst=Integer.parseInt(userinp.readLine());
					list.insertFirst(dataAtFirst);
					break;
				case 4:
					int dataToDelete;
					System.out.println("Enter the Data : ");
					dataToDelete=Integer.parseInt(userinp.readLine());
					list.delete(dataToDelete);
					break;
				case 5:
					int DeleteIndex;
					System.out.println("Enter the Position : ");
					DeleteIndex=Integer.parseInt(userinp.readLine());
					list.deleteAt(DeleteIndex);
					break;
				case 6:
					list.deleteLast();
					break;
				case 7: 
					if(list.len()>0)
					{
						System.out.println("Enter the Data : ");
						int checkData=Integer.parseInt(userinp.readLine());
						System.out.println(list.isFound(checkData));
					}
					else 
					{
						System.out.println("No data Found");
					}
					break;
				case 8:
					list.show();
					break;
				case 9:
					System.out.println(list.len());
					break;
				case 10:
					System.exit(0);
				default:
					System.out.println("Invalid Option");
					break;
				}
			}
		
	}
}
