package com.company;

public class Main {

    public static void main(String[] args) {
	/* int s = 0;
	int i = 1;
	while (i <= 200) {
	    s = s + i;
	    i++;
    }
    System.out.println(s);
	System.out.println("------------");

	double sr = 0;
	double sum = 0;
	int n = 0;
	int x = (int)(Math.random() * 20);
	while (x != 0) {
		sum = sum + x;
		x = (int)(Math.random() * 20);
		n++;
	}
	System.out.println(" " + sum + " " + n);
	if (n != 0) {
		sr = sum / n;
	}
	else
		sr = 0;
	System.out.println(sr);
	System.out.println("------------");

	int y = 4;
	int g = 1;
	while (g <= 10) {
		y += g * 1;
		g += 2;

	}
	System.out.println(y);
	System.out.println("------------");

	double sre = 0;
	double summ = 0;
	int xx = 0;
	int nn = 0;
	do {
		xx = (int)(Math.random() * 20);
		summ = summ + xx;
		nn = nn + 1;
	}
	while (xx != 0);
	nn--;

    if (nn != 0)
    	sre = summ / nn;
	else
		sre = 0;
	System.out.println("Среднее: " + sre); */
/*
	int x =41, y = 1, i = 0;
	do {
		y = i + 3;
		x += y * 2;
		i++;
	}
	while (i <= 8);
	System.out.println(x);

	int s = 0;
	for (int ii = 1; ii <= 200; ii++) {
		s = s + ii;
		}
	System.out.println(s);
		System.out.println("_________________");

		int n = 10;
		int k = 1;
		for(int iii = 1; k <= n; iii++)
		{
			if(iii % 3 == 0)
			{
				System.out.println("\n" + k + ":" + iii);
				k++;
			}
		} */

		/*int x = 3123;
		int n = 0;
		int s = 0;
		for(;x>0;x = x / 10){
			System.out.println(x);
			n = x % 10;
			System.out.println(n);
			if(n % 3 == 0){
				s += n;
			}
		}
		System.out.println(s);*/

		/*
		for(int i=1;i<10;i++)

		{
			for(int j=1;j<10;j++)
			{
				System.out.print(i*j + " ");
			}
			System.out.println("");
		} */

		/*
		int n = 3;

		int m = 4;
		int s = 0;
		for(int i = 1; i <= m; i++)
		{
			int p = 1;
			System.out.println("");
			for(int j = 1;j <= n;j++)
			{
				p = p* i;
				System.out.println("");
			}
			s += p;
		}
		System.out.println(s);
		*/
		/*
		for(int i=1;i<10;i++)

		{
			for (int j = 1; j < 10 - i; j++) {
				System.out.print(1 + " ");
			}
			System.out.println("");

		}
		*/
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(j < i)
					break;
				System.out.print("1 ");
			}
			System.out.println("");
		}
    }
}
