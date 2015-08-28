// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class SpliceAt extends ReqlExpr {


    public SpliceAt(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public SpliceAt(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public SpliceAt(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.SPLICE_AT, args, optargs);
    }
    protected SpliceAt(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static SpliceAt fromArgs(Object... args){
        return new SpliceAt(new Arguments(args), null);
    }


}