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
		for(int i=0;i<r;i++)
				for(int j=0;j<l;j++)
				inp[i][j]=0;
				System.out.println("Enter Interface nos.");
				for(int i=0;i<r;i++)
				{
					System.out.println("ROUTER."+(i+1));
				for(int j=0;j<l;j++)
				{
					System.out.println("link."+(j+1));
				inp[i][j]=Integer.parseInt(br.readLine());
			}


	}
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<l;j++)
		System.out.print(inp[i][j]);

		System.out.println();
	}
}
	void op()throws IOException
	{int inter;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter router");
				r=Integer.parseInt(br.readLine());
				System.out.println("Enter Links");
		l=Integer.parseInt(br.readLine());
		System.out.println("Enter Interface");
		inter=Integer.parseInt(br.readLine());
		if(inp[r][l]!=inter)
		System.out.println("discard");
		else
		System.out.println("forward on interface"+inter);


	}
}

class rpf
{
	public static void main(String args[])throws IOException
	{
		Demo d=new Demo();
		d.input();
		d.op();
	}}
	/* OUTPUT
	Enter no. of routers
	4
	Enter no. of Links
	8
	Enter Interface nos.
	ROUTER.1
	link.1
	2
	link.2
	2
	link.3
	1
	link.4
	3
	link.5
	2
	link.6
	2
	link.7
	3
	link.8
	2
	ROUTER.2
	link.1
	1
	link.2
	2
	link.3
	3
	link.4
	3
	link.5
	3
	link.6
	2
	link.7
	2
	link.8
	2
	ROUTER.3
	link.1
	2
	link.2
	2
	link.3
	2
	link.4
	1
	link.5
	2
	link.6
	2
	link.7
	3
	link.8
	1
	ROUTER.4
	link.1
	1
	link.2
	2
	link.3
	1
	link.4
	2
	link.5
	2
	link.6
	2
	link.7
	1
	link.8
	2
	22132232
	12333222
	22212231
	12122212
	Enter router
	1
	Enter Links
	7
	Enter Interface
	4
	discard
Press any key to continue . . .
*/