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
public class BTreeNode 
{
    //
    public String value;
    public int count;
    public BTreeNode left;
    public BTreeNode right;
    
    public BTreeNode()
    {
        count = 1;
    }
}
