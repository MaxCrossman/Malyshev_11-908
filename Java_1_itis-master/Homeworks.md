# Домашки
## 1. Календарь (1 балл)
Вывести название месяца по его порядковому значению.
## 2. Число π (1 балл)
Для заданного с клавиатуры числа n вычислите число π используя ряд Лейбница
<img src="https://latex.codecogs.com/png.latex?1-\frac13+\frac15-\frac17+\dots=\sum_{i=0}^\infty\frac{\left(-1\right)^i}{2i+1}=\frac\pi4\text{.}" />

Сравните полученное значение со значением ```Math.PI``` в процентах.
## 3. Треугольник (1 балл)
Для заданного с клавиатуры числа n вывести треугольник:
```text
Enter the size: 8
#
# #
# # #
# # # #
# # # # #
# # # # # #
# # # # # # #
# # # # # # # #
```
Используется вложенные циклы и оператор if.
## 4. Таблица умножения (1 балл)
Для введенного с клавиатуры числа n вывести таблицу умножения.
```text
Enter the size: 10
 * |   1   2   3   4   5   6   7   8   9  10
--------------------------------------------
 1 |   1   2   3   4   5   6   7   8   9  10
 2 |   2   4   6   8  10  12  14  16  18  20
 3 |   3   6   9  12  15  18  21  24  27  30
 4 |   4   8  12  16  20  24  28  32  36  40
 5 |   5  10  15  20  25  30  35  40  45  50
 6 |   6  12  18  24  30  36  42  48  54  60
 7 |   7  14  21  28  35  42  49  56  63  70
 8 |   8  16  24  32  40  48  56  64  72  80
 9 |   9  18  27  36  45  54  63  72  81  90
10 |  10  20  30  40  50  60  70  80  90 100
```
Используется вложенные циклы и оператор if.

## 5. Шифровщик Цезаря (1 балл)
Написать программу-шифровщик используя метод Цезаря.
С клавиатуры вводится текст и сдвиг (класс Scanner).

## 6. Работа с массивами (1 балл)
Реализовать все предложенные методы в [Lesson_7.java](../master/src/stud/Lesson_7.java).
* Первое вхождение экстремального элемента.
* Отсортировать массив таким образом, что сначала идут четные номера элемента, затем нечетные. (А_2, А_4, А_1, А_3).
* Найти максимальный/минимальный элемент среди четных/нечетных
* Найти количество участков массива, на которых его элементы монотонно убывают.
* Поменять местами содержимое двух заданных массивов.
* У заданного массива осуществить циклический сдвиг на N вправо.
* Добавить нулевой элемент после максимального и минимального элемента массива.

## 7. Работа с двумерными массивами (3 балла)
*Тут несколько заданий, поэтому за это дз 3 балла.*
Реализовать все предложенные методы в [Lesson_8.java](../master/src/stud/Lesson_8.java).
А именно задания:
* Matrix17. Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Найти сумму и произведение элементов K-й строки данной матрицы.
* Matrix20. Дана матрица размера M × N. Для каждого столбца матрицы найти произведение его элементов.
* Matrix27. Дана матрица размера M × N. Найти максимальный среди минимальных элементов ее строк.
* Matrix41. Дана целочисленная матрица размера M × N. Найти номер первого из ее столбцов, содержащих максимальное количество одинаковых
элементов.
* Matrix47. Дана матрица размера M × N и целые числа K1 и K2 (1 ≤ K1 < K2 ≤ M). Поменять местами строки матрицы с номерами K1 и K2.
* Matrix61. Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Удалить строку матрицы с номером K.
* Matrix88. Дана квадратная матрица порядка M. Обнулить элементы матрицы, лежащие ниже главной диагонали. Условный оператор не использовать.

из [задачника](../master/Электронный%20задачник%20по%20программированию.pdf).

*При выполнении заданий из данного пункта (47-79) не следует использовать вспомогательные двумерные массивы матрицы. Кроме того, задача не в выводе нужной матрицы, а получение новой.*


