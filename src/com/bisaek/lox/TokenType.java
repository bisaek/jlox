package com.bisaek.lox;

public enum TokenType {
    // Single character tokens
    LEFT_PAREN, RIGHT_PAREN,
    LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // operators / One  or two character tokens
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals
    IDENTIFIER, STRING, NUMBER,

    // Keywords
    AND, OR,
    IF, ELSE,
    FALSE, TRUE,
    FUN, CLASS, RETURN, SUPER, THIS,
    FOR, WHILE,
    NIL,
    PRINT,

    EOF

}
