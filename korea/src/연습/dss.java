package ¿¬½À;

import java.util.HashSet;
import java.util.Iterator;

public class dss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				HashSet <Integer> lotto = new HashSet<>();
				while (lotto.size()<6)
				{
					lotto.add((int)(Math.random()*45)+1);
					
				}
				Iterator <Integer> it = lotto.iterator();
				while(it.hasNext())
				{
					System.out.print(it.next());
				}
			}

		

	}


