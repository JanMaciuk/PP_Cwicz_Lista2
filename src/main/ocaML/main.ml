(**Zadanie 2:**)
let rec fibonacci n =
  if n <= 1 then n
  else fibonacci (n - 1) + fibonacci (n - 2)

let rec fibonaccTAilRec searchedStep previousValue currentValue currentStep =
  if currentStep = searchedStep then currentValue
  else fibonaccTAilRec searchedStep currentValue (previousValue + currentValue) (currentStep + 1)

let resultFibonacci = fibonaccTAilRec 10 0 1 1;;
print_int resultFibonacci;;
print_newline();;
