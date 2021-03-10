# Sum numbers in a string

## Logical Rules

- Given a string as input, we need to be able to sum the numbers it contains.
- The first line of the string shall encompass the delimiters between the numbers we want to sum.

For instance:
``` 
//[delimiter]\n[numbers…]

"//;\n2;3;4;5;67;888" -> this shall return 2+3+4+5+67+888

"//x\n1x2x3x4x5x6x7x8x9x90" -> this shall return 1+2+3+4+5+6+7+8+9+90

"//[x][y]\n1x2y5x9y10 -> this shall return 1+2+5+9+10
```
That input shall return the sum of all the numbers separated by `;`

- The default delimiter is `,`
- We only want to sum numbers that are smaller than 1001
- We only allow positive numbers
- We need to be able to sum numbers even if they are in different lines. So the following string `1\n2,3` shall return 6
- We need to be able to define more than one delimiter in the following way `//[delim1][delim2]\n`


## Coding Rules

- The input string shall be read from a file whose path is specified in a config
- If the string is invalid we need to log a specific error to a file

- Each line of code shall have a comment explaining the thought behind it
- Tests are mandatory, as well as code coverage above 90%