## 8. Реализовать метод Гаусса решения СЛАУ.  (5 баллов)
[Теория](https://zaochnik.com/spravochnik/matematika/issledovanie-slau/metod-gaussa/)
Тестовый пример из примера 4.

<img alt="A = \left( \begin{array}{cccc} 3 &amp; 2 &amp; 1 &amp; 1 \\ 1 &amp; -1 &amp; 4 &amp; -1 \\ -2 &amp; -2 &amp; -3 &amp; 1 \\ 1 &amp; 5 &amp; -1 &amp; 2 \\ \end{array} \right), b = \left( \begin{array}{cccc} -2 \\ -1 \\ 9 \\ 4 \\ \end{array} \right)\\ x_1 = -3, x_2 = -1, x_3 = 2, x_4 = 7." src="https://latex.codecogs.com/gif.latex?A%20%3D%20%5Cleft%28%20%5Cbegin%7Barray%7D%7Bcccc%7D%203%20%26%202%20%26%201%20%26%201%20%5C%5C%201%20%26%20-1%20%26%204%20%26%20-1%20%5C%5C%20-2%20%26%20-2%20%26%20-3%20%26%201%20%5C%5C%201%20%26%205%20%26%20-1%20%26%202%20%5C%5C%20%5Cend%7Barray%7D%20%5Cright%29%2C%20b%20%3D%20%5Cleft%28%20%5Cbegin%7Barray%7D%7Bcccc%7D%20-2%20%5C%5C%20-1%20%5C%5C%209%20%5C%5C%204%20%5C%5C%20%5Cend%7Barray%7D%20%5Cright%29%5C%5C%20x_1%20%3D%20-3%2C%20x_2%20%3D%20-1%2C%20x_3%20%3D%202%2C%20x_4%20%3D%207.">

## 9. Работа со строками  (2 балла)
 * String41. Дана строка, состоящая из русских слов, разделенных пробелами (одним или несколькими). Найти количество слов в строке.
 * String42. Дана строка, состоящая из русских слов, набранных заглавными буквами и разделенных пробелами (одним или несколькими). Найти количество слов, которые начинаются и заканчиваются одной и той же буквой.
 * String52. Дана строка-предложение на русском языке. Преобразовать строку так, чтобы каждое слово начиналось с заглавной буквы. *Словом* считать набор символов, не содержащий пробелов и ограниченный пробелами или началом/концом строки. Слова, не начинающиеся с буквы, не изменять.
 * String54. Дана строка-предложение на русском языке. Подсчитать количество содержащихся в строке гласных букв.
 * String57. Дана строка-предложение с избыточными пробелами между словами. Преобразовать ее так, чтобы между словами был ровно один пробел.
 * String58. Дана строка, содержащая полное имя файла, то есть имя диска, список каталогов (путь), собственно имя и расширение. Выделить из этой строки имя файла (без расширения).
 * String59. Дана строка, содержащая полное имя файла, то есть имя диска, список каталогов (путь), собственно имя и расширение. Выделить из этой строки расширение файла (без предшествующей точки).
 * String69. Дана строка, содержащая латинские буквы и круглые скобки. Если скобки расставлены правильно (то есть каждой открывающей соответствует одна закрывающая), то вывести число 0. В противном случае вывести или номер позиции, в которой расположена первая ошибочная закрывающая скобка, или, если закрывающих скобок не хватает, число -1.


## 10. Регулярные выражения (1 балл)
Написать регулярное выражение, которое по введенному полному пути файла, определяет является ли файл рисунком. Если является выводит в первой группе название файла, во второй расширение.
Пример пути:
"C:\Users\Администратор\Documents\NetBeansProjects\JavaLessonsProject\README.md"
"C:\Users\Администратор\Documents\NetBeansProjects\JavaLessonsProject\image.jpg"

## 11. Добавить к методу Гаусса, чтение матрицы из файла.  (1 балл)
[matrix4gauss.txt](../master/src/stud/matrix4gauss.txt).

## 12. Создать классы с наследниками
Car->Bus->TrolleyBus
В базовом классе есть поля:
String model, Color color, int MaxSpeed, double power, double trunkCapacity, Point point.
Для каждого поля есть геттеры, для цвета есть сеттер.
Также есть два метода, print и move.
В классах наследниках добавьте по одному полю к автобусу (например, число пассажирских мест) и к троллейбусу (например, электрическая тяга).
Перегрузите метод print() у классов наследников.

## 13. Выполнить задания 44-49 из [файла](../master/ITIS-Inf-11-801-1k-1s-Homework.docx).
###44
Реализовать модель игры – игроки последовательно друг другу наносят удары силой от 1 до 9, при этом у того, кого ударили, из очков здоровья (health points, hp) отнимается сила удара. Игра заканчивается, когда hp одного из игроков стало <= 0. В задаче должны быть классы Игрок и Игра, в которой весь процесс происходит. У каждого игрока есть имя и hp. Сила удара каждого игрока на каждом шаге вводится из консоли. Процесс игры должен принадлежать объекту класса Игра.

###45
В задаче 44 добавить вероятностное распределение – сила удара обратна пропорциональна вероятности попасть. Можно выполнить эту задачу полностью в папке этого задания, тогда 44 будет зачтена.

###46
Класс Vector2D - двумерный вектор. Атрибуты - два вещественных числа (координаты). Далее (здесь и в последующих подобных задачах) указываю методы с типом возвращамых значений, а в скобках пишу только типы параметров. get- и set- методы создавать по необходимости (тоже здесь и далее).
*	Vector2D() - конструктор для нулевого вектора;
*	Vector2D(double, double) - конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
*	Vector2D add(Vector2D) - сложение вектора с другим вектором, результат возвращается как новый объект.
*	void add2(Vector2D) - сложение вектора с другим вектором, результат сохраняется в том, у кого был вызван этот метод;
*	Vector2D sub(Vector2D) - вычитание из вектора другого вектора, результат возвращается как новый объект;
*	void sub2(Vector2D) - вычитание из вектора другого вектора, результат сохраняется в том векторе, у кого был вызван этот метод;
*	Vector2D mult(double) - умножение вектора на вещественное число, результат возвращается как новый объект;
*	void mult2(double) - умножение вектора на вещественное число, результат сохраняется в векторе;

*	String toString() - строковое представление вектора;
*	double length() - длина вектора;
*	double scalarProduct(Vector2D) - скалярное произведение вектора на другой вектор;
*	double cos(Vector2D) - косинус угла между этим и другим вектором;
*	boolean equals(Vector2D) - сравнить вектор с другим вектором;

###47
Класс RationalFraction - рациональная дробь. Атрибуты - два целых числа (числитель и знаменатель). Методы:
*	RationalFraction() - конструктор для дроби, равной нулю;
*	RationalFraction(int, int) - конструктор дроби со значениями числителя и знаменателя; в конструкторах устраняйте дублирование кода;
*	void reduce() - сокращение дроби;
*	RationalFraction add(RationalFraction) - сложение дроби с другой дробью, результат возвращается как новый объект (не забудьте сократить)
*	void add2(RationalFraction) - сложение дроби с другой дробью, результат сохраняется в том, у кого был вызван этот метод (не забудьте сократить);
*	RationalFraction sub(RationalFraction) - вычитание из дроби другой дроби, результат возвращается как новый объект (не забудьте сократить);
*	void sub2(RationalFraction) - вычитание из дроби другой дроби, результат сохраняется в том, у кого был вызван этот метод (не забудьте сократить);
*	RationalFraction mult(RationalFraction) - умножение дроби на другую дробь, результат возвращается как новый объект (сократить)
*	void mult2(RationalFraction) - умножение дроби на другую дробь, результат сохраняется;
*	RationalFraction div(RationalFraction) - деление дроби на другую дробь, результат возвращается как новый объект (сократить)
*	void div2(RationalFraction) - деление дроби на другую дробь, результат сохраняется; больше не буду писать "возвращается" или "сохраняется", думаю, уже и так понятно.
*	String toString() - строковое представление дроби (например, -2/3);
*	double value() - десятичное значение дроби;
*	boolean equals(RationalFraction) - сравнить дробь с другой дробью
*	(не забывайте, что 2/4 и 1/2 - одна и та же дробь)
*	int numberPart() - целая часть дроби;

###48
Если вы не в теме, прочитайте: https://ru.wikipedia.org/wiki/Комплексное_число
Создать класс ComplexNumber - комплексное число. Атрибуты - действительная и мнимая части (два числа). Методы:
*	ComplexNumber() - конструктор для нулевого комплексного числа;
*	ComplexNumber(double, double) - конструктор комплексного числа с заданными значениями вещественной и мнимой части; в конструкторах устраняйте дублирование кода;
*	ComplexNumber add(ComplexNumber) - сложение комплексного числа с другим комплексным числом;
*	void add2(ComplexNumber) - сложение комплексного числа с другим комплексным числом;
*	CompexNumber sub(ComplexNumber) - вычитание из комплексного числа  другого комплексного числа;
*	void sub2(ComplexNumber) - вычитание из комплексного числа другого комплексного числа;
*	ComplexNumber multNumber(double) - умножение комплексного числа на вещественное число;
*	void multNumber2(double) - умножение комплексного числа на вещественное число;
*	ComplexNumber mult(ComplexNumber) - умножение комплексного числа на другое комплексное число;
*	void mult2(ComplexNumber) - умножение комплексного числа на другое комплексное число;
*	ComplexNumber div(ComplexNumber) - деление на другое комплексное число;
*	void div2(ComplexNumber) - деление на другое комплексное число;
*	double length() - модуль комплексного числа;
*	String toString() - строковое представление комплексного числа.  Только без всяких "2 * i + - 3". Проверяйте знаки, чтобы было красиво: 2 * i - 3.
*	double arg() - аргумент комплексного числа (может понадобиться тригонометрическое представление (читайте ссылку) и арктангенс Math.atan);
*	ComplexNumber pow(double) - возвести в степень по Формуле Муавра (иные способы запрещены). Внимание - разрешено использование Math.pow для возведения аргумента в степень (т.к. оба аргумента double), также вам понадобятся Math.cos, Math.sin.
*	boolean equals(ComplexNumber) - сравнить комплексное число с другим комплексным числом;

###49
Создать класс Matrix2x2 - двумерная матрица из вещественных чисел. Аргументы - содержимое матрицы (лучше, разумеется, хранить двумерным массивом, а то замучаетесь). Методы:
*	Matrix2x2() - конструктор для нулевой матрицы;
*	Matrix2x2(double) - конструктор для матрицы, у которой каждый элемент равен поданному числу;
*	Matrix2x2(double [][]) - конструктор для матрицы, содержимое подается на вход в виде массива;
*	Matrix2x2(double, double, double, double) - глупый конструктор, но пусть он будет. Сами знаете, что он делает. В конструкторах устраняйте дублирование кода;
*	Matrix2x2 add(Matrix2x2) - сложение матрицы с другой;
*	void add2(Matrix2x2) - сложение матрицы с другой;
*	Matrix2x2 sub(Matrix2x2) - вычитание из матрицы другой матрицы;
*	void sub2(Matrix2x2) - вычитание из матрицы другой матрицы;
*	Matrix2x2 multNumber(double) - умножение матрицы на вещественное число;
*	void multNumber2(double) - умножение матрицы на вещественное число;
*	Matrix2x2 mult(Matrix2x2) - умножение матрицы на другую матрицу;
*	void mult2(Matrix2x2) - умножение матрицы на другую матрицу;
*	double det() - определитель матрицы;
*	void transpon() - транспонировать матрицу;
*	Matrix2x2 inverseMatrix() - возвратить обратную матрицу для заданной. Если это невозможно, вывести сообщение об ошибке и вернуть нулевую матрицу (кто вдруг знает исключения, может их использовать).
*	Matrix2x2 equivalentDiagonal() - возвратить эквивалентную диагональную матрицу;
*	Vector2D multVector(Vector2D) - умножить матрицу на двумерный вектор (считая его столбцом) и возвратить получившийся столбец в виде вектора.

А теперь комбинируем! ^^
В дальнейших задачах все методы, которые делают операции (сложение, умножение и т.п.) всегда возвращают значения, void среди них нет. Все вспомогательные операции над компонентами должны опираться на операции, написанные в классах 46-49.


## 14. 2 задания из 50-56
Класс RationalVector2D - двумерный вектор, компоненты которого являются рациональными дробями (т.е. объектами класса RationalFraction). Это и есть атрибуты класса. Методы:
*	RationalVector2D() - конструктор для нулевого вектора (компоненты должны быть равны нулевым рациональным дробям);
*	RationalVector2D(RationalFraction, RationalFraction) - конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
*	RationalVector2D add(RationalVector2D) - сложение вектора с другим вектором;
*	String toString() - строковое представление вектора (использует строковое представление RationalFraсtion);
*	double length() - длина вектора;
*	RationalFraction scalarProduct(RationalVector2D) – скалярное произведение вектора на другой вектор;
*	boolean equals(RationalVector2D) - сравнить вектор с другим вектором (опираться на equals у RationalFraction);

###51
Класс ComplexVector2D - двумерный вектор, компоненты которого являются комплексными числами (т.е. объектами класса ComplexNumber). Это и есть атрибуты класса. Уже не буду писать, что надо в операциях опираться на методы класса ComplexNumber. Методы:
*	ComplexVector2D() - конструктор для нулевого вектора (компоненты должны быть равны нулевым комплексным числам);
*	ComplexVector2D(ComplexNumber, ComplexNumber) - конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
*	ComplexVector2D add(ComplexVector2D) - сложение вектора с другим вектором;
*	String toString() - строковое представление вектора.
*	ComplexNumber scalarProduct(ComplexVector2D) - скалярное произведение вектора на другой вектор;
*	boolean equals(ComplexVector2D) - сравнить вектор с другим вектором;

###52
Создать класс RationalMatrix2x2 - двумерная матрица из RationalFraction. Аргументы - содержимое матрицы (лучше разумеется хранить двумерным массивом, а то замучаетесь). Методы:
*	RationalMatrix2x2() - конструктор для нулевой матрицы;
*	RationalMatrix2x2(RationalFration) - конструктор для матрицы, у которой каждый элемент равен поданному числу;
*	RationalMatrix2x2(RationalFraсtion, RationalFraсtion, RationalFraсtion, RationalFraсtion) - конструктор на 4 дробях. В конструкторах устраняйте дублирование кода;
*	RationalMatrix2x2 add(RationalMatrix2x2) - сложение матрицы с другой;
*	RationalMatrix2x2 mult(RationalMatrix2x2) - умножение матрицы на другую матрицу;
*	RationalFraсtion det() - определитель матрицы;
*	RationalVector2D multVector(RationalVector2D) - умножить матрицу на двумерный вектор (считая его столбцом) и возвратить получившийся столбец в виде вектора.

###53
Создать класс ComplexMatrix2x2 - двумерная матрица из ComplexNumber. Аргументы - содержимое матрицы (лучше разумеется хранить двумерным массивом, а то замучаетесь). Методы:
*	ComplexMatrix2x2() - конструктор для нулевой матрицы;
*	ComplexMatrix2x2(ComplexNumber) - конструктор для матрицы, у которой каждый элемент равен поданному числу;
*	ComplexMatrix2x2(ComplexNumber, ComplexNumber,  ComplexNumber, ComplexNumber) - конструктор на 4 дробях, в конструкторах устраняйте дублирование кода;
*	ComplexMatrix2x2 add(ComplexMatrix2x2) - сложение матрицы с другой;
*	ComplexMatrix2x2 mult(ComplexMatrix2x2) - умножение матрицы на другую матрицу;
*	ComplexNumber det() - определитель матрицы;
*	ComplexVector2D multVector(ComplexVector2D) - умножить матрицу на двумерный комплекснозначный вектор (считая его столбцом) и возвратить получившийся столбец в виде вектора.

###54
Создать класс RationalComplexNumber - комплексное число, компонентами которого являются рациональные дроби. Атрибуты - RationalFraction). Методы:
*	RationalComplexNumber() - конструктор для нулевого комплексного числа;
*	RationalComplexNumber(RationalFraction, RationalFraction) - конструктор комплексного числа с заданными значениями вещественной и мнимой части; в конструкторах устраняйте дублирование кода;
*	RationalComplexNumber add(RationalComplexNumber)  сложение с другим таким числом;
*	RationalComplexNumber sub(RationalComplexNumber) - вычитание;
*	RationalComplexNumber mult(RationalComplexNumber) - умножение;
*	String toString() - строковое представление такого комплексного числа. Только без всяких "2/3 * i + -3/5". Проверяйте знаки, чтобы было красиво: 2/3 * i - 3/5.

