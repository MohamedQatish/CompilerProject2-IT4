package ANTLR;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;


@SuppressWarnings("CheckReturnValue")
public class AngularParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements AngularParserVisitor<T> {

	@Override public T visitProgram(AngularParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitEos(AngularParser.EosContext ctx) { return visitChildren(ctx); }

	@Override public T visitImportStatement(AngularParser.ImportStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitImportFromBlock(AngularParser.ImportFromBlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitModuleItems(AngularParser.ModuleItemsContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatment(AngularParser.StatmentContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitReturnStatement(AngularParser.ReturnStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitExportStatement(AngularParser.ExportStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariableStatement(AngularParser.VariableStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarModifier(AngularParser.VarModifierContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignable(AngularParser.AssignableContext ctx) { return visitChildren(ctx); }

	@Override public T visitSingleExpression(AngularParser.SingleExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitSingleExpressionCss(AngularParser.SingleExpressionCssContext ctx) { return visitChildren(ctx); }

	@Override public T visitForstatment(AngularParser.ForstatmentContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunctionCall(AngularParser.FunctionCallContext ctx) { return visitChildren(ctx); }

	@Override public T visitDirective(AngularParser.DirectiveContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfStatement(AngularParser.IfStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatementBlock(AngularParser.StatementBlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitComponentAttributes(AngularParser.ComponentAttributesContext ctx) { return visitChildren(ctx); }

	@Override public T visitComponentAttribute(AngularParser.ComponentAttributeContext ctx) { return visitChildren(ctx); }

	@Override public T visitSelectorDeclaration(AngularParser.SelectorDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitImportsDeclaration(AngularParser.ImportsDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitStylesDeclaration(AngularParser.StylesDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitClassBody(AngularParser.ClassBodyContext ctx) { return visitChildren(ctx); }

	@Override public T visitTemplateStatement(AngularParser.TemplateStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitHtmlElements(AngularParser.HtmlElementsContext ctx) { return visitChildren(ctx); }

	@Override public T visitHtmlElement(AngularParser.HtmlElementContext ctx) { return visitChildren(ctx); }

	@Override public T visitHtmlContent(AngularParser.HtmlContentContext ctx) { return visitChildren(ctx); }

	@Override public T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) { return visitChildren(ctx); }

	@Override public T visitMustacheExpression(AngularParser.MustacheExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx) { return visitChildren(ctx); }

	@Override public T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) { return visitChildren(ctx); }

	@Override public T visitIndexarray(AngularParser.IndexarrayContext ctx) { return visitChildren(ctx); }

	@Override public T visitArrayCss(AngularParser.ArrayCssContext ctx) { return visitChildren(ctx); }

	@Override public T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) { return visitChildren(ctx); }

	@Override public T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) { return visitChildren(ctx); }

	@Override public T visitLiteral(AngularParser.LiteralContext ctx) { return visitChildren(ctx); }
}