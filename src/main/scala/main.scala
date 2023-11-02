import scala.annotation.tailrec

/* Zadanie 1:
Dla evenR(3) w scali głębokosć stosu to 4
evenR(3) => oddR(2) => evenR(1) => oddR(0)
W ocaML głębokość stosu to 1, ponieważ kompilator optymalizuje rekurencję ogonową do pętli.
*/

// Zadanie 2:
private def fibonacci(n: Int): Int = {
  if (n <= 1) n
  else fibonacci(n - 1) + fibonacci(n - 2)
}
@tailrec
private def fibonacciTailRec(searchedStep:Int, previousValue: Int, currentValue: Int, currentStep: Int): Int = {
  if (currentStep == searchedStep) currentValue
  else fibonacciTailRec(searchedStep,currentValue, previousValue + currentValue, currentStep + 1)
} // Wywoływanie n razy, za każdym razem obliczając kolejną liczbę fibonacciego
// druga funkcja jest szybsza, kompilator optymalizuje rekurencje ogonową do pętli, redukując rozmiar stosu i liczbę wywołań.






@main
def main(): Unit = {
  println("Hello world!")
}