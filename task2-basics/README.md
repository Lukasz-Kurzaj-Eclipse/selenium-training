TASK 2 BASICS

Bankomat

użytkownik uruchamia program i otrzymuje w konsoli menu gdzie musi wybrać opcję z dostępnych
1. Wypłata 50 PLN
2. Sprawdź saldo
3. Wypłata gotówki
4. Wyjście

Dostępne konto ma 1000 zł saldo

Po wybraniu Wyjście program kończy działanie.
Po wybraniu opcji 1. Automat pyta czy konieczne jest potwierdzenie wypłaty.
Jeśli pokwitowanie jest konieczne to następuje wypłata(log w konsoli "wypłata 50 PLN") i następnie log "drukowanie potwierdzenia"
i powrót do menu głównego.

Po wybraniu opcji 2 aktualne saldo jest sprawdzane i wyświetlane w logu: "dostępne saldo: XXX PLN" i powrót do menu głównego

Po wybraniu opcji 3 użytkownik musi podać ilość środków do wypłacenia i w drugim kroku czy konieczne będzie pokwitowanie. Dalsze postępowanie jak w przypadku wypłaty 50 PLN.

Przed wypłatą należy sprawdzić czy wypłacana wartość jest mniejsza niż dostępne saldo, bądź równa.

Proszę o użycie takich elementów:

do-while
switch
if-else
