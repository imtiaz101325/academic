//Parentheses matching: We often have a expressions involving "()[]{}" that requires that the
//different types parentheses are balanced. For example, the following are properly balanced:
//(a (b + c) + d)
//[ (a b) (c d) ]
//( [a {x y} b] )
//But the following are not:
//(a (b + c) + d
//[ (a b] (c d) )
//( [a {x y) b] )
//The algorithm may be written as the following:
//begin with an empty stack and an input stream (for the expression).
//while there is more input to read, do:
// read the next input character;
// if it's an opening parenthesis/brace/bracket ("(" or "{" or "[")
// then push it onto the stack;
// if it's a closing parenthesis/brace/bracket (")" or "}" or "]")
// then pop the opening symbol from stack;
// compare the closing with opening symbol;
// if it matches
// then continue with next input character;
// if it does not match
// then return false;
//end while;
//// all matched, so return true
//return true;