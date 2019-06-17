package com.epam.algorithms.hw1;

public class BalanceStringChecker {

    public boolean isBalanced(String str) {

        LinkedListPrototype<Character> bracketsStack = new LinkedListPrototype<>();

        for (char chr : str.toCharArray()) {
            boolean isEmpty = bracketsStack.size() == 0;
            switch (chr) {

                case '{':
                case '(':
                case '[':
                    bracketsStack.addFirst(chr);
                    break;

                case ']':
                    if (isEmpty || (bracketsStack.removeFirst()) != '[')
                        return false;
                    break;
                case ')':
                    if (isEmpty || (bracketsStack.removeFirst()) != '(')
                        return false;
                    break;
                case '}':
                    if (isEmpty || (bracketsStack.removeFirst()) != '{')
                        return false;
                    break;
            }
        }
        return bracketsStack.size() == 0;
    }
}
