/* The following code was generated by JFlex 1.7.0 */

package pl6;
import java_cup.runtime.*;
import java.io.*;
/**
 * 
 * @author Carlos Fernández Valladares / Samuel Lebrero Alonso / Alejandro Moya García
 *
 *  Practica: Practica  Gestion de tipos
 */

class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\36\1\40\1\5\1\6\1\6\1\5\16\36\4\0\1\40\3\0"+
    "\1\35\2\0\1\4\1\2\1\3\2\0\1\32\1\0\1\34\1\0"+
    "\12\37\1\31\1\1\5\0\32\35\1\27\1\0\1\30\1\0\1\35"+
    "\1\0\1\15\1\21\1\17\1\35\1\14\1\25\1\35\1\20\1\10"+
    "\2\35\1\16\1\35\1\11\1\22\1\23\1\35\1\13\1\35\1\12"+
    "\1\26\3\35\1\24\1\35\4\0\6\36\1\7\32\36\2\0\4\35"+
    "\4\0\1\35\2\0\1\36\7\0\1\35\4\0\1\35\5\0\27\35"+
    "\1\0\37\35\1\0\u01ca\35\4\0\14\35\16\0\5\35\7\0\1\35"+
    "\1\0\1\35\21\0\160\36\5\35\1\0\2\35\2\0\4\35\10\0"+
    "\1\35\1\0\3\35\1\0\1\35\1\0\24\35\1\0\123\35\1\0"+
    "\213\35\1\0\5\36\2\0\236\35\11\0\46\35\2\0\1\35\7\0"+
    "\47\35\7\0\1\35\1\0\55\36\1\0\1\36\1\0\2\36\1\0"+
    "\2\36\1\0\1\36\10\0\33\35\5\0\3\35\15\0\5\36\6\0"+
    "\1\35\4\0\13\36\5\0\53\35\25\36\12\37\4\0\2\35\1\36"+
    "\143\35\1\0\1\35\10\36\1\0\6\36\2\35\2\36\1\0\4\36"+
    "\2\35\12\37\3\35\2\0\1\35\17\0\1\36\1\35\1\36\36\35"+
    "\33\36\2\0\131\35\13\36\1\35\16\0\12\37\41\35\11\36\2\35"+
    "\4\0\1\35\5\0\26\35\4\36\1\35\11\36\1\35\3\36\1\35"+
    "\5\36\22\0\31\35\3\36\104\0\1\35\1\0\13\35\67\0\33\36"+
    "\1\0\4\36\66\35\3\36\1\35\22\36\1\35\7\36\12\35\2\36"+
    "\2\0\12\37\1\0\7\35\1\0\7\35\1\0\3\36\1\0\10\35"+
    "\2\0\2\35\2\0\26\35\1\0\7\35\1\0\1\35\3\0\4\35"+
    "\2\0\1\36\1\35\7\36\2\0\2\36\2\0\3\36\1\35\10\0"+
    "\1\36\4\0\2\35\1\0\3\35\2\36\2\0\12\37\4\35\7\0"+
    "\1\35\5\0\3\36\1\0\6\35\4\0\2\35\2\0\26\35\1\0"+
    "\7\35\1\0\2\35\1\0\2\35\1\0\2\35\2\0\1\36\1\0"+
    "\5\36\4\0\2\36\2\0\3\36\3\0\1\36\7\0\4\35\1\0"+
    "\1\35\7\0\12\37\2\36\3\35\1\36\13\0\3\36\1\0\11\35"+
    "\1\0\3\35\1\0\26\35\1\0\7\35\1\0\2\35\1\0\5\35"+
    "\2\0\1\36\1\35\10\36\1\0\3\36\1\0\3\36\2\0\1\35"+
    "\17\0\2\35\2\36\2\0\12\37\1\0\1\35\17\0\3\36\1\0"+
    "\10\35\2\0\2\35\2\0\26\35\1\0\7\35\1\0\2\35\1\0"+
    "\5\35\2\0\1\36\1\35\7\36\2\0\2\36\2\0\3\36\10\0"+
    "\2\36\4\0\2\35\1\0\3\35\2\36\2\0\12\37\1\0\1\35"+
    "\20\0\1\36\1\35\1\0\6\35\3\0\3\35\1\0\4\35\3\0"+
    "\2\35\1\0\1\35\1\0\2\35\3\0\2\35\3\0\3\35\3\0"+
    "\14\35\4\0\5\36\3\0\3\36\1\0\4\36\2\0\1\35\6\0"+
    "\1\36\16\0\12\37\11\0\1\35\7\0\3\36\1\0\10\35\1\0"+
    "\3\35\1\0\27\35\1\0\12\35\1\0\5\35\3\0\1\35\7\36"+
    "\1\0\3\36\1\0\4\36\7\0\2\36\1\0\2\35\6\0\2\35"+
    "\2\36\2\0\12\37\22\0\2\36\1\0\10\35\1\0\3\35\1\0"+
    "\27\35\1\0\12\35\1\0\5\35\2\0\1\36\1\35\7\36\1\0"+
    "\3\36\1\0\4\36\7\0\2\36\7\0\1\35\1\0\2\35\2\36"+
    "\2\0\12\37\1\0\2\35\17\0\2\36\1\0\10\35\1\0\3\35"+
    "\1\0\51\35\2\0\1\35\7\36\1\0\3\36\1\0\4\36\1\35"+
    "\10\0\1\36\10\0\2\35\2\36\2\0\12\37\12\0\6\35\2\0"+
    "\2\36\1\0\22\35\3\0\30\35\1\0\11\35\1\0\1\35\2\0"+
    "\7\35\3\0\1\36\4\0\6\36\1\0\1\36\1\0\10\36\6\0"+
    "\12\33\2\0\2\36\15\0\60\35\1\36\2\35\7\36\4\0\10\35"+
    "\10\36\1\0\12\37\47\0\2\35\1\0\1\35\2\0\2\35\1\0"+
    "\1\35\2\0\1\35\6\0\4\35\1\0\7\35\1\0\3\35\1\0"+
    "\1\35\1\0\1\35\2\0\2\35\1\0\4\35\1\36\2\35\6\36"+
    "\1\0\2\36\1\35\2\0\5\35\1\0\1\35\1\0\6\36\2\0"+
    "\12\37\2\0\4\35\40\0\1\35\27\0\2\36\6\0\12\37\13\0"+
    "\1\36\1\0\1\36\1\0\1\36\4\0\2\36\10\35\1\0\44\35"+
    "\4\0\24\36\1\0\2\36\5\35\13\36\1\0\44\36\11\0\1\36"+
    "\71\0\53\35\24\36\1\35\12\37\6\0\6\35\4\36\4\35\3\36"+
    "\1\35\3\36\2\35\7\36\3\35\4\36\15\35\14\36\1\35\1\36"+
    "\12\37\4\36\2\0\46\35\1\0\1\35\5\0\1\35\2\0\53\35"+
    "\1\0\u014d\35\1\0\4\35\2\0\7\35\1\0\1\35\1\0\4\35"+
    "\2\0\51\35\1\0\4\35\2\0\41\35\1\0\4\35\2\0\7\35"+
    "\1\0\1\35\1\0\4\35\2\0\17\35\1\0\71\35\1\0\4\35"+
    "\2\0\103\35\2\0\3\36\40\0\20\35\20\0\125\35\14\0\u026c\35"+
    "\2\0\21\35\1\0\32\35\5\0\113\35\3\0\3\35\17\0\15\35"+
    "\1\0\4\35\3\36\13\0\22\35\3\36\13\0\22\35\2\36\14\0"+
    "\15\35\1\0\3\35\1\0\2\36\14\0\64\35\40\36\3\0\1\35"+
    "\3\0\2\35\1\36\2\0\12\37\41\0\3\36\2\0\12\37\6\0"+
    "\130\35\10\0\51\35\1\36\1\35\5\0\106\35\12\0\35\35\3\0"+
    "\14\36\4\0\14\36\12\0\12\37\36\35\2\0\5\35\13\0\54\35"+
    "\4\0\21\36\7\35\2\36\6\0\12\37\46\0\27\35\5\36\4\0"+
    "\65\35\12\36\1\0\35\36\2\0\1\36\12\37\6\0\12\37\15\0"+
    "\1\35\130\0\5\36\57\35\21\36\7\35\4\0\12\37\21\0\11\36"+
    "\14\0\3\36\36\35\15\36\2\35\12\37\54\35\16\36\14\0\44\35"+
    "\24\36\10\0\12\37\3\0\3\35\12\37\44\35\122\0\3\36\1\0"+
    "\25\36\4\35\1\36\4\35\3\36\2\35\11\0\300\35\47\36\25\0"+
    "\4\36\u0116\35\2\0\6\35\2\0\46\35\2\0\6\35\2\0\10\35"+
    "\1\0\1\35\1\0\1\35\1\0\1\35\1\0\37\35\2\0\65\35"+
    "\1\0\7\35\1\0\1\35\3\0\3\35\1\0\7\35\3\0\4\35"+
    "\2\0\6\35\4\0\15\35\5\0\3\35\1\0\7\35\16\0\5\36"+
    "\30\0\1\6\1\6\5\36\20\0\2\35\23\0\1\35\13\0\5\36"+
    "\5\0\6\36\1\0\1\35\15\0\1\35\20\0\15\35\3\0\33\35"+
    "\25\0\15\36\4\0\1\36\3\0\14\36\21\0\1\35\4\0\1\35"+
    "\2\0\12\35\1\0\1\35\3\0\5\35\6\0\1\35\1\0\1\35"+
    "\1\0\1\35\1\0\4\35\1\0\13\35\2\0\4\35\5\0\5\35"+
    "\4\0\1\35\21\0\51\35\u0a77\0\57\35\1\0\57\35\1\0\205\35"+
    "\6\0\4\35\3\36\2\35\14\0\46\35\1\0\1\35\5\0\1\35"+
    "\2\0\70\35\7\0\1\35\17\0\1\36\27\35\11\0\7\35\1\0"+
    "\7\35\1\0\7\35\1\0\7\35\1\0\7\35\1\0\7\35\1\0"+
    "\7\35\1\0\7\35\1\0\40\36\57\0\1\35\u01d5\0\3\35\31\0"+
    "\11\35\6\36\1\0\5\35\2\0\5\35\4\0\126\35\2\0\2\36"+
    "\2\0\3\35\1\0\132\35\1\0\4\35\5\0\51\35\3\0\136\35"+
    "\21\0\33\35\65\0\20\35\u0200\0\u19b6\35\112\0\u51cd\35\63\0\u048d\35"+
    "\103\0\56\35\2\0\u010d\35\3\0\20\35\12\37\2\35\24\0\57\35"+
    "\1\36\4\0\12\36\1\0\31\35\7\0\1\36\120\35\2\36\45\0"+
    "\11\35\2\0\147\35\2\0\4\35\1\0\4\35\14\0\13\35\115\0"+
    "\12\35\1\36\3\35\1\36\4\35\1\36\27\35\5\36\20\0\1\35"+
    "\7\0\64\35\14\0\2\36\62\35\21\36\13\0\12\37\6\0\22\36"+
    "\6\35\3\0\1\35\4\0\12\37\34\35\10\36\2\0\27\35\15\36"+
    "\14\0\35\35\3\0\4\36\57\35\16\36\16\0\1\35\12\37\26\0"+
    "\12\33\6\0\51\35\16\36\11\0\3\35\1\36\10\35\2\36\2\0"+
    "\12\37\6\0\27\35\3\0\1\35\1\36\4\0\60\35\1\36\1\35"+
    "\3\36\2\35\2\36\5\35\2\36\1\35\1\36\1\35\30\0\3\35"+
    "\2\0\13\35\5\36\2\0\3\35\2\36\12\0\6\35\2\0\6\35"+
    "\2\0\6\35\11\0\7\35\1\0\7\35\221\0\43\35\10\36\1\0"+
    "\2\36\2\0\12\37\6\0\u2ba4\35\14\0\27\35\4\0\61\35\u2104\0"+
    "\u016e\35\2\0\152\35\46\0\7\35\14\0\5\35\5\0\1\35\1\36"+
    "\12\35\1\0\15\35\1\0\5\35\1\0\1\35\1\0\2\35\1\0"+
    "\2\35\1\0\154\35\41\0\u016b\35\22\0\100\35\2\0\66\35\50\0"+
    "\15\35\3\0\20\36\20\0\7\36\14\0\2\35\30\0\3\35\31\0"+
    "\1\35\6\0\5\35\1\0\207\35\2\0\1\36\4\0\1\35\13\0"+
    "\12\37\7\0\32\35\4\0\1\35\1\0\32\35\13\0\131\35\3\0"+
    "\6\35\2\0\6\35\2\0\6\35\2\0\3\35\3\0\2\35\3\0"+
    "\2\35\22\0\3\36\4\0\14\35\1\0\32\35\1\0\23\35\1\0"+
    "\2\35\1\0\17\35\2\0\16\35\42\0\173\35\105\0\65\35\210\0"+
    "\1\36\202\0\35\35\3\0\61\35\57\0\37\35\21\0\33\35\65\0"+
    "\36\35\2\0\44\35\4\0\10\35\1\0\5\35\52\0\236\35\2\0"+
    "\12\37\u0356\0\6\35\2\0\1\35\1\0\54\35\1\0\2\35\3\0"+
    "\1\35\2\0\27\35\252\0\26\35\12\0\32\35\106\0\70\35\6\0"+
    "\2\35\100\0\1\35\3\36\1\0\2\36\5\0\4\36\4\35\1\0"+
    "\3\35\1\0\33\35\4\0\3\36\4\0\1\36\40\0\35\35\203\0"+
    "\66\35\12\0\26\35\12\0\23\35\215\0\111\35\u03b7\0\3\36\65\35"+
    "\17\36\37\0\12\37\20\0\3\36\55\35\13\36\2\0\1\36\22\0"+
    "\31\35\7\0\12\37\6\0\3\36\44\35\16\36\1\0\12\37\100\0"+
    "\3\36\60\35\16\36\4\35\13\0\12\37\u0116\0\12\33\u0156\0\12\33"+
    "\166\0\12\33\u0176\0\12\33\46\0\53\35\15\36\10\0\12\37\146\0"+
    "\12\33\u01a6\0\12\33\u0366\0\12\33\u03a6\0\u036f\35\221\0\143\35\u0b9d\0"+
    "\u042f\35\u33d1\0\u0239\35\47\0\12\33\346\0\12\33\u03a6\0\105\35\13\0"+
    "\1\35\56\36\20\0\4\36\15\35\u4060\0\2\35\u2163\0\5\36\3\0"+
    "\26\36\2\0\7\36\36\0\4\36\224\0\3\36\u01bb\0\125\35\1\0"+
    "\107\35\1\0\2\35\2\0\1\35\2\0\2\35\2\0\4\35\1\0"+
    "\14\35\1\0\1\35\1\0\7\35\1\0\101\35\1\0\4\35\2\0"+
    "\10\35\1\0\7\35\1\0\34\35\1\0\4\35\1\0\5\35\1\0"+
    "\1\35\3\0\7\35\1\0\u0154\35\2\0\31\35\1\0\31\35\1\0"+
    "\37\35\1\0\31\35\1\0\37\35\1\0\31\35\1\0\37\35\1\0"+
    "\31\35\1\0\37\35\1\0\31\35\1\0\10\35\2\0\62\37\u1150\0"+
    "\12\33\u04a6\0\4\35\1\0\33\35\1\0\2\35\1\0\1\35\2\0"+
    "\1\35\1\0\12\35\1\0\4\35\1\0\1\35\1\0\1\35\6\0"+
    "\1\35\4\0\1\35\1\0\1\35\1\0\1\35\1\0\3\35\1\0"+
    "\2\35\1\0\1\35\2\0\1\35\1\0\1\35\1\0\1\35\1\0"+
    "\1\35\1\0\1\35\1\0\2\35\1\0\1\35\2\0\4\35\1\0"+
    "\7\35\1\0\4\35\1\0\4\35\1\0\1\35\1\0\12\35\1\0"+
    "\21\35\5\0\3\35\1\0\5\35\1\0\21\35\u1144\0\ua6d7\35\51\0"+
    "\u1035\35\13\0\336\35\u3fe2\0\u021e\35\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\36\36\0\140\36\200\0\360\36\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\12\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\0\1\6\1\14"+
    "\4\6\1\15\2\6\1\0\1\16\1\17\4\6\1\20"+
    "\1\6\1\21\1\22\1\6\1\23\1\24\1\6\1\25"+
    "\3\6\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\41\0\41\0\41\0\102\0\143\0\204"+
    "\0\245\0\306\0\347\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c"+
    "\0\u01ad\0\41\0\41\0\41\0\41\0\u01ce\0\u01ef\0\u0210"+
    "\0\245\0\u0231\0\u0252\0\u0273\0\u0294\0\245\0\u02b5\0\u02d6"+
    "\0\u02f7\0\41\0\245\0\u0318\0\u0339\0\u035a\0\u037b\0\245"+
    "\0\u039c\0\u02f7\0\245\0\u03bd\0\245\0\245\0\u03de\0\245"+
    "\0\u03ff\0\u0420\0\u0441\0\245";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\0\1\10"+
    "\1\11\1\12\1\13\1\11\1\14\1\11\1\15\1\11"+
    "\1\16\1\17\1\20\1\11\1\21\1\11\1\22\1\23"+
    "\1\24\1\25\1\26\1\2\1\11\1\2\1\26\1\7"+
    "\41\0\5\27\3\0\31\27\5\0\1\7\32\0\1\7"+
    "\7\0\2\11\1\30\15\11\6\0\3\11\10\0\20\11"+
    "\6\0\3\11\10\0\13\11\1\31\4\11\6\0\3\11"+
    "\10\0\5\11\1\32\12\11\6\0\3\11\10\0\4\11"+
    "\1\33\13\11\6\0\3\11\10\0\11\11\1\34\6\11"+
    "\6\0\3\11\10\0\13\11\1\35\4\11\6\0\3\11"+
    "\10\0\16\11\1\36\1\11\6\0\3\11\10\0\3\11"+
    "\1\37\14\11\6\0\3\11\10\0\17\11\1\40\6\0"+
    "\3\11\34\0\1\26\1\41\2\0\1\26\5\0\1\42"+
    "\43\0\3\11\1\43\14\11\6\0\3\11\10\0\6\11"+
    "\1\44\11\11\6\0\3\11\10\0\4\11\1\45\13\11"+
    "\6\0\3\11\10\0\6\11\1\46\11\11\6\0\3\11"+
    "\10\0\13\11\1\47\4\11\6\0\3\11\10\0\4\11"+
    "\1\50\13\11\6\0\3\11\10\0\2\11\1\51\15\11"+
    "\6\0\3\11\34\0\1\52\3\0\1\52\10\0\7\11"+
    "\1\53\10\11\6\0\3\11\10\0\6\11\1\54\11\11"+
    "\6\0\3\11\10\0\4\11\1\55\13\11\6\0\3\11"+
    "\10\0\7\11\1\56\10\11\6\0\3\11\10\0\10\11"+
    "\1\57\7\11\6\0\3\11\10\0\15\11\1\60\2\11"+
    "\6\0\3\11\10\0\3\11\1\61\14\11\6\0\3\11"+
    "\10\0\1\11\1\62\16\11\6\0\3\11\10\0\13\11"+
    "\1\63\4\11\6\0\3\11\10\0\2\11\1\64\15\11"+
    "\6\0\3\11\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1122];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\4\11\14\1\4\11\1\1\1\0\11\1\1\0"+
    "\1\11\22\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
 public int linea(){return yyline+1;}
 public int columna(){ return yycolumn+1;}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2890) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Error en l�xico."+yytext()+"-");
            } 
            // fall through
          case 23: break;
          case 2: 
            { return new Symbol(sym.PTOYCOMA);
            } 
            // fall through
          case 24: break;
          case 3: 
            { return new Symbol(sym.ABREPAR);
            } 
            // fall through
          case 25: break;
          case 4: 
            { return new Symbol(sym.CIERRAPAR);
            } 
            // fall through
          case 26: break;
          case 5: 
            { ;
            } 
            // fall through
          case 27: break;
          case 6: 
            { return new Symbol(sym.ID, yytext());
            } 
            // fall through
          case 28: break;
          case 7: 
            { return new Symbol(sym.ABRECOR);
            } 
            // fall through
          case 29: break;
          case 8: 
            { return new Symbol(sym.CIERRACOR);
            } 
            // fall through
          case 30: break;
          case 9: 
            { return new Symbol(sym.DOSPUNTOS);
            } 
            // fall through
          case 31: break;
          case 10: 
            { return new Symbol(sym.COMA);
            } 
            // fall through
          case 32: break;
          case 11: 
            { return new Symbol(sym.NUM, new Integer(yytext()));
            } 
            // fall through
          case 33: break;
          case 12: 
            { return new Symbol(sym.TO);
            } 
            // fall through
          case 34: break;
          case 13: 
            { return new Symbol(sym.OF);
            } 
            // fall through
          case 35: break;
          case 14: 
            { return new Symbol(sym.CARACTER);
            } 
            // fall through
          case 36: break;
          case 15: 
            { return new Symbol(sym.INTEGER);
            } 
            // fall through
          case 37: break;
          case 16: 
            { return new Symbol(sym.POINTER);
            } 
            // fall through
          case 38: break;
          case 17: 
            { return new Symbol(sym.NUMREAL, new Float(yytext()));
            } 
            // fall through
          case 39: break;
          case 18: 
            { return new Symbol(sym.REAL);
            } 
            // fall through
          case 40: break;
          case 19: 
            { return new Symbol(sym.CHAR);
            } 
            // fall through
          case 41: break;
          case 20: 
            { return new Symbol(sym.BOOLEAN);
            } 
            // fall through
          case 42: break;
          case 21: 
            { return new Symbol(sym.ARRAY);
            } 
            // fall through
          case 43: break;
          case 22: 
            { return new Symbol(sym.PROCEDURE);
            } 
            // fall through
          case 44: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
