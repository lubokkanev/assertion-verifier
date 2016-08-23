package com.nvl.verificator;

import com.nvl.variable.Variable;

import java.util.Set;

public interface AssertionVerificator {
    void addVariable(String variableDefinition);

    void updateVariable(String variableDefinition);

    boolean evaluateStatement(String statement);

    Set<Variable> variables();
}
