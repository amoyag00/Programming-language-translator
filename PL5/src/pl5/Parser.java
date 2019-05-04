
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package pl5;

import java_cup.runtime.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\005\000\002\002\004\000\002\002" +
    "\002\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\003\000" +
    "\002\003\005\000\002\003\004\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\012\002\uffff\006\uffff\013\uffff\016\uffff\001" +
    "\002\000\012\002\010\006\006\013\011\016\005\001\002" +
    "\000\022\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011" +
    "\ufff9\012\ufff9\014\ufff9\001\002\000\010\006\006\013\011" +
    "\016\005\001\002\000\020\004\030\005\013\006\017\007" +
    "\020\010\015\011\016\012\014\001\002\000\004\002\000" +
    "\001\002\000\010\006\006\013\011\016\005\001\002\000" +
    "\020\005\013\006\017\007\020\010\015\011\016\012\014" +
    "\014\021\001\002\000\010\006\006\013\011\016\005\001" +
    "\002\000\010\006\006\013\011\016\005\001\002\000\010" +
    "\006\006\013\011\016\005\001\002\000\010\006\006\013" +
    "\011\016\005\001\002\000\010\006\006\013\011\016\005" +
    "\001\002\000\010\006\006\013\011\016\005\001\002\000" +
    "\022\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6" +
    "\012\ufff6\014\ufff6\001\002\000\022\004\ufffc\005\ufffc\006" +
    "\ufffc\007\ufffc\010\ufffc\011\ufffc\012\014\014\ufffc\001\002" +
    "\000\022\004\ufffd\005\ufffd\006\ufffd\007\020\010\015\011" +
    "\016\012\014\014\ufffd\001\002\000\022\004\ufff8\005\ufff8" +
    "\006\ufff8\007\ufff8\010\ufff8\011\ufff8\012\014\014\ufff8\001" +
    "\002\000\022\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb" +
    "\011\ufffb\012\014\014\ufffb\001\002\000\022\004\ufffa\005" +
    "\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa\012\014\014\ufffa" +
    "\001\002\000\022\004\ufffe\005\ufffe\006\ufffe\007\020\010" +
    "\015\011\016\012\014\014\ufffe\001\002\000\012\002\001" +
    "\006\001\013\001\016\001\001\002\000\022\004\ufff7\005" +
    "\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\012\014\014\ufff7" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\004\002\003\001\001\000\004\003\006\001" +
    "\001\000\002\001\001\000\004\003\030\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\011\001\001\000" +
    "\002\001\001\000\004\003\026\001\001\000\004\003\025" +
    "\001\001\000\004\003\024\001\001\000\004\003\023\001" +
    "\001\000\004\003\022\001\001\000\004\003\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public static void main(String[] argv){
	if (argv.length == 0) {
		      System.out.println("Uso : java Parser  <inputfile)>");
		    }
	else{
	try {
		java.io.FileInputStream stream = new java.io.FileInputStream(argv[0]);
	    java.io.Reader reader = new java.io.InputStreamReader(stream);
		Scanner analizadorLexico= new Yylex(reader);
		Parser parserObj = new Parser();
		parserObj.setScanner(analizadorLexico);
		parserObj.parse();
		}
		catch(Exception x) {
		System.out.println("Error fatal.");
		}
	}
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // listaexpr ::= listaexpr expr PTOYCOMA 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println("= " + e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listaexpr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= listaexpr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // listaexpr ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listaexpr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr MAS expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= new Integer(e1.intValue() + e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr MENOS expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= new Integer(e1.intValue() - e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr POR expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= new Integer(e1.intValue() * e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr ENTRE expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= new Integer(e1.intValue() / e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr POW expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= new Integer((int)Math.pow(e1.intValue(),e2.intValue())); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= NUM 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT=n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr MODULO expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= new Integer(e1.intValue() % e2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= MENOS expr 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= new Integer(0-e.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= ABREPAR expr CIERRAPAR 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT=e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}