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

//	#########################################################

//	#########################################
//	#		Looks for space on stack		#
//	#########################################
	private boolean lookForSpace(int sizeNeeded, Stack<Object> stack) {
		return (3 - stack.size()  >= sizeNeeded);
	}
//	#########################################################

//	#########################################
//	#  Push Paper, Stone and Wood on Stack  #
//	#########################################
	private boolean[] checkPushPWS(Object obj) {
		boolean stackNum[] = new boolean[9];

		for (int i = 0; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(1, stacks.get(i));
		}
		return stackNum;

//		stacks.get(call).push(obj);
	}
//	##########################################

//	#########################################
//	#		Push Stone on to Stack			#
//	#########################################
	private boolean[] checkPushHeavyStone(Object obj) {
		boolean stackNum[] = new boolean[9];

		for (int i = 6; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(1, stacks.get(i));
		}
		// call = game_manager.xx(stackNum) get num zurück

		return stackNum;

//		stacks.get(call).push(obj);
	}
//	#########################################

//	#########################################
//	#		Push Wood Beams on to Stack		#
//	#########################################
	private boolean[] checkPushWoodedBeams(Object obj) {
		boolean stackNum[] = new boolean[9];
		
		for (int i = 0; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(3, stacks.get(i));
		}
		return stackNum;

//		stacks.get(call).push(obj);
	}
//	##########################################

//	#########################################
//	#		Pop Paper from Stack			#
//	#########################################
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
//	#########################################

//	#########################################
//	#		Pop Stone from Stack			#
//	#########################################
	private void popStone(Object obj) {

	}
//	#########################################

//	#########################################
//	#		Pop Wood from Stack			#
//	#########################################
	private void popWood(Object obj) {

	}
//	#########################################

//	#########################################
//	#			Pop main method				#
//	#########################################
	public void popObj(Object objImp) {
		good compareObj = (good) objImp;

		switch (compareObj.name) {
		case 's':
			System.out.println("stein klappt");

			break;

		case 'w':
			System.out.println("holz klappt");

			break;

		case 'b':
			System.out.println("holz klappt");

			break;

		case 'p':
			System.out.println("papier klappt");
			popPaper(compareObj);
			break;

		default:
			throw new RuntimeException("Object not allowed");
		}

	}
//	##########################################

//	#########################################
//	#			push main method			#
//	#########################################
	public void pushObj(Object objImp) throws Exception {
		good obj = (good) objImp;

		switch (obj.name) {//
		case 'h':
			System.out.println("stein klappt");
//			pushPWS(obj);
			break;

		case 's':
			System.out.println("stein klappt");
//			pushHeavyStone(obj);
			break;

		case 'b':
			System.out.println("holz klappt");
//			pushWoodedBeams(obj);
			break;

		case 'w':
			System.out.println("papier klappt");
//			pushPWS(obj);
			break;

		case 'p':
			System.out.println("papier klappt");
//			pushPWS(obj);
			break;

		default:
			throw new Exception("Object not allowed");
		}
	}
//	###########################################

//	#########################################
//	#			push main method			#
//	#########################################
	public boolean[] checkPushObj(Object objImp) {

		good obj = (good) objImp;

		switch (obj.name) {
		case 'h':
		case 'p':
		case 'w':
			System.out.println("stein klappt");
			return checkPushPWS(obj);

		case 's':
			System.out.println("stein klappt");
			return checkPushHeavyStone(obj);

		case 'b':
			System.out.println("holz klappt");
			return checkPushWoodedBeams(obj);

		default:
			return null;
		}
	}
//	###########################################

}