###55
Класс RationalComplexVector2D - двумерный вектор, компоненты которого являются объектами класса RationalComplexNumber. Это и есть атрибуты класса. Уже не буду писать, что надо в операциях опираться на методы класса RationalComplexNumber. Методы:
*	RationalComplexVector2D() - конструктор для нулевого вектора (компоненты должны быть равны нулевым рациональным дробям);
*	RationalComplexVector2D(RationalComplexNumber, RationalComplexNumber) -конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
*	RationalComplexVector2D add(RationalComplexVector2D) - сложение вектора с другим вектором;
*	String toString() - строковое представление такого вектора.
*	RationalComplexNumber scalarProduct(RationalComplexVector2D) - скалярное произведение вектора на другой вектор;

###56
Создать класс RationalComplexMatrix2x2 - двумерная матрица из RationalComplexNumber. Аргументы - содержимое матрицы (лучше, разумеется, хранить двумерным массивом, а то замучаетесь). Методы:
*	RationalComplexMatrix2x2() - конструктор для нулевой матрицы;
*	RationalComplexMatrix2x2(RationalComplexNumber) - конструктор для матрицы, у которой каждый элемент равен поданному числу;
*	RationalComplexMatrix2x2(RationalComplexNumber, RationalComplexNumber, RationalComplexNumber, RationalComplexNumber) - конструктор на 4 дробях, в конструкторах устраняйте дублирование кода;
*	RationalComplexMatrix2x2 add(RationalComplexMatrix2x2) - сложение матрицы с другой;
*	RationalComplexMatrix2x2 mult(RationalComplexMatrix2x2) - умножение матрицы на другую матрицу;
*	RationalComplexNumber det() - определитель матрицы;
*	RationalComplexVector2D multVector(RationalComplexVector2D) - умножить матрицу на двумерный комплекснозначный рациональный вектор (считая его столбцом) и возвратить получившийся столбец в виде вектора.

