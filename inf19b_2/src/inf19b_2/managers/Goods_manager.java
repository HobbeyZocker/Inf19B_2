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

//	#########################################

//	#########################################
//	#		Looks for space on stack		#
//	#########################################
	private boolean lookForSpace(int sizeNeeded, Stack<Object> stack) {
		return (3 - stack.size() >= sizeNeeded);
	}
//	#########################################

//	#########################################
//	#  				C4Push				    #
//	#########################################
	private boolean[] checkPushPWS() {
		boolean stackNum[] = new boolean[9];

		for (int i = 0; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(1, stacks.get(i));
		}
		return stackNum;
	}

//	#########################################
	private boolean[] checkPushHeavyStone() {
		boolean stackNum[] = new boolean[9];

		for (int i = 6; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(1, stacks.get(i));
		}
		return stackNum;
	}

//	#########################################
	private boolean[] checkPushWoodedBeams() {
		boolean stackNum[] = new boolean[9];

		for (int i = 0; i < stacks.size(); i++) {
			stackNum[i] = lookForSpace(3, stacks.get(i));
		}
		return stackNum;
	}
//	#########################################

//	#########################################
//	#			     C4Pop 					#
//	#########################################
	private boolean[][] checkPopPaper(Object paperImp) {
		boolean stackNum[][] = new boolean[9][4];
		Paper p = (Paper) paperImp;

		for (int i = 0; i < stacks.size(); i++) {
			@SuppressWarnings("unchecked")
			Stack<Object> compStack = (Stack<Object>) stacks.get(i).clone();
			for (int j = 1; j <= 3; j++) {
				if (compStack.size() > 0) {
					good g = (good) compStack.pop();
					if (g.name == 'p') {
						Paper compPaper = (Paper) g;
						stackNum[i][j] = (Objects.equals(p.getColor(), compPaper.getColor())
								&& Objects.equals(p.getSize(), compPaper.getSize()));
					}
				}
			}
			if (stackNum[i][1] || stackNum[i][2] || stackNum[i][3])
				stackNum[i][0] = true;
//			stackNum[i][0] = false;  // sollte sowieso false sein
		}
		return stackNum;

	}

//	#########################################
	private boolean[][] checkPopStone(Object stoneImp) {
		boolean stackNum[][] = new boolean[9][4];
		Stone s = (Stone) stoneImp;

		for (int i = 0; i < stacks.size(); i++) {
			@SuppressWarnings("unchecked")
			Stack<Object> compStack = (Stack<Object>) stacks.get(i).clone();
			for (int j = 1; j <= 3; j++) {
				if (compStack.size() > 0) {
					good g = (good) compStack.pop();
					if (g.name == 's' || g.name == 'h') {
						Stone compStone = (Stone) g;
						stackNum[i][j] = (Objects.equals(s.getType(), compStone.getType())
								&& Objects.equals(s.getWeight(), compStone.getWeight()));
					}
				}
			}
			if (stackNum[i][1] || stackNum[i][2] || stackNum[i][3])
				stackNum[i][0] = true;
//			stackNum[i][0] = false;  // sollte sowieso false sein
		}
		return stackNum;
	}

//	#########################################
	private boolean[][] checkPopWood(Object woodImp) {
		boolean stackNum[][] = new boolean[9][4];
		Wood w = (Wood) woodImp;

		for (int i = 0; i < stacks.size(); i++) {
			@SuppressWarnings("unchecked")
			Stack<Object> compStack = (Stack<Object>) stacks.get(i).clone();
			for (int j = 1; j <= 3; j++) {
				if (compStack.size() > 0) {
					good g = (good) compStack.pop();
					if (g.name == 'w' || g.name == 'b') {
						Wood compWood = (Wood) g;
						stackNum[i][j] = (Objects.equals(w.getType(), compWood.getType())
								&& Objects.equals(w.getForm(), compWood.getForm()));
					}
				}
			}
			if (stackNum[i][1] || stackNum[i][2] || stackNum[i][3])
				stackNum[i][0] = true;
//			stackNum[i][0] = false;  // sollte sowieso false sein
		}
		return stackNum;
	}
//	#########################################

//	#########################################
//	#			Pop check method			#
//	#########################################
	public boolean[][] checkPopObj(Object objImp) {
		good compareObj = (good) objImp;

		switch (compareObj.name) {
		case 'h':
		case 's':
			System.out.println("aus stein klappt");
			return checkPopStone(compareObj);

		case 'w':
		case 'b':
			System.out.println("aus holz klappt");
			return checkPopWood(compareObj);

		case 'p':
			System.out.println("aus papier klappt");
			return checkPopPaper(compareObj);
		}
		return null;

	}
//	##########################################

//	#########################################
//	#				Pop method				#
//	#########################################
	public void PopObj(int stack) {

		if (((good) stacks.get(stack).peek()).name == 'b') {
			// lehrt den stacks komplett wenns balken sind
			for (int i = 0; i < 3; i++) {
				stacks.get(stack).pop();
			}
		}
		stacks.get(stack).pop();

	}
//	#########################################

//	#########################################
//	#				push method				#
//	#########################################
	public void pushObj(Object objImp, int stack) {
		good obj = (good) objImp;

		if (obj.name == 'b') {
			// füllt den stacks komplett wenns balken sind
			for (int i = 0; i < 3; i++) {
				stacks.get(stack).push(obj);
			}
		}
		stacks.get(stack).push(obj);

	}
//	###########################################

//	#########################################
//	#			Push check method			#
//	#########################################
	public boolean[] checkPushObj(Object objImp) {

		good obj = (good) objImp;

		switch (obj.name) {
		case 's':
		case 'p':
		case 'w':
			System.out.println("PWS klappt");
			return checkPushPWS();

		case 'h':
			System.out.println("stein klappt");
			return checkPushHeavyStone();

		case 'b':
			System.out.println("holz klappt");
			return checkPushWoodedBeams();

		}
		return null;
	}
//	#########################################

//	#########################################
//	#				move methods			#
//	#########################################
	public void move(int stackFrom, int stackTo) {
		stacks.get(stackTo).push(stacks.get(stackFrom).pop());
	}

//	#########################################
	public boolean[] checkMoveFrom() {
		return checkNotEmpty();
	}

//	#########################################
	public boolean[] checkMoveTo() {
		boolean[] stackNotFull = new boolean[9];

		for (int i = 0; i < stacks.size(); i++) {
			stackNotFull[i] = !(stacks.get(i).size() >= 3);
		}
		return stackNotFull;
	}
//	#########################################

//	#########################################
//	#			Check not Empty				#
//	#########################################
	public boolean[] checkNotEmpty() {
		boolean[] stackNotEmpty = new boolean[9];

		for (int i = 0; i < stacks.size(); i++) {
			stackNotEmpty[i] = !stacks.get(i).isEmpty();
		}
		return stackNotEmpty;
	}
//	#########################################
}
