package com.craftinginterpreters.tool;

import java.io.IOException;
import java.util.Arrays;

public class GenerateAst {
    public static void main(String[] args)  throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: generate_ast <output directory>");
            System.exit(1);
        }
        String outputDir = args[0];
        
        System.out.println(outputDir);
        
        /*
        defineAst(outputDir, "Expr", Arrays.asList(
            "Binary   : Expr left, Token operator, Expr right",
            "Grouping : Expr expresion",
            "Literal  : Object value",
            "Unary    : Token operator, Expr right"
        ));
        */
    } 
}
