import scala.annotation.tailrec

/* Zadanie 1:
Dla evenR(3) w scali głębokosć stosu to 4
evenR(3) => oddR(2) => evenR(1) => oddR(0)
W ocaML głębokość stosu to 1, ponieważ kompilator optymalizuje rekurencję ogonową do pętli.
*/

// Zadanie 2:
private def fibonacci(n: Int): Long = {
  if (n <= 1) n
  else fibonacci(n - 1) + fibonacci(n - 2)
}
@tailrec
private def fibonacciTailRec(searchedStep:Int, previousValue: Long, currentValue: Long, currentStep: Int): Long = {
  if (currentStep == searchedStep) currentValue
  else fibonacciTailRec(searchedStep,currentValue, previousValue + currentValue, currentStep + 1)
} // Wywoływanie n razy, za każdym razem obliczając kolejną liczbę fibonacciego
// druga funkcja jest szybsza, kompilator optymalizuje rekurencje ogonową do pętli, redukując rozmiar stosu i liczbę wywołań.

// Zadanie 4:
private def task4(): Unit  = {
  val listA = List(-2, -1, 0, 1, 2)
  val List(_, _, x1, _, _) = listA
  val listB = List((1, 2), (0, 1))
  val List((_, _), (x2, _)) = listB
  print("\nZadanie 4 - dopasowanie do wzorca: \n")
  println("x1: " + x1)
  println("x2: " + x2)
}







@main
def main(): Unit = {
  //Zadanie 2:
  print("\nZadanie 2 - fibonacci: \n")
  println(fibonacciTailRec(42,0,1,1))
  println(fibonacci(42))

  //Zadanie 4:
  task4()


}