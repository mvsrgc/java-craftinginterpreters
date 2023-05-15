package com.craftinginterpreters.lox;

abstract class Expr {
    static class Binary extends Expr {
        private Expr left;
        private Token operator;
        private Expr right;

        public Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }
    }
}
