/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezbtree;

/**
 *
 * @author Boogster
 */
public class GomezBTree 
{
     private BTreeNode root;
    BTreeNode temp;
     /********************************************************
 *  addNode(String nodeValue)
 *  Robert Gomez
 * ******************************************************
 * Purpose: Add new String value to BTree
 * Method Inputs
 *      String nodeValue
 * Return Value
 *      
 * ******************************************************
 * 10/14/2017
 * ******************************************************
 * @param value 
 ********************************************************/
    public void addNode(String nodeValue)
    {
        if (nodeValue.compareTo("") != 0)
        {
            temp = new BTreeNode();
            temp.value = nodeValue;        
            if(root == null)
            {
               root = temp;
            }
            else 
            {
                recAdd(root);
            }
        }        
    }
    
    private void recAdd(BTreeNode curNode)
    {
        int comp = temp.value.compareTo(curNode.value);
        if (comp < 0)
        {
            if (curNode.left == null)
                curNode.left = temp;            
            else 
                recAdd(curNode.left);            
        }
        else if (comp > 0)
        {
            if (curNode.right == null)
                curNode.right = temp;
            else 
                recAdd(curNode.right);
        }   
        else
        {
            curNode.count ++;
        }
    }
    
    public String printOut()
    {
        return recPrintOut(root);
    }
    
    private String recPrintOut(BTreeNode curNode)
    {
        String myValue = "";
        if (curNode.left != null)
            myValue = recPrintOut(curNode.left);
       myValue +=  curNode.value + "..." + curNode.count + ", ";
       
       if (curNode.right != null)
           myValue += recPrintOut(curNode.right);
       
       return myValue;
    }
}

    
    
        
