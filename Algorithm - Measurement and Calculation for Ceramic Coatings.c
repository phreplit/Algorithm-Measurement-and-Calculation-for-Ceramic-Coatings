
//  Author: PHNO - Tecnólogo | Pós-Graduado
//  Release Date: 29/11/2024
//  Version: 0.0.0.2v
//  Replit: @PHNO, @PHREPLIT
//  E-mail: phreplit@gmail.com

// Algorithm: Measurement and Calculation for Ceramic Coatings, algorithm built in c, built for professionals in civil engineering and related areas.

#include <stdio.h> // import lib
#include <stdlib.h> 
#include <math.h> 

int menu(); 
void op1(); // header
void op2(); 
void op3();
void op4();
void op8();
void reset_screen();
int menu_programmer();

int menu() { // Menu Function  
int op, c;

printf("\n\t Measurement and Calculation for Ceramic Coatings \n");

printf("\n");
printf("\n\t     Menu    \n");
printf("\n");

printf("\n1. Calculate Square Meter of a Room"); // ex: sala
printf("\n2. Calculate Quantity of Ceramics per M²");
printf("\n3. Calculate Quantity of Ceramic Boxes per M²");
printf("\n4. Exit\n");
printf("\n[8] Info\n");
printf("\n[9] About \n");

printf("\nEnter your choice: "); // option
scanf("%d", &op);

while ((c = getchar()) != '\n' && c != EOF) {
} // clear keyboard buffer.   
return op; 
}

int main() { // Main Function

int op = 0, c;

while (op != -1) { 
op = menu(); 
switch (op) { 
case 1: 
op1(); // function
break; 
case 2: 
op2(); // function
break; 
case 3: 
op3(); // function
break;
case 4:
printf("\n");
printf("\n Finished Algorithm! \n"); // exit
printf("\n");
return 0;
break;
case 8:
op8(); // function
break;
case 9:
menu_programmer();
break; 
default: 
printf("\n");
printf(" Wrong Option!\n");
printf("\n");
//printf("\n");
printf("\nPress enter to return menu...\n");
getchar();
scanf("c\n");
reset_screen();
} 
} 
return 0; 
} 

void op1() { 
int v1;
int v2;
int resultado;
printf("\n");
printf("\nEnter the length of the room: ");
scanf("%d", &v1, stdin);
printf("\n");
printf("\nEnter the room width: ");
scanf("%d", &v2, stdin);
resultado = v1 * v2;
printf("\nThe room has %d square meters.\n", resultado);

printf("\nPress enter to return menu...\n");
getchar();
scanf("c\n");
reset_screen();
return; 
}

void op2() { 
int v1;
int v2 = 4;
int resultado;

printf("\n");
printf("\nEnter how many square meters the room has: ");
scanf("%d", &v1, stdin);
printf("\n");

resultado = (v1 * v2);

printf("\nTo lay %d M² of a room, %d ceramic will be required.\n", v1, resultado);

printf("\nPress enter to return menu...\n");
getchar();
scanf("c\n");
reset_screen();
return; 
}

void op3() {
int v1;
int v2 = 4; // 1 square meter
int resultado;
int calcqtdcaixa;
int cx1 = 8; // 1 ceramic box

printf("\n");
printf("\nEnter how many square meters the room has: ");
scanf("%d", &v1, stdin);
printf("\n");

resultado = (v1 * v2);
calcqtdcaixa = (resultado / cx1);

printf("\nTo lay %d m² of a room, %d ceramic boxes will be required.\n", v1, calcqtdcaixa);

printf("\nPress enter to return menu...\n");
getchar();
scanf("c\n");
reset_screen();
return; 
}

void op8() {
reset_screen();
printf("\nInfo\n");
printf("\nTo Calculate the Square Meter of a Room:\n");
printf("\nWe calculate the length x width, see as an example a room with (3.70 meters long x 2.70 meters wide) we have that L x W = 10M².\n");
printf("\nTo Calculate Ceramic Coatings:\n");
printf("\nTaking a 50cm x 50cm ceramic tile as an example, we have that 2 x 2 ceramic tiles = 4 ceramic tiles, which is equivalent to 1M². This will be the standard calculation: 4 ceramic tiles = 1M². Therefore, any (N) square meters x 4 = the quantity (N) of tiles per square meter.\n");
printf("\nTo Calculate Quantity of Ceramic Boxes: \n");
printf("\nKnowing that each box has 8 ceramic tiles, then for each 1 box of ceramic tiles we have 2m², and then Any (N) square meters x 4 (one m²) = (N) quantity of ceramic tiles and this result divided by a box (8) = the (N) quantity of ceramic boxes to lay a room.\n");
printf("\nImportant information: \n");
printf("\nThis algorithm was built with integer variables so it does not accept numbers with commas e.g.: 2.90 meters change to 3 meters.\n");
printf("\nPress enter to return menu...\n ");
getchar();
scanf("c\n");
reset_screen();
return;
}

void reset_screen(){
system("clear");      // linux
system("tput reset"); // linux
system("Cls"); // windows clear screen
return;
}

int menu_programmer(){
  reset_screen();
  printf("\n Algorithm: Measurement and Calculation for Ceramic Coatings \n");
  printf("\n Author: PHNO ");
  printf("\n Release Date: 29/11/2024 ");
  printf("\n Version: 0.0.0.2v");
  printf("\n Replit: @PHNO, @PHREPLIT");
  printf("\n E-mail: phreplit@gmail.com \n");
  printf("\n Press enter to return menu...\n ");
  getchar();
  scanf("c\n");
  reset_screen();
  return 0;
}
