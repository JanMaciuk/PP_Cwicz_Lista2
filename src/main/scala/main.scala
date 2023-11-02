import scala.annotation.tailrec


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