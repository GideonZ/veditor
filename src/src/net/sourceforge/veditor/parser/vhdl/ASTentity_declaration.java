/**
 * 
 * This file is based on the VHDL parser originally developed by
 * (c) 1997 Christoph Grimm,
 * J.W. Goethe-University Frankfurt
 * Department for computer engineering
 *
 **/
package net.sourceforge.veditor.parser.vhdl;



/* Generated By:JJTree: Do not edit this line. ASTentity_declaration.java */
/* JJT: 0.3pre1 */

public class ASTentity_declaration extends SimpleNode {
  ASTentity_declaration(int id) {
    super(id);
  }

  public String getIdentifier(){
	  return ((ASTidentifier)jjtGetChild(0)).name;
  }

  /**
   * semantic-checks for entity_declaration
   * - identifiers at beginning and end must match
   * - the identifier is now an entity_simple_name.
   */
  public void Check()
  {
    //  identifiers at beginning and end must match
    String s1 = ((ASTidentifier)jjtGetChild(0)).name;

    int i = jjtGetNumChildren()-1;
    if (jjtGetChild(i).toString() == "identifier")
    {
      if ( s1.compareToIgnoreCase( ((ASTidentifier)jjtGetChild(i)).name) != 0)
    	  getErrorHandler().Error("identifiers don't match",null);
    }

    // the identifier is now an entity_simple_name.
    m_Parser.getSymbolTable().addSymbol(new Symbol(s1, ENTITY));
    CheckSIWGLevel1();
  }


  /**
   * VI SIWG Level1 not supported:
   * - entity_statement_part
   * - entity_declarative_part
   */
  public void CheckSIWGLevel1()
  {
    for (int i = 0; i < jjtGetNumChildren(); i++)
    {
/*      if ((jjtGetChild(i).getId() == JJTENTITY_DECLARATIVE_PART)
          && (jjtGetChild(i).jjtGetNumChildren() > 0))
    	  getErrorHandler().WarnLevel1("entity_declarative_part not supported");*/

/*      if ((jjtGetChild(i).toString() == "entity_statement_part")
          && (jjtGetChild(i).jjtGetNumChildren() > 0))
    	  getErrorHandler().WarnLevel1("entity_statement_part not supported");*/
    }
  }
}
