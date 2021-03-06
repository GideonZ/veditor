/**
 * 
 * This file is based on the VHDL parser originally developed by
 * (c) 1997 Christoph Grimm,
 * J.W. Goethe-University Frankfurt
 * Department for computer engineering
 *
 **/
package net.sourceforge.veditor.parser.vhdl;



/* Generated By:JJTree: Do not edit this line. ASTalias_designator.java */
/* JJT: 0.3pre1 */

public class ASTalias_designator extends SimpleNode {
  ASTalias_designator(int id) {
    super(id);
  }
  
  public String getIdentifier(){
	  for (Node child : children) {
			if (child instanceof ASTidentifier) {
				return ((ASTidentifier)(child)).name;
			}
		}
		return null;
  }
}