## 15. 57
Придумайте сущности (связанные с реальным миром, IT, Интернетом или чем-либо еще), удовлетворяющие следующим требованиям:

Абстрактный класс
- 2 атрибута,
- 2 конструктора (один использует другой),
- 3 метода (не конструкторы, не set-get) – один не абстрактный, второй абстрактный.

Унаследуйте этот класс в двух других классах. Дочерние классы в добавление к унаследованному от родителей содержат:
+ 1 атрибут,
+ 1 свой метод,
+ реализацию абстрактного метода родителя,
+ переопределение неабстрактного родительского метода,
+ 2 конструктора (один использует родительский конструктор, а другой использует первый).

В методе Main создайте массив из объектов дочерних классов с восходящим преобразованием до родительского класса (по аналогии с Animal, Cat и Dog). Затем покажите работу полиморфизма на примере переопределенных абстрактного и не абстрактного метода (по аналогии с voice() у кошки и собаки).

В заключение приведите для одного из дочерних классов еще один возможный родительский класс (т.е. в других языках мы бы реализовали множественное наследование), чтобы была видна проблема ромбовидного наследования (оба родителя содержат один и тот же по заголовку метод, но имеют его разную реализацию).


## 16. 58
Примитивные типы могут содержать только заданное количество цифр (long – уже 8 байтов, не больше). Но число можно трактовать как набор цифр.
Реализовать:
*	Интерфейс Number – натуральное число. Методы:
o	Number add(Number n) – прибавить целое число n
o	Number sub(Number n) – вычитание из нашего числа числа n. Т.к. n – натуральное, то если n больше числа, то выкинуть исключение NotNaturalNumberException (реализуйте его самостоятельно как наследник от Exception)
o	int compareTo(Number n) – сравнить число с n. Вернуть 1, если число больше n, -1, если меньше, 0, если равно
Далее реализовать 2 класса:
*	SimpleLongNumber – класс, в котором число хранится в примитивном типе long.
*	VeryLongNumber – класс, в котором число хранится как массив цифр или строка цифр.
После реализации классов в методе main создать массив Number [], в котором будут храниться как SimpleLongNumber, так и VeryLongNumber. Вычислить сумму элементов массива (используя add).