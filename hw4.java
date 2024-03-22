 public class hw4 { public static void main(String[] args) {
//Задача 1
int age = 50;
if (age &gt;= 18) {
System.out.println("Вам " + age + ", вы совершеннолетний.");
} else {
System.out.println("Вы не достигли совершеннолетия, вам нужно подождать");
}
//Задача 2
int temperature = 7;
if (temperature &lt;= 5) {
System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
} else {
System.out.println("Можно идти без шапки");
}
//Задача 3
int speed = 70;
if (speed < 60) {
System.out.println("Можно ездить спокойно");
} else {
System.out.println("Если скорость " + speed + " придется заплатить штраф.");
}
//Задача 4
int ageTask4 = 40;
if (ageTask4 &gt;= 2 &amp;&amp; ageTask4 &lt;= 6) {
System.out.println("Если возраст человека равен " + ageTask4 +
", то ему нужно ходить в детский сад.");
}
else if (ageTask4 &gt;= 7 &amp;&amp; ageTask4 &lt;= 17) {
System.out.println("Если возраст человека равен " + ageTask4 +
", то ему нужно ходить в школу.");
}
else if  (ageTask4 &gt;= 18 &amp;&amp; ageTask4 &lt;= 24) {
System.out.println("Если возраст человека равен " + ageTask4 +
", то ему нужно ходить в универ.");
}
else (ageTask4 &gt; 24) {
System.out.println("Если возраст человека равен " + ageTask4 +
", то ему нужно ходить на работу.");
}
//Задача 5
int ageTask5 = 16;
if (ageTask5 &lt; 5) {
System.out.println("Если возраст ребенка равен " + ageTask5 +
", то ему нельзя кататься на аттракционе.");
}
if (ageTask5 &gt;= 5 &amp;&amp; ageTask5 &lt; 14) {
System.out.println("Если возраст ребенка равен " + ageTask5 +
", то ему можно кататься на аттракционе в сопровождении взрослого.");
}
if (ageTask5 &gt;= 14) {
System.out.println("Если возраст ребенка равен " + ageTask5 +
", то ему можно кататься на аттракционе без сопровождения взрослого.");
}
//Задача 6
int place = 170;
if (place <= 60 && place > 0) {
System.out.println("Есть сидячее место");
} else if (place &gt;= 61 &amp;&amp; place &lt;= 102) {
System.out.println("Есть стоячее место");
} else {
System.out.println("Вагон уже полностью заполнен");
}
//Задача 7
int one = 1;
int two = 6;
int three = 300;
boolean moreThanOne = one &gt; two &amp;&amp; one &gt; three;
boolean moreThanTwo = two &gt; one &amp;&amp; two &gt; three;
if (moreThanOne) {
System.out.println("Большее чисто один.");
} else if (moreThanTwo) {
System.out.println("Большее число два.");
} else {
System.out.println("Большее число три.");
}
} }