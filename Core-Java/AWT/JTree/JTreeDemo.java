import java.awt.*;
import javax.swing.*;	
import javax.swing.tree.DefaultMutableTreeNode;

class JTreeDemo{

	public static void main(String...a){
		
		JFrame jf = new JFrame("JTree Example");
		// Constructor 1. Create sample of JTree
		JTree jt1 = new JTree();
		
		jf.add(jt1);
		
		// Constructor 2. // Receive an object value
		DefaultMutableTreeNode prime = new DefaultMutableTreeNode("Prime Menu");
		JTree jt2 = new JTree(prime);  
		jf.add(jt2);
		
		
		// Constructor 3. Receives a created tree nodes
		DefaultMutableTreeNode rootTree = new DefaultMutableTreeNode("Prime Menu");
		
		//Add Color list In Root Tree
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("Colors");
		DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
		DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
		color.add(red);
		color.add(green);
		color.add(blue);
		rootTree.add(color);
		
		// Add Animals list int Root Tree
		DefaultMutableTreeNode animals = new DefaultMutableTreeNode("Animals");
		animals.add(new DefaultMutableTreeNode("Dog"));
		animals.add(new DefaultMutableTreeNode("Cat"));
		animals.add(new DefaultMutableTreeNode("Lion"));
		rootTree.add(animals);
		
		JTree jt3 = new JTree(rootTree);  
		jf.add(jt3);
		//JTree jt3 = new JTree("Third Menu");
		//jf.add(t3);
		
		//jf.setLayout(null);
		jf.setSize(1200,1200);
		jf.setVisible(true);
	}
}