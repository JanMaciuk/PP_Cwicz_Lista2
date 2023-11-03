(*
    compiling:
    cd src
    cd main
    cd ocaML
    ocamlc -o main.byte main.ml
    ./main.byte
*)

(*Zadanie 2:*)
let rec fibonacci n =
  if n <= 1 then n
  else fibonacci (n - 1) + fibonacci (n - 2)

let rec fibonaccTAilRec searchedStep previousValue currentValue currentStep =
  if currentStep = searchedStep then currentValue
  else fibonaccTAilRec searchedStep currentValue (previousValue + currentValue) (currentStep + 1)

let resultFibonacci = fibonaccTAilRec 10 0 1 1;;
print_int resultFibonacci;;
print_newline();;

(*Zadanie 4:*)
let listA = [-2, -1, 0, 1, 2]
let [_, _, x1, _, _] = listA

let listB = [[1, 2], [0, 1]]
let [[_, _], [x2, _]] = listB


(*Zadanie 5:*)
let rec initSegment list1 list2 =
  match (list1, list2) with
  | ([], _) -> true
  | (_, []) -> false
  | (head1::tail1, head2::tail2) -> if head1 = head2 then initSegment tail1 tail2 else false
  let list1 = [1; 2; 3]
  let list2 = [1; 2; 3; 4; 5]
  let result = initSegment list1 list2 
  let _ = print_string (string_of_bool result)

(*Zadanie 6:*)
let rec replaceNth list index newElement =
  match (list, index) with
  | ([], _) -> []  (* Pusta lista *)
  | (head :: tail, 0) -> newElement :: tail  (* dotarłem do szukanego elementu, zamieniam go *)
  | (head :: tail, i) when i > 0 -> head :: (replaceNth tail (i - 1) newElement)  (* szukam dalej *)
  | _ -> list (* jeżeli warunek if (i > 0) nie jest spełniony, to podane niepoprawny indeks *)

