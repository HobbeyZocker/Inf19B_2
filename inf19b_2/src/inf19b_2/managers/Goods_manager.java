package inf19b_2.managers;

import java.util.ArrayList;
import java.util.Stack;
import inf19b_2.goods.good;

public class Goods_manager {

	private Stack<Object> one = new Stack<Object>();
	private Stack<Object> two = new Stack<Object>();
	private Stack<Object> three = new Stack<Object>();
	private Stack<Object> four = new Stack<Object>();
	private Stack<Object> five = new Stack<Object>();
	private Stack<Object> six = new Stack<Object>();
	private Stack<Object> seven = new Stack<Object>();
	private Stack<Object> eight = new Stack<Object>();
	private Stack<Object> nine = new Stack<Object>();

	private ArrayList<Stack<Object>> stacks = new ArrayList<Stack<Object>>();

	public Goods_manager() {

//		for (int i = 0; i<9;i++)
		stacks.add(one);
		stacks.add(two);
		stacks.add(three);
		stacks.add(four);
		stacks.add(five);
		stacks.add(six);
		stacks.add(seven);
		stacks.add(eight);
		stacks.add(nine);
	}

	public boolean contains(Object obj, Stack<Object> stack) {
		return stack.contains(obj);
	}

	private boolean lookForSpace(int sizeNeeded, Stack<Object> stack) {
		int i = 3 - stack.size(); // geht nicht
		if (i < sizeNeeded)
			return false;
		else
			return true;
	}

	private void addPaperToStack(Object obj) {
		boolean stackNum[] = new boolean[9];
		int call = 1; // placeholder

		for (int i = 0; i < stacks.size(); i++) {
			if (lookForSpace(1, stacks.get(i)))
				stackNum[i] = true;
		}
		// call = game_manager.xx(stackNum) get num zurück
		stacks.get(call).push(obj);
	}

	private void addStoneToStack(Object obj) {
		boolean stackNum[] = new boolean[9];
		int call = 1; // placeholder

		for (int i = 6; i < stacks.size(); i++) {
			if (lookForSpace(1, stacks.get(i)))
				stackNum[i] = true;
		}
		// call = game_manager.xx(stackNum) get num zurück
		stacks.get(call).push(obj);
	}

	private void addWoodToStack(Object obj) {
		boolean stackNum[] = new boolean[9];
		int call = 1; // placeholder

		for (int i = 0; i < stacks.size(); i++) {
			if (lookForSpace(3, stacks.get(i)))
				stackNum[i] = true;
		}
		// call = game_manager.xx(stackNum) get num zurück
		stacks.get(call).push(obj);
	}

	public void popObj() {
		Stack<Object> pimmel = stacks.get(1);
		Stack<Object> pimmel2 = stacks.get(2);
		
//		contains(obj, stack);
		
	}

	public void pushObj(Object objImp) {

		good obj = (good) objImp;

		if (obj.name == 's') {
			// add to 7-9
			System.out.println("stein klappt");

		} else if (obj.name == 'w') {
			System.out.println("holz klappt");
			addWoodToStack(obj);

		} else if (obj.name == 'p') {
			System.out.println("papier klappt");
			addPaperToStack(obj);

		} else
			throw new RuntimeException("Object not allowed");
	}

//	public void

	// var[][] Lager = new Lager[3][3]

	/*
	 * 
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
