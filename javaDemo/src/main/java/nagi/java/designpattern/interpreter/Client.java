package nagi.java.designpattern.interpreter;

/**
 *解释器模式
 * Context 环境角色，含有解释器之外的全局信息
 * AbstractExpression 抽象表达式，声明一个抽象的解释操作，这个方法为抽象语法树中所有节点共享
 * TerminalExpression 终结符表达式，实现文法中的终结符相关的解释操作
 * NonTerminalExpression 非终结符表达式，为文法中的非终结符实现解释操作
 */
public class Client {
    public static void main(String[] args) {

    }
}
