/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTUnparsedText.java */

package net.sourceforge.pmd.lang.jsp.ast;

public class ASTUnparsedText extends AbstractJspNode {
    public ASTUnparsedText(int id) {
        super(id);
    }

    public ASTUnparsedText(JspParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}