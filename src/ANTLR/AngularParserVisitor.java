// Generated from C:/Users/Gadee/Desktop/Compiler/CompilerProject/src/ANTLR/AngularParser.g4 by ANTLR 4.13.2
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;


public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {

	T visitProgram(AngularParser.ProgramContext ctx);

	T visitEos(AngularParser.EosContext ctx);

	T visitImportStatement(AngularParser.ImportStatementContext ctx);

	T visitImportFromBlock(AngularParser.ImportFromBlockContext ctx);

	T visitModuleItems(AngularParser.ModuleItemsContext ctx);

	T visitStatment(AngularParser.StatmentContext ctx);

	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);

	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);

	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);

	T visitExportStatement(AngularParser.ExportStatementContext ctx);

	T visitVariableStatement(AngularParser.VariableStatementContext ctx);

	T visitVarModifier(AngularParser.VarModifierContext ctx);

	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);

	T visitAssignable(AngularParser.AssignableContext ctx);

	T visitSingleExpression(AngularParser.SingleExpressionContext ctx);

	T visitSingleExpressionCss(AngularParser.SingleExpressionCssContext ctx);

	T visitForstatment(AngularParser.ForstatmentContext ctx);

	T visitFunctionCall(AngularParser.FunctionCallContext ctx);

	T visitDirective(AngularParser.DirectiveContext ctx);

	T visitIfStatement(AngularParser.IfStatementContext ctx);

	T visitStatementBlock(AngularParser.StatementBlockContext ctx);

	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);

	T visitComponentAttributes(AngularParser.ComponentAttributesContext ctx);

	T visitComponentAttribute(AngularParser.ComponentAttributeContext ctx);

	T visitSelectorDeclaration(AngularParser.SelectorDeclarationContext ctx);

	T visitStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx);

	T visitImportsDeclaration(AngularParser.ImportsDeclarationContext ctx);

	T visitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx);

	T visitStylesDeclaration(AngularParser.StylesDeclarationContext ctx);

	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);

	T visitClassBody(AngularParser.ClassBodyContext ctx);

	T visitTemplateStatement(AngularParser.TemplateStatementContext ctx);

	T visitHtmlElements(AngularParser.HtmlElementsContext ctx);

	T visitHtmlElement(AngularParser.HtmlElementContext ctx);

	T visitHtmlContent(AngularParser.HtmlContentContext ctx);

	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);

	T visitMustacheExpression(AngularParser.MustacheExpressionContext ctx);

	T visitHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx);

	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);

	T visitIndexarray(AngularParser.IndexarrayContext ctx);

	T visitArrayCss(AngularParser.ArrayCssContext ctx);

	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);

	T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);

	T visitLiteral(AngularParser.LiteralContext ctx);
}