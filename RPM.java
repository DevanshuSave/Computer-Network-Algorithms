import java.util.*;

class Node
{
	String name;
	int g[];
	Node a[];
	int p;

	Node(String name,int g[])
	{
		this.name=name;
		this.g=g;
		a=new Node[10];
		p=0;
	}

	void make(Node q)
	{
		if(p==10)
		{
			System.out.println("LIMIT EXCEEDED");
			return;
		}

		this.a[p]=q;
		p++;
	}

	boolean search(int a)
	{
		for(int i=0;i<g.length;i++)
		if(g[i]==a)
		return true;
		return false;
	}
}

class RPM1
{
	Node d[];
	int g1;

	RPM1()
	{
		Scanner src=new Scanner(System.in);
		d=new Node[20];

		int i1[]={1,2};
		int i2[]={1};
		int i3[]={2};

		d[0]=new Node("Source",i1);
		d[1]=new Node("R1",i1);
		d[2]=new Node("R2",i1);
		d[3]=new Node("R3",i3);
		d[4]=new Node("R4",i2);
		d[5]=new Node("R5",i2);
		d[6]=new Node("R6",i2);
		d[7]=new Node("R7",i1);
		d[8]=new Node("R8",i1);
		d[9]=new Node("R9",i2);

		d[0].make(d[1]);
		d[0].make(d[2]);
		d[1].make(d[3]);
		d[1].make(d[4]);
		d[1].make(d[5]);
		d[2].make(d[6]);
		d[2].make(d[7]);
		d[7].make(d[8]);
		d[7].make(d[9]);

		System.out.println("Enter the group:");
		g1=src.nextInt();
		solve(d[0]);
	}

	void solve(Node current)
	{
		if(current.search(g1)==true)
		{
			for(int i=0;i<current.p;i++)
			{
				if(current.a[i]!=null && current.a[i].search(g1)==true)
				System.out.println(current.name+"-->"+current.a[i].name);
			}

			for(int i=0;i<current.p;i++)
			{
				if(current.a[i]!=null && current.a[i].search(g1)==true)
				solve(current.a[i]);
			}
		}
		else
		return;
	}
}

class RPM
{
	public static void main(String args[])
	{
		RPM1 obj=new RPM1();
	}
}