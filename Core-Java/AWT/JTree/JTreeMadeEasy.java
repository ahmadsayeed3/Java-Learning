// Making Class To JTree Easily. Just send Arrays Of Arrays and That will return JTree Object
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class JTreeMadeEasy{
	
	JTreeMadeEasy(){
		JFrame jf = new JFrame("JTree Made Easy Class");
		
		String rootName = "Style";
		String[] headings = {"Colors", "Fonts", "Alligments"};
		String[][] items = {
			{"Red", "Green", "Blue"},
			{"Algerian", "Arial", "Bell-MT"},
			{"Left", "Right", "Center"}
		};
		
		JTree jt = new JTree(new MakeJTree().doMakeJTree(rootName, headings, items));
		
		jf.add(jt);
		
		jf.setSize(800,800);
		jf.setVisible(true);
	}
	
	
	
	public static void main(String...a){
		new JTreeMadeEasy();
	}
}

class MakeJTree{
	
	DefaultMutableTreeNode rName;
	DefaultMutableTreeNode[] hName;
	String [][] tItems;
	
	MakeJTree(){}
	
	public DefaultMutableTreeNode doMakeJTree(String rootName, String[] headings, String [][] items){
		rName = new DefaultMutableTreeNode(rootName);
		hName = new DefaultMutableTreeNode[headings.length];
		//String [][] tItems = new String[items.length][]
		
		for(int i=0; i < headings.length; i++){
			hName[i] = new DefaultMutableTreeNode(headings[i]);
			for(int j=0; j<items[i].length; j++){
					hName[i].add(new DefaultMutableTreeNode(items[i][j]));
			}
			
			rName.add(hName[i]);
		}
		return rName;
	}
}