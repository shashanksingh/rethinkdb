// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class Point extends ReqlExpr {


    public Point(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Point(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Point(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.POINT, args, optargs);
    }
    protected Point(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Point fromArgs(Object... args){
        return new Point(new Arguments(args), null);
    }


}