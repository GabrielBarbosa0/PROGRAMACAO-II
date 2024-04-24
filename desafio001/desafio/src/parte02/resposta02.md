Parte 2 - Suponha que i = 1, j = 2, k = 3 e m = 2. O que cada uma das seguintes instruções
imprime?

a) System.out.println(i == 1);
Isso imprimirá true se i for igual a 1, e false caso contrário. Como i é igual a 1, a saída será true.

b) System.out.println(j == 3);
Isso imprimirá true se j for igual a 3, e false caso contrário. Como j é igual a 2, a saída será false.

c) System.out.println((i >= 1) && (j < 4));
Isso imprimirá true se i for maior ou igual a 1 e j for menor que 4, e false caso contrário. Como i é igual a 1 (maior ou igual a 1) e j é igual a 2 (menor que 4), ambas as condições são verdadeiras, então a saída será true.

d) System.out.println((m <= 99) & (k < m));
Aqui, a expressão dentro do println usa o operador &, que é o AND bitwise. Isso significa que ambas as expressões dentro dos parênteses serão avaliadas, independentemente do resultado da primeira.
Como m é igual a 2 e k é igual a 3, (m <= 99) é verdadeiro e (k < m) é falso. O resultado do AND bitwise entre true e false é false. Portanto, a saída será false.

e) System.out.println((j >= i) || (k == m));
Isso imprimirá true se j for maior ou igual a i ou se k for igual a m, e false caso contrário. Como j é igual a 2 (maior ou igual a i, que é 1), uma das condições é verdadeira, então a saída será true.

f) System.out.println((k + m < j) | (3 - j >= k));
Aqui, a expressão dentro do println usa o operador |, que é o OR bitwise. Isso significa que ambas as expressões dentro dos parênteses serão avaliadas, independentemente do resultado da primeira.
(k + m < j) é false (pois k + m é 5 e j é 2, então 5 não é menor que 2) e (3 - j >= k) é true (pois 3 - j é 1 e 1 é maior ou igual a k, que é 3).
O resultado do OR bitwise entre false e true é true. Portanto, a saída será true.

g) System.out.println(!(k > m));
Isso imprimirá true se k não for maior que m, e false caso contrário. Como k é igual a 3 e m é igual a 2, k é maior que m, então a negação de true é false. Portanto, a saída será false.