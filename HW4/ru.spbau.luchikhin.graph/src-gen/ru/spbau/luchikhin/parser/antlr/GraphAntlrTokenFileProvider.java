/*
* generated by Xtext
*/
package ru.spbau.luchikhin.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GraphAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.tokens");
	}
}
