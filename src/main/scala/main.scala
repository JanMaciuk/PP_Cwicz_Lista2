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

// Zadanie 5:
@tailrec
private def initSegment[A](list1: List[A], list2: List[A]): Boolean = (list1, list2) match {
  case (Nil, _) => true
  case (_, Nil) => false
  case (head1 :: tail1, head2 :: tail2) => if (head1 == head2) initSegment(tail1, tail2) else false
}

//Zadanie 6:
def replaceNth[A](list: List[A], index: Int, newElement: A): List[A] = (list, index) match {
  case (Nil, _) => Nil  // Pusta lista
  case (head :: tail, 0) => newElement :: tail // dotarłem do szukanego elementu, zamieniam go
  case (head :: tail, i) if (i > 0) => head :: replaceNth(tail, i - 1, newElement) // szukam dalej
  case _ => list  // jeżeli warunek if (i > 0) nie jest spełniony, to podane niepoprawny indeks
}
// Funkcja wykona się w czasie O(n) gdzie n to indeks szukanego elementu, ponieważ musi przejść przez n elementów do szukanego indeksu.



@main
def main(): Unit = {
  //Zadanie 2:
  print("\nZadanie 2 - fibonacci: \n")
  println(fibonacciTailRec(42,0,1,1))
  println(fibonacci(42))

  //Zadanie 4:
  task4()

  //Zadanie 5:
  print("\nZadanie 5 - sprawdzanie początkowego segmentu listy: \n")
  println(initSegment(List(1,2,3), List(1,2,3,4,5)))

  //Zadanie 6:
  print("\nZadanie 6 - zamiana n-tego elementu listy: \n")
  println(replaceNth(List(1,2,3,4,5), 2, 9))

}