package org.mathiasGarnier.Apprentissage;

import org.mathiasGarnier.Apprentissage.exception.NotAValidEnumPlaceNameException;
import org.mathiasGarnier.Apprentissage.exception.NotReachableDoorException;

import org.mathiasGarnier.Apprentissage.utils.EnumPlace;
import org.mathiasGarnier.Apprentissage.utils.Key;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, NotAValidEnumPlaceNameException, NotReachableDoorException {
	
	Key k = new Key("Maison", 5, EnumPlace.CAR_ENTRY);
	//Key c = new Key("Maison", 5, EnumPlace.ATTIC);
	
	/*
	 * System.out.println(k.equals(c));
	 * System.out.println(k.equalsWithoutKeyFor(c));
	 */
	
	Key d = (Key) k.cloneable();
		
	/*
	 * System.out.println(d.equals(c));
	 * d.setKeyActionRange(11);
	 *
	 *S ystem.out.println(d.equalsWithoutKeyFor(c));
	 */
	
	d.canOpen(EnumPlace.CAR_ENTRY);
	d.reachableDoor();
	//c.canOpen(EnumPlace.ATTIC);
	    
    }
}
