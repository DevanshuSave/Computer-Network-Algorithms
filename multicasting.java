import java.io.*;
import java.util.*;

class Demo
{
	int inp[][];
	int l,r;
	void input()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of routers");
		r=Integer.parseInt(br.readLine());
		System.out.println("Enter no. of Links");
		l=Integer.parseInt(br.readLine());

		inp=new int[r][l];
		int ch=0,r1,l1;
		System.out.println("Enter 1.entering value 2.exit");
		 ch=Integer.parseInt(br.readLine());
		while(ch!=2)
		{

	System.out.println("enter the ROUTER");
	r1=Integer.parseInt(br.readLine());
	System.out.println("enter the LINK");
	l1=Integer.parseInt(br.readLine());
	System.out.println("Enter Interface nos.");
	inp[r1-1][l1-1]=Integer.parseInt(br.readLine());
	System.out.println("Enter 1.entering value 2.exit");
	ch=Integer.parseInt(br.readLine());
}

	for(int i=0;i<r;i++)
	{
		for(int j=0;j<l;j++)
		System.out.print(inp[i][j]);

		System.out.println();
	}
}
	void op()
	{
		int curr,count=0;
		for(int i=0;i<r;i++)
		{
			System.out.println("Router No: "+(i+1));

		for(int j=0;j<l;j++)
		{
			curr=inp[i][j];
			if(curr!=0)
			{
				System.out.println("input: "+curr);
				for(int k=0;k<l;k++)
				{
					if(inp[i][k]!=curr && inp[i][k]!=0)
					System.out.println("output: "+inp[i][k]);
				}
			}
		}
System.out.println();
}
}
}

class multicasting
{
	public static void main(String args[])throws IOException
	{
		Demo d=new Demo();
		d.input();
		d.op();
	}}
	/* OUTPUT:
	Enter no. of routers
	4
	Enter no. of Links
	7
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	1
	enter the LINK
	1
	Enter Interface nos.
	2
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	1
	enter the LINK
	3
	Enter Interface nos.
	1
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	1
	enter the LINK
	4
	Enter Interface nos.
	3
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	2
	enter the LINK
	1
	Enter Interface nos.
	1
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	2
	enter the LINK
	2
	Enter Interface nos.
	2
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	2
	enter the LINK
	5
	Enter Interface nos.
	3
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	3
	enter the LINK
	4
	Enter Interface nos.
	1
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	3
	enter the LINK
	5
	Enter Interface nos.
	2
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	3
	enter the LINK
	6
	Enter Interface nos.
	3
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	4
	enter the LINK
	6
	Enter Interface nos.
	1
	Enter 1.entering value 2.exit
	1
	enter the ROUTER
	4
	enter the LINK
	7
	Enter Interface nos.
	2
	Enter 1.entering value 2.exit
	2
	2013000
	1200300
	0001230
	0000012
	Router No: 1
	input: 2
	output: 1
	output: 3
	input: 1
	output: 2
	output: 3
	input: 3
	output: 2
	output: 1

	Router No: 2
	input: 1
	output: 2
	output: 3
	input: 2
	output: 1
	output: 3
	input: 3
	output: 1
	output: 2

	Router No: 3
	input: 1
	output: 2
	output: 3
	input: 2
	output: 1
	output: 3
	input: 3
	output: 1
	output: 2

	Router No: 4
	input: 1
	output: 2
	input: 2
	output: 1

Press any key to continue . . .*/