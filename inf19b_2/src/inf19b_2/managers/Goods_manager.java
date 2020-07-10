package inf19b_2.managers;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;
import inf19b_2.goods.*;

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

//	obsolet?
	public boolean contains(Object obj, Stack<Object> stack) {
		return stack.contains(obj);

	}
//	#########################################################

	private boolean lookForSpace(int sizeNeeded, Stack<Object> stack) {
		return (3 - stack.size() < sizeNeeded);
	}
//	#########################################################

//	PushPaper
	private void pushPaper(Object obj) {
		boolean stackNum[] = new boolean[9];
		int call = 1; // placeholder

		for (int i = 0; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(1, stacks.get(i));
		}
		// call = game_manager.xx(stackNum) get num zurück
		stacks.get(call).push(obj);
	}
//	#########################################################

//	PushStone
	private void pushStone(Object obj) {
		boolean stackNum[] = new boolean[9];
		int call = 7; // placeholder

		for (int i = 6; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(1, stacks.get(i));
		}
		// call = game_manager.xx(stackNum) get num zurück
		stacks.get(call).push(obj);
	}
//	#########################################################

//	PushWood
	private void pushWood(Object obj) {
		boolean stackNum[] = new boolean[9];
		int call = 1; // placeholder

		for (int i = 0; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(1, stacks.get(i));
		}
		// call = game_manager.xx(stackNum) get num zurück
		stacks.get(call).push(obj);
	}
//	#########################################################

	private void popPaper(Object objImp) {
		boolean stackNum[][] = new boolean[9][4];
		int call = 1; // placeholder
		Paper obj = (Paper) objImp;

		for (int i = 0; i < stacks.size(); i++) {
			Stack<Object> compStack = stacks.get(i);
			for (int j = 1; i <= 3; i++) {
				if (compStack.size() > 0) {
					Paper compObj = (Paper) compStack.pop();
					stackNum[i][j] = (Objects.equals(obj.getColor(), compObj.getColor())
							&& Objects.equals(obj.getSize(), compObj.getSize()));
				}
			}
		}
		// call = game_manager.xx(stackNum) get num zurück
		stacks.get(call).pop();
	}
//	#########################################################

	private void popStone(Object obj) {

	}
//	#########################################################

	private void popWood(Object obj) {

	}
//	#########################################################

	public void popObj(Object objImp) {
		good compareObj = (good) objImp;

		switch (compareObj.name) {
		case 's':
			System.out.println("stein klappt");

			break;

		case 'w':
			System.out.println("holz klappt");

			break;

		case 'p':
			System.out.println("papier klappt");
			popPaper(compareObj);
			break;

		default:
			throw new RuntimeException("Object not allowed");
		}
		Stack<Object> pimmel = stacks.get(1);
		Stack<Object> pimmel2 = stacks.get(2);

//		contains(obj, stack);

	}
//	#########################################################

	public void pushObj(Object objImp) {

		good obj = (good) objImp;

		switch (obj.name) {
		case 's':
			System.out.println("stein klappt");
			pushStone(obj);
			break;

		case 'w':
			System.out.println("holz klappt");
			pushWood(obj);
			break;

		case 'p':
			System.out.println("papier klappt");
			pushPaper(obj);
			break;

		default:
			throw new RuntimeException("Object not allowed");
		}

	}
//	#########################################################

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
