//package minijava;
/***
 * Excerpted from "The Definitive ANTLR Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr for more book information.
 ***/
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;

//import  minijava.parser.*;

public class TestHarness {
	
	public static void main(String[] args) throws Exception {
		for (String fn : args)
			try {
				parseFile(fn);
				System.out.println("Test case " + fn + " success");
			} catch (IOException e) {
				System.err.println("file not found: "+e.getMessage());
			} catch (RecognitionException e) {
				System.out.println("failure: "+e.getMessage());
			}
	}

	static void parseFile(String fileName)  throws RecognitionException, IOException {
		// create a CharStream that reads from standard input
		ANTLRFileStream input = new ANTLRFileStream(fileName);

		// create a lexer that feeds off of input CharStream
		Lexer lexer = new MinijavaLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		MinijavaParser parser = new MinijavaParser(tokens);

		// begin parsing at rule goal
		parser.program();
	}
}
