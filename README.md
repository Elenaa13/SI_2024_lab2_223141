Елена Талеска 223141 
_______________________________________________________________________________________________________________________

2. Control Flow Graph

![CFG](https://github.com/Elenaa13/SI_2024_lab2_223141/assets/119577244/757d3641-8052-4d48-8d06-418192bea864)

________________________________________________________________________________________________________________________


3. Цикломатска комплексност на граф

Цикломатската комплексност на графот е 10. 31 - 23 + 2 x 1 = 10
E - N + 2xP (каде што E-ребра, N-јазли, P-програми).

________________________________________________________________________________________________________________________


4. Тест случаи - Every statement

![Every statement](https://github.com/Elenaa13/SI_2024_lab2_223141/assets/119577244/5541c0c4-a1a3-4a55-b920-52bfc37badf3)

- Сл.1: Се фрла исклучок RuntimeException:"allitems list can't be null!" (кодот завршува веднаш).
- Сл.2: Се фрла исклучок RuntimeException:"No barcode!". (имаме null баркод).
- Сл.3: Се фрла исклучок RuntimeException:"Invalid character in item barcode!" (баркодот содржи невалиден знак).
- Сл.4: Вкупната цена се пресметува и се споредува со payment=301, која е помала или еднаква па ова е точно.

__________________________________________________________________________________________________________________________


5. Тест случаи - Multiple Condition

if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)
== '0')

- ТТТ - Сите услови се точни, со тоа и целиот израз е вистинит. (true)

- TTF - Првите два услови се точни, но последниот не е точен, баркодот мора да започнува на 0. (false)

- TFT/TFF - Првиот услов е точен, но вториот не е точен, не може попустот да биде помал или еднаков на 0, па затоа третиот услов не го проверуваме бидејќи не ни е важен. (false)

- FFF/FTF/FFT/FTT - Првиот услов не е точен па останатите услови не ни се важни. (false)

Со ова ги опфативме сите можни услови, 2^3=8 можни услови.