import java.util.*;
class BillingSystem
{
	public static void main(String[] args) 
	{
		ArrayList<Bill>  newItem = new ArrayList<Bill>();
		char cont='Y';
		String itemName="";
		int itemPrice=0,subTotal=0,grandTotal=0;
		System.out.println("Welcome to Yallavva canteen");
		System.out.println("Enter Customer Name");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		//menu card
		System.out.println("Menu");
		System.out.println(" _________________________________________");
		System.out.println("|  ItemID |  ItemName     |  ItemPrice    |");
		System.out.println("|---------|---------------|---------------|");
		System.out.println("|   01    |    Coffee     |      15       |");
		System.out.println("|   02    |    Tea        |      15       |");
		System.out.println("|   03    |    Coke       |      30       |");
		System.out.println("|   04    |    Water      |      20       |");
		System.out.println("|   05    |    Pizza      |      80       |");
		System.out.println("|_________|_______________|_______________|");
        // item for customer

		 
		while (cont=='Y')
		{
			System.out.println("Enter the ItemID Number");
			int itemid=sc.nextInt();
	        System.out.println("Enter the Item Quantity");
			int quantity=sc.nextInt();

				switch (itemid)
				{
				case 1:
					itemName="Coffee";
				    itemPrice=15;
					subTotal= itemPrice*quantity;
					break;
				case 2:
					itemName="Tea";
				    itemPrice=15;
					subTotal= itemPrice*quantity;
					break;
				case 3:
					itemName="Coke";
				    itemPrice=30;
					subTotal= itemPrice*quantity;
					break;
				case 4:
					itemName="Water";
				    itemPrice=20;
					subTotal= itemPrice*quantity;
					break;
				case 5:
					itemName="Pizza";
				    itemPrice=80;
					subTotal= itemPrice*quantity;
					break;
				default:
				 System.out.println("Invalid ItemID");
				}
				grandTotal=grandTotal+subTotal;
				newItem.add(new Bill(itemName,itemid, itemPrice,quantity,subTotal));
				System.out.println("Do you want to Continue (Y/N)");// y/n and Y/N and Yes/No
				String c=sc.next();
				c=c.toUpperCase();
				char a[] = c.toCharArray();
				cont = a[0];
				
				 
		}
		System.out.println("__________________________________________________________________");
		System.out.println("Customer Name : " + name);
		System.out.println("__________________________________________________________________");
		System.out.println("  ItemID |  ItemName     |  ItemPrice    |  Quantity  |  Subtotal   ");
		System.out.println("---------|---------------|---------------|------------|-----------");
		for ( Bill x : newItem)
		{
			System.out.println(x);
		}
        System.out.println("___________________________________________________________________");
		System.out.println();
        System.out.println("Total Amount " + "                                              " +   grandTotal);
	}
}

class Bill
{
	String itemName;
	int itemid,itemPrice,quantity,subTotal;

	Bill(String itemName,int itemid,int itemPrice,int quantity,int subTotal)
	{
		this.itemName=itemName;
		this.itemid=itemid;
		this.itemPrice=itemPrice;
		this.quantity=quantity;
		this.subTotal=subTotal;

	}
	public String toString()
	{
		return  itemid+"           "+itemName+ "               " +itemPrice+"           " +quantity+ "            "  +subTotal;
	} 

}


