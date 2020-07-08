package inf19b_2.managers;

//import java.util.ArrayList;

import java.util.Stack;
import inf19b_2.goods.good;

public class Goods_manager {

	public Stack<Object> one = new Stack<Object>();
	public Stack<Object> two = new Stack<Object>();
	public Stack<Object> three = new Stack<Object>();
	public Stack<Object> four = new Stack<Object>();
	public Stack<Object> five = new Stack<Object>();
	public Stack<Object> six = new Stack<Object>();
	public Stack<Object> seven = new Stack<Object>();
	public Stack<Object> eight = new Stack<Object>();
	public Stack<Object> nine = new Stack<Object>();

	public Goods_manager() {

	}

	private int getSize(Stack stack) {
		return stack.size();
	}
	
	private boolean lookForSpace() {
		return true;
	}

	private void addToStackWood() {

	}

	private void addToStackPaper() {

	}

	private void addToStackStone() {
//		if (getSize(eight) < 3
	}

	public void addObj(Object objImp) {

		good obj = (good) objImp;

		if (obj.name == 's') {
			// add to 7-9
			System.out.println("stein klappt");
			one.add(obj);
		} else if (obj.name == 'w') {
			System.out.println("holz klappt");
			one.add(obj);

		} else if (obj.name == 'p') {
			System.out.println("papier klappt");
			one.add(obj);

		} else
			throw new RuntimeException("Object not allowed");
	}

//	public void

	// var[][] Lager = new Lager[3][3]

	/*
	 * 3x3x3 Matrix
	 * 
	 * Beim start 0 belegt
	 * 
	 * 
	 * Arten: Papier ( farbe: weiß, grün, blau ; größe: a3, a4, a5 ; special: /)
	 * Holz ( typ: kiefer, buche, eiche ; form: brett, balken, scheit; special:
	 * 1x1x3) Stein ( typ: mamor, granit, sandstein ; gewicht: klein, mittel, groß
	 * special: nur unten lagern)
	 * 
	 * 
	 * 
	 */

}
